/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.mvntools;

import java.util.List;
import org.easymock.EasyMock;
import org.itest.mvntools.MvnInfo;
import org.itest.mvntools.MvnUtils;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MvnUtils_iTest</code> contains tests for the class <code>{@link MvnUtils}</code>.
 *
 * @generatedBy  at 22-4-12 下午3:33
 * @author 
 * @version $Revision: 1.0 $
 */
public class MvnUtils_iTest {
	/**
	 * Run the boolean doMvnCmd(MvnInfo,String,String,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testDoMvnCmd_1()
		throws Exception {
		MvnInfo cMvnInfo = new MvnInfo();
		cMvnInfo.setPomFileName("");
		cMvnInfo.setRepoPath("");
		cMvnInfo.setMvnSettings("");
		cMvnInfo.setMavenHome("");
		String strMvnCmd = "";
		String strWorkingDirectory = "";
		List<String> mlist = EasyMock.createMock(List.class);
		boolean bShowInfo = true;
		// add mock object expectations here

		EasyMock.replay(mlist);

		boolean result = MvnUtils.doMvnCmd(cMvnInfo, strMvnCmd, strWorkingDirectory, mlist, bShowInfo);

		// add additional test code here
		EasyMock.verify(mlist);
		assertEquals(false, result);
	}

	/**
	 * Run the boolean doMvnCmd(MvnInfo,String,String,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testDoMvnCmd_2()
		throws Exception {
		MvnInfo cMvnInfo = new MvnInfo();
		cMvnInfo.setPomFileName("");
		cMvnInfo.setRepoPath("");
		cMvnInfo.setMvnSettings("");
		cMvnInfo.setMavenHome("");
		String strMvnCmd = "";
		String strWorkingDirectory = "";
		List<String> mlist = EasyMock.createMock(List.class);
		boolean bShowInfo = true;
		// add mock object expectations here

		EasyMock.replay(mlist);

		boolean result = MvnUtils.doMvnCmd(cMvnInfo, strMvnCmd, strWorkingDirectory, mlist, bShowInfo);

		// add additional test code here
		EasyMock.verify(mlist);
		assertEquals(false, result);
	}

	/**
	 * Run the boolean doMvnCmd(MvnInfo,String,String,List<String>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testDoMvnCmd_3()
		throws Exception {
		MvnInfo cMvnInfo = new MvnInfo();
		cMvnInfo.setPomFileName("");
		cMvnInfo.setRepoPath("");
		cMvnInfo.setMvnSettings("");
		cMvnInfo.setMavenHome("");
		String strMvnCmd = "";
		String strWorkingDirectory = "";
		List<String> mlist = EasyMock.createMock(List.class);
		boolean bShowInfo = true;
		// add mock object expectations here

		EasyMock.replay(mlist);

		boolean result = MvnUtils.doMvnCmd(cMvnInfo, strMvnCmd, strWorkingDirectory, mlist, bShowInfo);

		// add additional test code here
		EasyMock.verify(mlist);
		assertEquals(false, result);
	}

	/**
	 * Run the void getModules(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetModules_1()
		throws Exception {
		String strBasePath = "";
		List<String> moduleList = EasyMock.createMock(List.class);
		// add mock object expectations here

		EasyMock.replay(moduleList);

		MvnUtils.getModules(strBasePath, moduleList);

		// add additional test code here
		EasyMock.verify(moduleList);
	}

	/**
	 * Run the void getModules(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetModules_2()
		throws Exception {
		String strBasePath = "";
		List<String> moduleList = EasyMock.createMock(List.class);
		// add mock object expectations here

		EasyMock.replay(moduleList);

		MvnUtils.getModules(strBasePath, moduleList);

		// add additional test code here
		EasyMock.verify(moduleList);
	}

	/**
	 * Run the void getModules(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetModules_3()
		throws Exception {
		String strBasePath = "";
		List<String> moduleList = EasyMock.createMock(List.class);
		// add mock object expectations here

		EasyMock.replay(moduleList);

		MvnUtils.getModules(strBasePath, moduleList);

		// add additional test code here
		EasyMock.verify(moduleList);
	}

	/**
	 * Run the void getModules(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetModules_4()
		throws Exception {
		String strBasePath = "";
		List<String> moduleList = EasyMock.createMock(List.class);
		// add mock object expectations here

		EasyMock.replay(moduleList);

		MvnUtils.getModules(strBasePath, moduleList);

		// add additional test code here
		EasyMock.verify(moduleList);
	}

	/**
	 * Run the void getModules(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetModules_5()
		throws Exception {
		String strBasePath = "";
		List<String> moduleList = EasyMock.createMock(List.class);
		// add mock object expectations here

		EasyMock.replay(moduleList);

		MvnUtils.getModules(strBasePath, moduleList);

		// add additional test code here
		EasyMock.verify(moduleList);
	}

	/**
	 * Run the void getModules(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetModules_6()
		throws Exception {
		String strBasePath = "";
		List<String> moduleList = EasyMock.createMock(List.class);
		// add mock object expectations here

		EasyMock.replay(moduleList);

		MvnUtils.getModules(strBasePath, moduleList);

		// add additional test code here
		EasyMock.verify(moduleList);
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
		new org.junit.runner.JUnitCore().run(MvnUtils_iTest.class);
	}
}