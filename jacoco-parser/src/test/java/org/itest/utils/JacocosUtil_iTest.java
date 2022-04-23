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

import java.util.Map;
import java.util.Set;

import org.easymock.EasyMock;
import org.itest.utils.JacocosUtil;
import org.junit.*;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>JacocosUtil_iTest</code> contains tests for the class <code>{@link JacocosUtil}</code>.
 *
 * @generatedBy  at 22-4-12 下午3:34
 * @author 
 * @version $Revision: 1.0 $
 */
public class JacocosUtil_iTest {
	/**
	 * Run the boolean isEmpty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testIsEmpty_1()
		throws Exception {
		String str = "";

		boolean result = JacocosUtil.isEmpty(str);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEmpty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testIsEmpty_2()
		throws Exception {
		String str = null;

		boolean result = JacocosUtil.isEmpty(str);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEmpty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testIsEmpty_3()
		throws Exception {
		String str = "";

		boolean result = JacocosUtil.isEmpty(str);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void printMap(Map<?,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testPrintMap_1()
		throws Exception {
		Map<Object, Object> map = EasyMock.createMock(Map.class);
		// add mock object expectations here

		EasyMock.replay(map);

		JacocosUtil.printMap(map);

		// add additional test code here
		EasyMock.verify(map);
	}

	/**
	 * Run the void printMap(Map<?,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testPrintMap_2()
		throws Exception {
		Map<Object, Object> map = EasyMock.createMock(Map.class);
		// add mock object expectations here

		EasyMock.replay(map);

		JacocosUtil.printMap(map);

		// add additional test code here
		EasyMock.verify(map);
	}

	/**
	 * Run the void printSet(Set<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testPrintSet_1()
		throws Exception {
		Set<Object> hSet = EasyMock.createMock(Set.class);
		// add mock object expectations here

		EasyMock.replay(hSet);

		JacocosUtil.printSet(hSet);

		// add additional test code here
		EasyMock.verify(hSet);
	}

	/**
	 * Run the void printSet(Set<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testPrintSet_2()
		throws Exception {
		Set<Object> hSet = EasyMock.createMock(Set.class);
		// add mock object expectations here

		EasyMock.replay(hSet);

		JacocosUtil.printSet(hSet);

		// add additional test code here
		EasyMock.verify(hSet);
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
		new org.junit.runner.JUnitCore().run(JacocosUtil_iTest.class);
	}
}