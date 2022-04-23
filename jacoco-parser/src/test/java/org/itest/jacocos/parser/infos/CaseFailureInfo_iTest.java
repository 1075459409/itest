/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser.infos;

import java.util.List;
import org.easymock.EasyMock;
import org.itest.jacocos.parser.infos.CaseFailureInfo;
import org.itest.jacocos.parser.infos.EnumCaseAction;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CaseFailureInfo_iTest</code> contains tests for the class <code>{@link CaseFailureInfo}</code>.
 *
 * @generatedBy  at 22-4-8 下午4:34

 * @version $Revision: 1.0 $
 */
public class CaseFailureInfo_iTest {
	/**
	 * Run the CaseFailureInfo() constructor test.
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testCaseFailureInfo_1()
		throws Exception {
		CaseFailureInfo result = new CaseFailureInfo();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the List<String> getFailureCauseList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetFailureCauseList_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");

		List<String> result = fixture.getFailureCauseList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFailureMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetFailureMsg_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");

		String result = fixture.getFailureMsg();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getFailureRow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetFailureRow_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");

		int result = fixture.getFailureRow();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getFailureType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetFailureType_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");

		String result = fixture.getFailureType();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSystem_Err() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetSystem_Err_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");

		String result = fixture.getSystem_Err();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUtClassName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetUtClassName_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");

		String result = fixture.getUtClassName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUtFileName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetUtFileName_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");

		String result = fixture.getUtFileName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUtMethodName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetUtMethodName_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");

		String result = fixture.getUtMethodName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUtTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetUtTime_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");

		String result = fixture.getUtTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the EnumCaseAction getcEnumCaseAction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetcEnumCaseAction_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");

		EnumCaseAction result = fixture.getcEnumCaseAction();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void printInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testPrintInfo_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");

		fixture.printInfo();

		// add additional test code here
	}

	/**
	 * Run the void setEnumCaseAction(EnumCaseAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testSetEnumCaseAction_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");
		EnumCaseAction cEnumCaseAction = EnumCaseAction.DeleteMethod;

		fixture.setEnumCaseAction(cEnumCaseAction);

		// add additional test code here
	}

	/**
	 * Run the void setFailureCauseList(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testSetFailureCauseList_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");
		List<String> failureCauseList = EasyMock.createMock(List.class);
		// add mock object expectations here

		EasyMock.replay(failureCauseList);

		fixture.setFailureCauseList(failureCauseList);

		// add additional test code here
		EasyMock.verify(failureCauseList);
	}

	/**
	 * Run the void setFailureMsg(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testSetFailureMsg_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");
		String failureMsg = "";

		fixture.setFailureMsg(failureMsg);

		// add additional test code here
	}

	/**
	 * Run the void setFailureRow(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testSetFailureRow_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");
		int failureRow = 1;

		fixture.setFailureRow(failureRow);

		// add additional test code here
	}

	/**
	 * Run the void setFailureType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testSetFailureType_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");
		String failureType = "";

		fixture.setFailureType(failureType);

		// add additional test code here
	}

	/**
	 * Run the void setSystem_Err(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testSetSystem_Err_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");
		String system_Err = "";

		fixture.setSystem_Err(system_Err);

		// add additional test code here
	}

	/**
	 * Run the void setUtClassName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testSetUtClassName_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");
		String utClassName = "";

		fixture.setUtClassName(utClassName);

		// add additional test code here
	}

	/**
	 * Run the void setUtFileName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testSetUtFileName_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");
		String utFileName = "";

		fixture.setUtFileName(utFileName);

		// add additional test code here
	}

	/**
	 * Run the void setUtMethodName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testSetUtMethodName_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");
		String utMethodName = "";

		fixture.setUtMethodName(utMethodName);

		// add additional test code here
	}

	/**
	 * Run the void setUtTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testSetUtTime_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");
		String utTime = "";

		fixture.setUtTime(utTime);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testToString_1()
		throws Exception {
		CaseFailureInfo fixture = new CaseFailureInfo();
		fixture.setUtMethodName("");
		fixture.setSystem_Err("");
		fixture.setFailureType("");
		fixture.setUtFileName("");
		fixture.setFailureMsg("");
		fixture.setFailureCauseList(EasyMock.createNiceMock(List.class));
		fixture.setEnumCaseAction(EnumCaseAction.DeleteMethod);
		fixture.setFailureRow(1);
		fixture.setUtClassName("");
		fixture.setUtTime("");

		String result = fixture.toString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy  at 22-4-8 下午4:34
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
	 * @generatedBy  at 22-4-8 下午4:34
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
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CaseFailureInfo_iTest.class);
	}
}