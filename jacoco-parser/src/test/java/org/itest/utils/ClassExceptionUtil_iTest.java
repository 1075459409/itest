/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.utils;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.itest.utils.ClassExceptionUtil;
import org.junit.*;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ClassExceptionUtil_iTest</code> contains tests for the class <code>{@link ClassExceptionUtil}</code>.
 *
 * @generatedBy  at 22-4-12 下午3:34
 * @author 
 * @version $Revision: 1.0 $
 */
public class ClassExceptionUtil_iTest {
	/**
	 * Run the int getRowNumFromCauseList(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetRowNumFromCauseList_1()
		throws Exception {
		String errKeyStr = "";
		List<String> ErrCauseList = EasyMock.createMock(List.class);
		// add mock object expectations here

		EasyMock.replay(ErrCauseList);

		int result = ClassExceptionUtil.getRowNumFromCauseList(errKeyStr, ErrCauseList);

		// add additional test code here
		EasyMock.verify(ErrCauseList);
		assertEquals(0, result);
	}

	/**
	 * Run the int getRowNumFromCauseList(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetRowNumFromCauseList_2()
		throws Exception {
		String errKeyStr = "";
		List<String> ErrCauseList = EasyMock.createMock(List.class);
		// add mock object expectations here

		EasyMock.replay(ErrCauseList);

		int result = ClassExceptionUtil.getRowNumFromCauseList(errKeyStr, ErrCauseList);

		// add additional test code here
		EasyMock.verify(ErrCauseList);
		assertEquals(0, result);
	}

	/**
	 * Run the int getRowNumFromCauseList(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetRowNumFromCauseList_3()
		throws Exception {
		String errKeyStr = "";
		List<String> ErrCauseList = EasyMock.createMock(List.class);
		// add mock object expectations here

		EasyMock.replay(ErrCauseList);

		int result = ClassExceptionUtil.getRowNumFromCauseList(errKeyStr, ErrCauseList);

		// add additional test code here
		EasyMock.verify(ErrCauseList);
		assertEquals(0, result);
	}

	/**
	 * Run the int getRowNumFromExceptionStr(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetRowNumFromExceptionStr_1()
		throws Exception {
		String errStr = "";

		int result = ClassExceptionUtil.getRowNumFromExceptionStr(errStr);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getRowNumFromExceptionStr(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetRowNumFromExceptionStr_2()
		throws Exception {
		String errStr = "";

		int result = ClassExceptionUtil.getRowNumFromExceptionStr(errStr);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getRowNumFromExceptionStr(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetRowNumFromExceptionStr_3()
		throws Exception {
		String errStr = "";

		int result = ClassExceptionUtil.getRowNumFromExceptionStr(errStr);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy  at 22-4-12 下午3:34
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
	 * @generatedBy  at 22-4-12 下午3:34
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
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ClassExceptionUtil_iTest.class);
	}
}