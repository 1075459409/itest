/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.itest.jacocos.parser.infos.CaseErrInfo;
import org.itest.jacocos.parser.infos.CaseFailureInfo;
import org.itest.utils.JpfFileUtil;
import org.itest.utils.Jpfw3cXmlUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SurefireXmlReport {
	private static final Logger logger = LogManager.getLogger();
	/**
	 * 
	 * @param strPomPath
	 * @param list
	 * @return
	 * @date 2022年4月23日 上午8:59:02
	 * @author org.itest
	 */
	public int parseErrorXmlReports(String strPomPath, List<CaseErrInfo> list) {

		int iTestCaseFileCount = 0;
		try {
			logger.info("input xml report path:" + strPomPath);
			Vector<String> vFiles = new Vector<String>();
			strPomPath = JpfFileUtil.getSurefireReportsPath(strPomPath);

			JpfFileUtil.getFiles(strPomPath, vFiles, ".xml");
			logger.info("find surefire reports count:" + vFiles.size());
			for (int i = 0; i < vFiles.size(); i++) {
				if (vFiles.get(i).endsWith("Test.xml")) {
					parseErrorXmlReport(vFiles.get(i), list);
				}
			}
			iTestCaseFileCount = vFiles.size();
			vFiles.clear();
		} catch (Exception ex) {
			logger.error("parseErrorXmlReports:" + strPomPath, ex);
		}
		return iTestCaseFileCount;
	}

	/**
	 * 
	 * @param strUtXmlFileNameFileName
	 * @param list
	 * @date 2022年4月23日 上午8:59:06
	 * @author org.itest
	 */
	public void parseErrorXmlReport(String strUtXmlFileNameFileName, List<CaseErrInfo> list) {
		try {
			// Element ssSuite = paraseXMLFile("testsuite", strUtFileName);
			// logger.debug(ssSuite.toString());
			// logger.debug(ssSuite.getAttribute("name"));
			Jpfw3cXmlUtil.stripNonValidXMLChars(strUtXmlFileNameFileName);
			NodeList nl = Jpfw3cXmlUtil.getNodeList("testcase", strUtXmlFileNameFileName);
			// logger.debug(strUtXmlFileNameFileName);

			for (int i = 0; i < nl.getLength(); i++) {
				Element ss = (Element) nl.item(i);

				if (logger.isTraceEnabled()) {
					logger.trace(ss.getAttribute("classname"));
					logger.trace(ss.getAttribute("name"));
					logger.trace(ss.getAttribute("time"));
				}
				NodeList names = ss.getElementsByTagName("error");
				if (names.getLength() > 0) {
					CaseErrInfo cUtErrInfo = new CaseErrInfo();
					cUtErrInfo.setUtFileName(strUtXmlFileNameFileName);
					cUtErrInfo.setUtClassName(ss.getAttribute("classname"));
					cUtErrInfo.setUtMethodName(ss.getAttribute("name"));
					cUtErrInfo.setUtTime(ss.getAttribute("time"));

					Element e = (Element) names.item(0);
					cUtErrInfo.setErrMsg(getEscapeStr(e.getAttribute("message")));
					cUtErrInfo.setErrType(e.getAttribute("type"));

					Node t = e.getFirstChild();

					String[] strErrMsgs = t.getNodeValue().replaceAll("\t", "").split("\n");
					cUtErrInfo.setErrCauseList(Arrays.asList(strErrMsgs));
					/*
					 * logger.debug("strErrMsgs.length=" + strErrMsgs.length); for (int j = 0; j <
					 * strErrMsgs.length; j++) { // logger.debug(strErrMsgs[j]); strErrMsgs[j] =
					 * strErrMsgs[j].trim(); logger.debug(strErrMsgs[j]);
					 * 
					 * cUtErrInfo.getErrCauseList().add(strErrMsgs[j]); }
					 */
					if (logger.isDebugEnabled()) {
						logger.debug(cUtErrInfo.toString());
					}
					list.add(cUtErrInfo);
				}

			}
			if (logger.isDebugEnabled()) {
				logger.debug(strUtXmlFileNameFileName + " errors=" + list.size() + "; tests=" + nl.getLength());
			}
		} catch (Exception ex) {
			logger.error(strUtXmlFileNameFileName, ex);
		}
	}

	/**
	 * @category 去掉XML中读出的换行符
	 * @param strInput
	 * @return
	 */
	public String getEscapeStr(String strInput) {
		if (strInput == null) {
			return "";
		}
		// return StringEscapeUtils.escapeJava(strInput).replaceAll("\\\\n", "");
		strInput = strInput.replaceAll("\t", "").replaceAll("\n", "");
		return strInput;
	}

	/**
	 * 
	 * @param strUtReportPath
	 * @param list
	 * @return
	 * @date 2022年4月23日 上午8:59:12
	 * @author org.itest
	 */
	public int parseFailureXmlReports(String strUtReportPath, List<CaseFailureInfo> list) {
		int iTestCaseFileCount = 0;
		try {
			logger.info("input xml report path:" + strUtReportPath);
			strUtReportPath = JpfFileUtil.getSurefireReportsPath(strUtReportPath);
			Vector<String> vFiles = new Vector<String>();

			JpfFileUtil.getFiles(strUtReportPath, vFiles, ".xml");
			logger.info("find surefire reports count:" + vFiles.size());

			if (vFiles.size() == 0) {
				logger.info("no surefire report find,please run first: mvn install -Dmaven.test.failure.ignore=true");
				return 0;
			}
			iTestCaseFileCount = vFiles.size();
			for (int i = 0; i < vFiles.size(); i++) {
				if (vFiles.get(i).endsWith("Test.xml")) {
					parseFailureXmlReport(vFiles.get(i), list);
				}
			}
			vFiles.clear();
		} catch (Exception ex) {
			logger.error("parseFailureXmlReports:" + strUtReportPath, ex);
		}
		return iTestCaseFileCount;
	}

	/**
	 * 
	 * @param strUtXmlFileNameFileName
	 * @param list
	 * @date 2022年4月23日 上午8:59:17
	 * @author org.itest
	 */
	public void parseFailureXmlReport(String strUtXmlFileNameFileName, List<CaseFailureInfo> list) {
		try {

			Jpfw3cXmlUtil.stripNonValidXMLChars(strUtXmlFileNameFileName);
			if (logger.isDebugEnabled()) {
				logger.debug(strUtXmlFileNameFileName);
			}
			String strXmlFileClassName = Jpfw3cXmlUtil.getRootElementAttribute("name", strUtXmlFileNameFileName);
			int iFailureCount = list.size();
			NodeList nl = Jpfw3cXmlUtil.getNodeList("testcase", strUtXmlFileNameFileName);
			if (logger.isTraceEnabled()) {
				logger.trace("testcase count:" + nl.getLength());
			}
			for (int i = 0; i < nl.getLength(); i++) {
				Element ss = (Element) nl.item(i);
				if (!ss.getAttribute("classname").trim().equalsIgnoreCase(strXmlFileClassName)) {
					continue;
				}

				if (logger.isTraceEnabled()) {
					logger.trace(ss.getAttribute("classname"));
					logger.trace(ss.getAttribute("name"));
				}

				// 使用JAVADOC产生的CASE不做修复
				// 20190717
				if (ss.getAttribute("name").trim().indexOf("_Doc") > 0) {
					continue;
				}
				NodeList failureNode = ss.getElementsByTagName("failure");

				if (failureNode.getLength() == 1) {

					Element e = (Element) failureNode.item(0);
					CaseFailureInfo cUtFailureInfo = new CaseFailureInfo();
					cUtFailureInfo.setUtClassName(ss.getAttribute("classname"));
					cUtFailureInfo.setUtMethodName(ss.getAttribute("name"));
					cUtFailureInfo.setUtTime(ss.getAttribute("time"));
					cUtFailureInfo.setFailureMsg(e.getAttribute("message"));
					cUtFailureInfo.setFailureType(e.getAttribute("type"));
					String[] strErrMsgs = e.getFirstChild().getNodeValue().split("\n");
					cUtFailureInfo.setFailureCauseList(Arrays.asList(strErrMsgs));

					// JpfPrintClass.printList(cUtFailureInfo.getFailureCauseList());

					NodeList systemErrNode = ss.getElementsByTagName("system-err");
					if (systemErrNode != null && systemErrNode.getLength() == 1) {
						Element e1 = (Element) systemErrNode.item(0);
						cUtFailureInfo.setSystem_Err(e1.getFirstChild().getNodeValue());
					}

					if (logger.isDebugEnabled()) {
						logger.debug(cUtFailureInfo.toString());
					}
					list.add(cUtFailureInfo);
				}

			}
			if (logger.isDebugEnabled()) {
				logger.debug(strUtXmlFileNameFileName + " Failure=" + iFailureCount + "; tests=" + nl.getLength());
			}
		} catch (Exception ex) {
			logger.error(ex);
		}
	}
}
