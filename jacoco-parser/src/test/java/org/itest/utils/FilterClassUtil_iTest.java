/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.utils;

import java.util.Set;
import org.easymock.EasyMock;
import org.itest.utils.FilterClassUtil;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FilterClassUtil_iTest</code> contains tests for the class <code>{@link FilterClassUtil}</code>.
 *
 * @generatedBy  at 22-4-12 下午3:34
 * @author 
 * @version $Revision: 1.0 $
 */
public class FilterClassUtil_iTest {
	/**
	 * Run the boolean isFilterClass(String,Set<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testIsFilterClass_1()
		throws Exception {
		String strkey = "";
		Set<String> setFilter = EasyMock.createMock(Set.class);
		// add mock object expectations here

		EasyMock.replay(setFilter);

		boolean result = FilterClassUtil.isFilterClass(strkey, setFilter);

		// add additional test code here
		EasyMock.verify(setFilter);
		assertTrue(result);
	}

	/**
	 * Run the boolean isFilterClass(String,Set<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testIsFilterClass_2()
		throws Exception {
		String strkey = "";
		Set<String> setFilter = EasyMock.createMock(Set.class);
		// add mock object expectations here

		EasyMock.replay(setFilter);

		boolean result = FilterClassUtil.isFilterClass(strkey, setFilter);

		// add additional test code here
		EasyMock.verify(setFilter);
		assertTrue(result);
	}

	/**
	 * Run the boolean isFilterClass(String,Set<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testIsFilterClass_3()
		throws Exception {
		String strkey = "";
		Set<String> setFilter = EasyMock.createMock(Set.class);
		// add mock object expectations here

		EasyMock.replay(setFilter);

		boolean result = FilterClassUtil.isFilterClass(strkey, setFilter);

		// add additional test code here
		EasyMock.verify(setFilter);
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(FilterClassUtil_iTest.class);
	}
}