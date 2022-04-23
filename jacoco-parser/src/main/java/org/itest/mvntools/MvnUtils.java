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
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationOutputHandler;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.InvokerLogger;
import org.apache.maven.shared.invoker.MavenInvocationException;
import org.apache.maven.shared.invoker.PrintStreamLogger;
import org.itest.utils.JpfFileUtil;

public class MvnUtils {
	private static final Logger logger = LogManager.getLogger();

	private MvnUtils() {
	}

	/**
	 * @category @param args
	 * @since 2020年1月16日
	 */
	public static boolean doMvnCmd(MvnInfo cMvnInfo, String strMvnCmd, String strWorkingDirectory, List<String> mlist,
			boolean bShowInfo) throws Exception {
		logger.info("WorkingDirectory:" + strWorkingDirectory);

		logger.info("exec mvn cmd:" + strMvnCmd);
		InvocationRequest request = new DefaultInvocationRequest().setBaseDirectory(new File(strWorkingDirectory))
				
				.setGoals(Collections.singletonList(strMvnCmd));

		if (logger.isDebugEnabled()) {
			logger.debug("getGoals:" + request.getGoals());
			logger.debug("MavenOpts:" + request.getMavenOpts());
			logger.debug("ShellEnvironments:" + request.getShellEnvironments());
		}
		request.setMavenOpts(" -Xss1024k");

		request.setUserSettingsFile(new File(cMvnInfo.getMvnSettings()));
		request.setPomFileName(cMvnInfo.getPomFileName());
		request.setLocalRepositoryDirectory(new File(cMvnInfo.getRepoPath()));

		Invoker invoker = new DefaultInvoker();
		try {

			// File mavenHome = new File(MavenHome);
			invoker.setMavenHome(new File(cMvnInfo.getMavenHome()));

			File workingDirectory = new File(strWorkingDirectory);
			invoker.setWorkingDirectory(workingDirectory);

			invoker.setLogger(new PrintStreamLogger(System.err, InvokerLogger.ERROR));
			invoker.setOutputHandler(new InvocationOutputHandler() {
				@Override
				public void consumeLine(String s) throws IOException {
					//handleOutPut(s, mlist, bShowInfo);
					mlist.add(s);
					if (bShowInfo)
					{
						System.out.println(s);
					}
				}
			});

			int iResult = invoker.execute(request).getExitCode();
			if (logger.isDebugEnabled()) {
				logger.debug("doMvnCmd Result:{}", iResult);
			}
			if (iResult == 0) {
				return true;
			}
		} catch (MavenInvocationException e) {
			logger.error(strMvnCmd, e);
		}

		return false;

	}

	private static void handleOutPut(final String s, List<String> listErrs, boolean bShowInfo) {
		// 排除单测运行的异常输出
		// Error occurred during initialization fo vm
		// Cound not reserve enough space for object heap
		// System.out.println(s);
		String strData = s.trim();
		if (strData.startsWith("[ERROR]")) {
			if (listErrs != null) {
				listErrs.add(strData);
			}
			System.out.println(strData);
			return;
		}
		if (strData.startsWith("#")) {
			if (listErrs != null) {
				listErrs.add(strData);
			}
			System.out.println(strData);
			return;
		}
		if (bShowInfo) {
			System.out.println(strData);
		}

	}
	
	public static void getModules(String strBasePath, List<String> moduleList) {

		try {
			MavenXpp3Reader mavenreader = new MavenXpp3Reader();

			File pomfile = new File(JpfFileUtil.joinPath(strBasePath, "pom.xml"));
			logger.info("pomfile:" + pomfile);
			Model model = mavenreader.read(new FileReader(pomfile));

			/*
			 * List<Dependency> deps = model.getDependencies();
			 * 
			 * for (Dependency d : deps) { System.out.println(d.getGroupId() + "." +
			 * d.getArtifactId() + " " + d.getVersion()); }
			 */
			List<String> mlist = model.getModules();
			logger.debug("getModules=" + mlist.size());
			if (mlist.size() == 0) {
				moduleList.add(strBasePath);
			} else {
				for (String str : mlist) {
					logger.debug("Module=" + str);
					getModules(JpfFileUtil.joinPath(strBasePath, str), moduleList);
				}
			}

		} catch (Exception e) {
			logger.error(strBasePath, e);
		}
	}
}
