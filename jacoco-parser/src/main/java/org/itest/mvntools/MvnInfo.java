/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.mvntools;

public class MvnInfo {
	private String MavenHome;
	private String MvnSettings;
	private String pomFileName;
	private String RepoPath;
	
	public String getRepoPath() {
		return RepoPath;
	}

	public void setRepoPath(String repoPath) {
		RepoPath = repoPath;
	}

	public String getPomFileName() {
		return pomFileName;
	}

	public void setPomFileName(String pomFileName) {
		this.pomFileName = pomFileName;
	}

	public String getMavenHome() {
		return MavenHome;
	}

	public void setMavenHome(String mavenHome) {
		MavenHome = mavenHome;
	}

	public String getMvnSettings() {
		return MvnSettings;
	}

	public void setMvnSettings(String mvnSettings) {
		MvnSettings = mvnSettings;
	}
	
	
}
