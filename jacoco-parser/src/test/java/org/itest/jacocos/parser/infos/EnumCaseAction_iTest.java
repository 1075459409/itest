/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser.infos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.itest.jacocos.parser.infos.EnumCaseAction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>EnumCaseAction_iTest</code> contains tests for the class <code>{@link EnumCaseAction}</code>.
 *
 * @generatedBy  at 22-4-8 下午4:34
 * @version $Revision: 1.0 $
 */
public class EnumCaseAction_iTest {
	/**
	 * Run the EnumCaseAction(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test(expected = java.lang.NoSuchMethodException.class)
	public void testEnumCaseAction_1()
		throws Exception {
		String typeName = "";

		EnumCaseAction result = EnumCaseAction.fromTypeName(typeName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the EnumCaseAction fromTypeName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testFromTypeName_1()
		throws Exception {
		String typeName = "";

		EnumCaseAction result = EnumCaseAction.fromTypeName(typeName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the EnumCaseAction fromTypeName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testFromTypeName_2()
		throws Exception {
		String typeName = "";

		EnumCaseAction result = EnumCaseAction.fromTypeName(typeName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the EnumCaseAction fromTypeName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testFromTypeName_3()
		throws Exception {
		String typeName = "";

		EnumCaseAction result = EnumCaseAction.fromTypeName(typeName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTypeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetTypeName_1()
		throws Exception {
		EnumCaseAction fixture = EnumCaseAction.DeleteMethod;

		String result = fixture.getTypeName();

		// add additional test code here
		assertEquals("DeleteMethod", result);
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
		new org.junit.runner.JUnitCore().run(EnumCaseAction_iTest.class);
	}
}