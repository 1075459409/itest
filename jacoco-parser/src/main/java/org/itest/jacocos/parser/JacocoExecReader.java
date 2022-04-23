/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.itest.jacocos.parser.infos.CaseErrInfo;
import org.itest.jacocos.parser.infos.CaseFailureInfo;
import org.itest.jacocos.parser.infos.CoverageInfo;
import org.itest.utils.JacocosUtil;
import org.itest.utils.JpfClassUtil;
import org.itest.utils.JpfCloseUtil;
import org.itest.utils.JpfFileUtil;
import org.jacoco.core.data.ExecutionData;
import org.jacoco.core.data.ExecutionDataReader;
import org.jacoco.core.data.IExecutionDataVisitor;
import org.jacoco.core.data.ISessionInfoVisitor;
import org.jacoco.core.data.SessionInfo;

public class JacocoExecReader {
	private static final Logger logger = LogManager.getLogger();

	/**
	 * 
	 * @param strPomPath
	 * @return
	 * @throws Exception
	 * @date 2021年4月23日 上午8:56:53
	 * @author org.itest
	 */
	public Map<String, CoverageInfo> getSrcClass(final String strPomPath) throws Exception {

		HashSet<String> hset = getSrcMainClass(strPomPath);
		return dump2(strPomPath, JpfFileUtil.getJacocoFile(strPomPath), hset);

	}

	/**
	 * 
	 * @param strPomPath
	 * @return
	 * @throws Exception
	 * @date 2020年12月3日下午12:14:19
	 * @author org.itest
	 */
	private HashSet<String> getSrcMainClass(String strPomPath) throws Exception {
		HashSet<String> hSet = new HashSet<String>();
		Vector<String> vFile = new Vector<String>();
		String strMainSrcPath = JpfFileUtil.getSrcMainJavaPath(strPomPath);
		JpfFileUtil.getFiles(strMainSrcPath, vFile, ".java");
		for (String str : vFile) {
			hSet.add(JpfClassUtil.getClassNameWithSlash(JpfFileUtil.getFullClassNameBySrcFileName(str)));
		}
		if (logger.isDebugEnabled()) {
			logger.debug("find src java file count:{}", hSet.size());
		}
		return hSet;
	}


	/**
	 * 
	 * @param strPomPath
	 * @param strKeyClass
	 * @param hset
	 * @return
	 * @throws IOException
	 * @date 2021年4月23日 上午8:57:49
	 * @author org.itest
	 */
	public int readDump(final String strPomPath, final String strKeyClass, HashSet<String> hset) throws IOException {

		String strJacocoFileName = JpfFileUtil.getJacocoFile(strPomPath);
		if (!JpfFileUtil.isFileExist(strJacocoFileName)) {
			return 0;
		}
		String strData = dump(strJacocoFileName, strKeyClass);

		return dump(strData, hset);
	}


	/**
	 * 
	 * @param strData
	 * @param hSet
	 * @return
	 * @throws IOException
	 * @date 2021年4月23日 上午8:57:59
	 * @author org.itest
	 */
	private int dump(final String strData, Set<String> hSet) throws IOException {
		// System.out.println("CLASS ID HITS/PROBES CLASS NAME");
		int iCaseCount = 0;
		HashSet<String> setCoverage = new HashSet<String>();
		String[] strDatas = strData.split("\n");
		logger.info(strDatas.length);

		for (int i = 0; i < strDatas.length; i++) {
			String strNewData = strDatas[i];
			logger.info(strNewData);
			if (strNewData.startsWith("[") && strNewData.endsWith("]")) {
				if (setCoverage.contains(strNewData)) {
					hSet.add(strDatas[i - 1]);
				} else {
					setCoverage.add(strNewData);
				}
				iCaseCount++;
			}
		}

		setCoverage.clear();

		if (logger.isDebugEnabled()) {
			logger.debug("重复的方法数量:{}", hSet.size());
			JacocosUtil.printSet(hSet);
		}
		return iCaseCount;
	}

	/**
	 * 
	 * @param strUtClassName
	 * @return
	 * @date 2022年4月23日 上午8:58:10
	 * @author org.itest
	 */
	private String getClassName(String strUtClassName) {
		if (JacocosUtil.isEmpty(strUtClassName)) {
			return null;
		}
		int iPos = strUtClassName.indexOf("_");
		if (iPos <= 0) {
			return null;
		}
		strUtClassName = strUtClassName.substring(0, iPos);
		return JpfClassUtil.getClassNameWithSlash(strUtClassName);
	}

	/**
	 * 
	 * @category 功能
	 * @param strPomPath
	 * @return
	 * @Date :2021年2月10日上午11:37:25
	 */
	protected Map<String, CoverageInfo> getUnUsedCase(String strPomPath) {
		SurefireXmlReport cSurefireXmlReport = new SurefireXmlReport();
		// for err
		List<CaseErrInfo> listCaseErrInfo = new ArrayList<>();
		cSurefireXmlReport.parseErrorXmlReports(strPomPath, listCaseErrInfo);
		if (logger.isDebugEnabled()) {
			logger.debug("listCaseErrInfo.size():{}", listCaseErrInfo.size());
		}

		// for err
		List<CaseFailureInfo> listCaseFailureInfo = new ArrayList<>();
		cSurefireXmlReport.parseFailureXmlReports(strPomPath, listCaseFailureInfo);
		if (logger.isDebugEnabled()) {
			logger.debug("listCaseFailureInfo.size():{}", listCaseFailureInfo.size());
		}
		// {"cn/luischen/aspect/WebLogAspect":{"hsetCoverage":["[true, true, false,
		// false, false, false, false, false, false, false, false, false, false, false,
		// false, true, true, false, false, false, false, false, false,
		// true]"],"hsetDupMethod":[]}}

		Map<String, CoverageInfo> mapJacoco = new HashMap<String, CoverageInfo>();

		String strClassName = null;

		for (CaseFailureInfo cCaseFailureInfo : listCaseFailureInfo) {
			strClassName = getClassName(cCaseFailureInfo.getUtClassName());
			if (logger.isDebugEnabled()) {
				logger.debug(cCaseFailureInfo.getUtClassName());
				logger.debug(strClassName);
			}
			if (strClassName == null) {
				continue;
			}
			CoverageInfo cCoverageInfo = mapJacoco.get(strClassName);
			if (cCoverageInfo == null) {
				cCoverageInfo = new CoverageInfo();

				cCoverageInfo.getHsetDupMethod()
						.add(cCaseFailureInfo.getUtClassName() + "%%" + cCaseFailureInfo.getUtMethodName());
				mapJacoco.put(strClassName, cCoverageInfo);
			} else {
				cCoverageInfo.getHsetDupMethod()
						.add(cCaseFailureInfo.getUtClassName() + "%%" + cCaseFailureInfo.getUtMethodName());
				mapJacoco.put(strClassName, cCoverageInfo);
			}
		}

		for (CaseErrInfo cCaseErrInfo : listCaseErrInfo) {

			strClassName = getClassName(cCaseErrInfo.getUtClassName());
			if (logger.isDebugEnabled()) {
				logger.debug(cCaseErrInfo.getUtClassName());
				logger.debug(strClassName);
			}
			if (strClassName == null) {
				continue;
			}
			CoverageInfo cCoverageInfo = mapJacoco.get(strClassName);
			if (cCoverageInfo == null) {
				cCoverageInfo = new CoverageInfo();

				cCoverageInfo.getHsetDupMethod()
						.add(cCaseErrInfo.getUtClassName() + "%%" + cCaseErrInfo.getUtMethodName());
				mapJacoco.put(strClassName, cCoverageInfo);
			} else {
				cCoverageInfo.getHsetDupMethod()
						.add(cCaseErrInfo.getUtClassName() + "%%" + cCaseErrInfo.getUtMethodName());
				mapJacoco.put(strClassName, cCoverageInfo);
			}
		}
		if (logger.isDebugEnabled()) {
			logger.debug("mapJacoco.size():{}", mapJacoco.size());
		}

		return mapJacoco;

	}

	/**
	 * 
	 * @category 功能
	 * @param file
	 * @param hset
	 * @return
	 * @throws IOException
	 * @Date :2020年11月24日下午2:52:40
	 */
	private Map<String, CoverageInfo> dump2(final String strPomPath, final String strJacocofile,
			final HashSet<String> hset) throws IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("exec file: {}", strJacocofile);
		}
		if (!JpfFileUtil.isFileExist(strJacocofile)) {
			logger.warn("jacoco.exec Not Exist:{}", strJacocofile);
			return null;
		}

		// StringBuffer sb = new StringBuffer();
		FileInputStream in = null;
		StringBuffer sb2 = new StringBuffer();

		Map<String, CoverageInfo> mapJacoco = getUnUsedCase(strPomPath);

		try {

			in = new FileInputStream(strJacocofile);
			final ExecutionDataReader reader = new ExecutionDataReader(in);

			reader.setSessionInfoVisitor(new ISessionInfoVisitor() {
				@Override
				public void visitSessionInfo(final SessionInfo info) {
					sb2.setLength(0);
					if (logger.isDebugEnabled()) {
						logger.debug(info.getId());
					}
					sb2.append(info.getId());

				}
			});
			reader.setExecutionDataVisitor(new IExecutionDataVisitor() {
				@Override
				public void visitClassExecution(final ExecutionData data) {
					// logger.debug("{} sb2={} ",data.getName(),sb2);
					if (sb2.length() > 0 && hset.contains(data.getName())) {
						if (logger.isDebugEnabled()) {
							logger.debug(sb2);
							logger.debug(data.getName());
							logger.debug(Arrays.toString(data.getProbes()));
							// logger.debug(JpfClassUtil.getClassNameWithDot(data.getName()));
						}
						if (sb2.toString().startsWith(JpfFileUtil.getClassNameWithDot(data.getName()))) {
							// sb.append(Arrays.toString(data.getProbes())).append("\n");
							// hSet.add(data.getName());
							CoverageInfo cCoverageInfo = mapJacoco.get(data.getName());

							if (cCoverageInfo == null) {
								cCoverageInfo = new CoverageInfo();
								cCoverageInfo.getHsetCoverage().add(Arrays.toString(data.getProbes()));
								mapJacoco.put(data.getName(), cCoverageInfo);
							} else {
								// 判断是否是失败或异常CASE
								if (cCoverageInfo.getHsetDupMethod().contains(sb2.toString())) {
									if (logger.isDebugEnabled()) {
										logger.debug(sb2.toString());
									}
								} else {
									if (cCoverageInfo.getHsetCoverage().contains(Arrays.toString(data.getProbes()))) {
										cCoverageInfo.getHsetDupMethod().add(sb2.toString());
									} else {
										cCoverageInfo.getHsetCoverage().add(Arrays.toString(data.getProbes()));
									}
									mapJacoco.put(data.getName(), cCoverageInfo);
								}
							}
						}
					}

				}
			});
			reader.read();
			if (logger.isDebugEnabled()) {
				logger.debug("jacoco 分析结果数量:{}", mapJacoco.size());
				JacocosUtil.printMap(mapJacoco);
			}

			hset.clear();
			return mapJacoco;
		} finally {
			JpfCloseUtil.close(in);
		}

	}

	/**
	 * 
	 * @category @param file
	 * @param strClassKey
	 * @return
	 * @throws IOException
	 * @since 2021年1月9日
	 */
	private String dump(final String file, final String strClassKey) throws IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("exec file: {}", file);
			logger.debug("strClassKey: {}", strClassKey);
		}
		// System.out.println("CLASS ID HITS/PROBES CLASS NAME");
		StringBuffer sb = new StringBuffer();
		FileInputStream in = null;
		try {

			in = new FileInputStream(file);
			final ExecutionDataReader reader = new ExecutionDataReader(in);

			reader.setSessionInfoVisitor(new ISessionInfoVisitor() {
				@Override
				public void visitSessionInfo(final SessionInfo info) {
					logger.debug(info.getId());
					sb.append(info.getId()).append("\n");

				}
			});
			reader.setExecutionDataVisitor(new IExecutionDataVisitor() {
				@Override
				public void visitClassExecution(final ExecutionData data) {
					// logger.debug(strClassKey);
					if (data.getName().startsWith(strClassKey)) {
						if (logger.isDebugEnabled()) {
							logger.debug(Arrays.toString(data.getProbes()));
							logger.debug(data.getName());
							sb.append(Arrays.toString(data.getProbes())).append("\n");
						}
					}
				}
			});
			reader.read();

		} finally {
			JpfCloseUtil.close(in);
		}

		// System.out.println(sb);
		return sb.toString();
	}
}
