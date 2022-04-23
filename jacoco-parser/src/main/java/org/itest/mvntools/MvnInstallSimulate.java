/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.mvntools;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.itest.utils.JpfClassUtil;
import org.itest.utils.JpfFileUtil;
import org.itest.utils.Jpfw3cXmlUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MvnInstallSimulate {
	private static final Logger logger = LogManager.getLogger();

	/**
	 * @category 功能
	 * @param strPomPath
	 * @Date :2022年4月11日下午4:41:55
	 */
	private void runCmdInstall(MvnInfo cMvnInfo, String strPomPath) {
		// 1. find module
		// 2.1 jar:jar
		// 2.2 find local repo
		// 2.3 move jar
		// 2.4 move pom
		long start = System.currentTimeMillis();
		try {
			List<String> listModule = new ArrayList<String>();
			MvnUtils.getModules(strPomPath, listModule);
			int iJarCount = 0;
			for (String strModule : listModule) {
				String strData = runCmdInstallForModule(cMvnInfo, strModule);
				if (null != strData) {
					iJarCount++;
				}
			}

			logger.info("AddJarCount:{}", iJarCount);
			logger.info("ModuleCount:{}", listModule.size());
			listModule.clear();
		} catch (Exception e) {
			logger.error("runCmdInstall", e);
		}

		logger.info("TotalTime:{}", (System.currentTimeMillis() - start));
	}

	/**
	 * @category 功能
	 * @param strModule
	 * @Date :2022年4月11日下午5:50:36
	 */
	private String runCmdInstallForModule(MvnInfo cMvnInfo, String strModule) throws Exception {
		// 可能是JAR，可能是POM
		String strJarName = cmdJar(cMvnInfo, strModule);
		logger.info(strJarName);
		JarInfo cJarInfo = getJarInfo(strModule);
		String strLocalRepoPath = JpfFileUtil.joinPath(cMvnInfo.getRepoPath(), getPathByJarInfo(cJarInfo));
		logger.info(strLocalRepoPath);

		File f = new File(strLocalRepoPath);
		if (!(f.exists() && f.isDirectory())) {
			f.mkdirs();
		}

		copyJartoRepo(cJarInfo, strLocalRepoPath, strModule);
		copyPomtoRepo(cJarInfo, strLocalRepoPath, strModule);
		return strJarName;
	}

	/**
	 * @category 功能
	 * @param strJarName
	 * @param strRepo
	 * @Date :2022年4月11日下午5:55:21
	 */
	private void copyPomtoRepo(JarInfo cJarInfo, String strRepoPath, String strModule) throws Exception {
		String strPrjPomFileName = JpfFileUtil.joinPath(strModule, "pom.xml");
		logger.info(strPrjPomFileName);

		String strSimplePomFileName = cJarInfo.getArtifactId() + "-" + cJarInfo.getVersion() + ".pom";

		String strRepoPomFileName = JpfFileUtil.joinPath(strRepoPath, strSimplePomFileName);
		logger.info(strRepoPomFileName);
		File source = new File(strPrjPomFileName);
		File target = new File(strRepoPomFileName);
		Files.copy(source.toPath(), target.toPath());

	}

	/**
	 * @category 功能
	 * @param strJarName
	 * @param strRepo
	 * @Date :2022年4月11日下午5:54:27
	 */
	private void copyJartoRepo(JarInfo cJarInfo, String strRepoPath, String strModule) throws Exception {
		if (cJarInfo.getPackaging().equalsIgnoreCase("pom")) {
			return;
		}
		String strSimpleJarFileName = cJarInfo.getArtifactId() + "-" + cJarInfo.getVersion() + ".jar";
		String strTargetJarFileName = JpfFileUtil.joinPath(strModule, "target", strSimpleJarFileName);
		logger.info(strTargetJarFileName);

		String strLocalJarFileName = JpfFileUtil.joinPath(strRepoPath, strSimpleJarFileName);
		logger.info(strLocalJarFileName);
		File source = new File(strTargetJarFileName);
		File target = new File(strLocalJarFileName);
		Files.copy(source.toPath(), target.toPath());
	}

	/**
	 * 
	 * @category 功能
	 * @param cJarInfo
	 * @return
	 * @Date :2022年4月12日上午10:04:13
	 */
	private String getPathByJarInfo(JarInfo cJarInfo) {
		return JpfFileUtil.joinPath(JpfClassUtil.getClassNameWithSlash(cJarInfo.getGroupId()), cJarInfo.getArtifactId(),
				cJarInfo.getVersion());
	}

	/**
	 * 
	 * @category 功能
	 * @param strJarFileName
	 * @return
	 * @Date :2022年4月12日上午9:35:47
	 */
	private JarInfo getJarInfo(String strModule) throws Exception {

		JarInfo cJarInfo = new JarInfo();
		String strXmlFileName = JpfFileUtil.joinPath(strModule, "pom.xml");
		Element el = Jpfw3cXmlUtil.getRootElement(strXmlFileName);
		NodeList nl = el.getChildNodes();
		for (int i = 0; i < nl.getLength(); i++) {
			Node nd = nl.item(i);
			logger.info(nd.getNodeName());
			if (nd.getNodeName().equalsIgnoreCase("artifactId")) {
				handleArtifactId(nd, cJarInfo);
				continue;
			}
			if (nd.getNodeName().equalsIgnoreCase("groupId")) {
				handleGroupId(nd, cJarInfo);
				continue;
			}
			if (nd.getNodeName().equalsIgnoreCase("version")) {
				handleVersion(nd, cJarInfo);
				continue;
			}
			if (nd.getNodeName().equalsIgnoreCase("parent")) {
				handleParent(nd, cJarInfo);
				continue;
			}
			if (nd.getNodeName().equalsIgnoreCase("packaging")) {
				handlePackaging(nd, cJarInfo);
				continue;
			}
		}
		// read info from pom
		// pom.properties
		return cJarInfo;
	}

	/**
	 * @category 功能
	 * @param nd
	 * @param cJarInfo
	 * @Date :2022年4月12日上午11:15:13
	 */
	private void handlePackaging(Node nd, JarInfo cJarInfo) {

		cJarInfo.setPackaging(nd.getTextContent().trim());
	}

	/**
	 * @category 功能
	 * @param nd
	 * @param cJarInfo
	 * @Date :2022年4月12日上午11:14:28
	 */
	private void handleParent(Node ndParent, JarInfo cJarInfo) {
		NodeList nl = ndParent.getChildNodes();
		for (int i = 0; i < nl.getLength(); i++) {
			Node nd = nl.item(i);
			logger.info(nd.getNodeName());

			if (nd.getNodeName().equalsIgnoreCase("groupId")) {
				handleGroupId(nd, cJarInfo);
				continue;
			}
			if (nd.getNodeName().equalsIgnoreCase("version")) {
				handleVersion(nd, cJarInfo);
				continue;
			}
		}

	}

	/**
	 * @category 功能
	 * @param nd
	 * @param cJarInfo
	 * @Date :2022年4月12日上午11:14:10
	 */
	private void handleVersion(Node nd, JarInfo cJarInfo) {
		if (null == cJarInfo.getVersion() || 0 == cJarInfo.getVersion().trim().length()) {
			cJarInfo.setVersion(nd.getTextContent());
		}
	}

	/**
	 * @category 功能
	 * @param nd
	 * @param cJarInfo
	 * @Date :2022年4月12日上午11:13:45
	 */
	private void handleGroupId(Node nd, JarInfo cJarInfo) {
		if (null == cJarInfo.getGroupId() || 0 == cJarInfo.getGroupId().trim().length()) {
			cJarInfo.setGroupId(nd.getTextContent().trim());
		}
	}

	/**
	 * @category 功能
	 * @param nd
	 * @param cJarInfo
	 * @Date :2022年4月12日上午11:13:12
	 */
	private void handleArtifactId(Node nd, JarInfo cJarInfo) {
		if (null == cJarInfo.getArtifactId() || 0 == cJarInfo.getArtifactId().trim().length()) {
			logger.info(nd.getTextContent());
			cJarInfo.setArtifactId(nd.getTextContent().trim());
		}
	}

	/**
	 * @category 功能
	 * @param strModule
	 * @Date :2022年4月11日下午5:52:47
	 */
	private String cmdJar(MvnInfo cMvnInfo, String strModule) throws Exception {

		List<String> mlist = new ArrayList<String>();
		String strMvnCmd = " jar:jar ";
		MvnUtils.doMvnCmd(cMvnInfo, strMvnCmd, strModule, mlist, true);

		return getJarName(mlist);
	}

	/**
	 * @category 功能
	 * @param mlist
	 * @return
	 * @Date :2022年4月11日下午10:37:17
	 */
	private String getJarName(List<String> mlist) {
		for (String str : mlist) {
			if (str.startsWith("[INFO] Building")) {
				return str.substring(16, str.length()).trim() + ".jar";
			}
		}
		return null;
	}

}
