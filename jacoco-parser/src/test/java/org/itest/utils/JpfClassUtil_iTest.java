/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.utils;

import org.junit.*;
import static org.junit.Assert.*;

import org.itest.utils.JpfClassUtil;

/**
 * The class <code>JpfClassUtil_iTest</code> contains tests for the class <code>{@link JpfClassUtil}</code>.
 *
 * @generatedBy  at 22-4-12 下午3:34
 * @author 
 * @version $Revision: 1.0 $
 */
public class JpfClassUtil_iTest {
	/**
	 * Run the String getClassNameWithSlash(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetClassNameWithSlash_1()
		throws Exception {
		String strClassFullName = "";

		String result = JpfClassUtil.getClassNameWithSlash(strClassFullName);

		// add additional test code here
		assertEquals("", result);
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
		new org.junit.runner.JUnitCore().run(JpfClassUtil_iTest.class);
	}
}