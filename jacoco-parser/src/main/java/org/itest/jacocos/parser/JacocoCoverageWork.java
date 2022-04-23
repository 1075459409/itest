/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.itest.jacocos.parser.infos.LineCoverageInfo;
import org.itest.jacocos.parser.infos.MethodPosInfo;
import org.itest.utils.FilterClassUtil;
import org.itest.utils.JacocosUtil;
import org.itest.utils.JpfCloseUtil;
import org.itest.utils.JpfFileUtil;
import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.data.ExecutionData;
import org.jacoco.core.data.ExecutionDataReader;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.data.IExecutionDataVisitor;
import org.jacoco.core.data.ISessionInfoVisitor;
import org.jacoco.core.data.SessionInfo;


public class JacocoCoverageWork {
	private static final Logger logger = LogManager.getLogger();


	/**
	 * 
	 * @param strPomPath
	 * @Date :2021年11月29日下午9:57:21
	 */
	private void checkJacoco(final String strPomPath) {
		String strJacocoFileName = JpfFileUtil.getJacocoFile(strPomPath);
		if (JpfFileUtil.isFileExist(strJacocoFileName)) {
			logger.info("JacocoFileExist:{}", strJacocoFileName);
			return;
		}
		// run test
	}

	/**
	 * 
	 * @param mapMethod
	 * @param strFindKey
	 * @return
	 * @Date :2021年3月14日下午7:24:24
	 */
	public static String getIncludeKey(Map<String, ? extends Object> mapMethod, String strFindKey) {
		if (null == strFindKey || 0 == strFindKey.trim().length()) {
			return null;
		}

		if (logger.isTraceEnabled()) {
			logger.trace(strFindKey);
		}
		for (String strKey : mapMethod.keySet()) {
			if (logger.isTraceEnabled()) {
				logger.trace(strKey);
			}
			if (strKey.indexOf(strFindKey) >= 0) {
				return strKey;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param strPomPath
	 * @param strJacocofile
	 * @param setFilter
	 * @return
	 * @Date 2022年4月23日
	 * @author org.itest
	 */
	public Map<String, List<LineCoverageInfo>> readCoverage(final String strPomPath, final String strJacocofile,
			Set<String> setFilter) {

		StringBuffer sb = new StringBuffer();
		FileInputStream in = null;
		StringBuffer sb2 = new StringBuffer();

		Map<String, List<MethodPosInfo>> mapMethodPosInfo = new HashMap<String, List<MethodPosInfo>>();
		Map<String, List<LineCoverageInfo>> mapCoverage = new HashMap<String, List<LineCoverageInfo>>();
		try {

			in = new FileInputStream(strJacocofile);
			final ExecutionDataReader reader = new ExecutionDataReader(in);

			reader.setSessionInfoVisitor(new ISessionInfoVisitor() {
				@Override
				public void visitSessionInfo(final SessionInfo info) {
					sb2.setLength(0);
					sb2.append(info.getId());
					sb.setLength(0);
					sb.append(JpfFileUtil.getSourceClass(info.getId()));
					if (logger.isDebugEnabled()) {
						logger.debug(sb2);
						logger.debug(sb);
					}
				}
			});
			reader.setExecutionDataVisitor(new IExecutionDataVisitor() {
				@Override
				public void visitClassExecution(final ExecutionData data) {

					if (sb2.length() > 0 && sb.toString().equalsIgnoreCase(data.getName())) {
						if (logger.isDebugEnabled()) {
							logger.debug(sb2);
							logger.debug(data.getName());
						}
						String strkey = sb2.toString().replace("%%", ";");
						if (logger.isDebugEnabled()) {
							logger.debug("strkey:{}", strkey);
						}

						logger.debug(FilterClassUtil.isFilterClass(strkey, setFilter));

						if (FilterClassUtil.isFilterClass(strkey, setFilter)) {

							List<LineCoverageInfo> listCoverage = new ArrayList<LineCoverageInfo>();
							// 单测二进制文件
							String strClassFileName = JpfFileUtil.getClassFileNameByClassName(strPomPath,
									data.getName());
							// logger.info("isContains:" + isContains(mapResult, sb2.toString(),
							// data.getName()));
							// 源文件
							String strSrcMainJavaFileName = JpfFileUtil.getSrcMainJavaFileNameByClassName(strPomPath,
									data.getName());

							String strTestedMethodName = JpfFileUtil.getTestedMethodName(sb2.toString());
	
							if (logger.isDebugEnabled()) {
								logger.debug("src/main/java:{}", strSrcMainJavaFileName);
								logger.debug("MethodName:{}", strTestedMethodName);
							}
							try {

								CoverageBuilder coverageBuilder = new CoverageBuilder();

								ExecutionDataStore cExecutionDataStore = new ExecutionDataStore();
								cExecutionDataStore.put(data);
								Analyzer analyzer = new Analyzer(cExecutionDataStore, coverageBuilder);
								analyzer.analyzeAll(new File(strClassFileName));

								for (final IClassCoverage cc : coverageBuilder.getClasses()) {

									if (logger.isDebugEnabled()) {
										logger.debug("Coverage of class " + cc.getName());
										logger.debug("lines" + cc.getLineCounter());
										if (logger.isTraceEnabled()) {
											logger.trace("instructions" + cc.getInstructionCounter());
											logger.trace("branches" + cc.getBranchCounter());
											logger.trace("methods" + cc.getMethodCounter());
											logger.trace("complexity" + cc.getComplexityCounter());
										}
									}

									
										for (int i = cc.getFirstLine(); i <= cc.getLastLine(); i++) {
											/*
											 * System.out.println( "Line " + Integer.valueOf(i) + " " +
											 * cc.getLine(i).getStatus());
											 */
											
											LineCoverageInfo coverageInfo = new LineCoverageInfo();
											coverageInfo.setR(i);
											coverageInfo.setS(cc.getLine(i).getStatus());
											listCoverage.add(coverageInfo);
										}
									
								}
								mapCoverage.put(strkey, listCoverage);
								// mapCoverage
							} catch (Exception e) {
								logger.error("readCoverage", e);
							}

						}
					}

				}

			});
			reader.read();
			mapMethodPosInfo.clear();
			if (logger.isDebugEnabled()) {
				logger.debug("printmapCoverage");
				JacocosUtil.printMap(mapCoverage);
			}

		} catch (Exception e) {
			logger.error("readCoverage", e);
		} finally {
			JpfCloseUtil.close(in);
		}
		return mapCoverage;
	}

}
