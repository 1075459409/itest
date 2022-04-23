/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.mvntools;

import org.junit.*;
import static org.junit.Assert.*;

import org.itest.mvntools.MvnInfo;

/**
 * The class <code>MvnInfo_iTest</code> contains tests for the class <code>{@link MvnInfo}</code>.
 *
 * @generatedBy  at 22-4-12 下午3:33
 * @author 
 * @version $Revision: 1.0 $
 */
public class MvnInfo_iTest {
	/**
	 * Run the String getMavenHome() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetMavenHome_1()
		throws Exception {
		MvnInfo fixture = new MvnInfo();
		fixture.setRepoPath("");
		fixture.setMavenHome("");
		fixture.setPomFileName("");
		fixture.setMvnSettings("");

		String result = fixture.getMavenHome();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getMvnSettings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetMvnSettings_1()
		throws Exception {
		MvnInfo fixture = new MvnInfo();
		fixture.setRepoPath("");
		fixture.setMavenHome("");
		fixture.setPomFileName("");
		fixture.setMvnSettings("");

		String result = fixture.getMvnSettings();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getPomFileName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetPomFileName_1()
		throws Exception {
		MvnInfo fixture = new MvnInfo();
		fixture.setRepoPath("");
		fixture.setMavenHome("");
		fixture.setPomFileName("");
		fixture.setMvnSettings("");

		String result = fixture.getPomFileName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getRepoPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetRepoPath_1()
		throws Exception {
		MvnInfo fixture = new MvnInfo();
		fixture.setRepoPath("");
		fixture.setMavenHome("");
		fixture.setPomFileName("");
		fixture.setMvnSettings("");

		String result = fixture.getRepoPath();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setMavenHome(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testSetMavenHome_1()
		throws Exception {
		MvnInfo fixture = new MvnInfo();
		fixture.setRepoPath("");
		fixture.setMavenHome("");
		fixture.setPomFileName("");
		fixture.setMvnSettings("");
		String mavenHome = "";

		fixture.setMavenHome(mavenHome);

		// add additional test code here
	}

	/**
	 * Run the void setMvnSettings(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testSetMvnSettings_1()
		throws Exception {
		MvnInfo fixture = new MvnInfo();
		fixture.setRepoPath("");
		fixture.setMavenHome("");
		fixture.setPomFileName("");
		fixture.setMvnSettings("");
		String mvnSettings = "";

		fixture.setMvnSettings(mvnSettings);

		// add additional test code here
	}

	/**
	 * Run the void setPomFileName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testSetPomFileName_1()
		throws Exception {
		MvnInfo fixture = new MvnInfo();
		fixture.setRepoPath("");
		fixture.setMavenHome("");
		fixture.setPomFileName("");
		fixture.setMvnSettings("");
		String pomFileName = "";

		fixture.setPomFileName(pomFileName);

		// add additional test code here
	}

	/**
	 * Run the void setRepoPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testSetRepoPath_1()
		throws Exception {
		MvnInfo fixture = new MvnInfo();
		fixture.setRepoPath("");
		fixture.setMavenHome("");
		fixture.setPomFileName("");
		fixture.setMvnSettings("");
		String repoPath = "";

		fixture.setRepoPath(repoPath);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MvnInfo_iTest.class);
	}
}