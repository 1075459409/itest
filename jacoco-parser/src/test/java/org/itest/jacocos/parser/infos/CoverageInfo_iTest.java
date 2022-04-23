/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser.infos;

import java.util.Set;

import org.itest.jacocos.parser.infos.CoverageInfo;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CoverageInfo_iTest</code> contains tests for the class
 * <code>{@link CoverageInfo}</code>.
 *
 * @generatedBy at 22-4-8 下午4:34
 * @version $Revision: 1.0 $
 */
public class CoverageInfo_iTest {
	/**
	 * Run the CoverageInfo() constructor test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testCoverageInfo_1() throws Exception {

		CoverageInfo result = new CoverageInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getHsetCoverage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetHsetCoverage_1() throws Exception {
		CoverageInfo fixture = new CoverageInfo();

		Set<String> result = fixture.getHsetCoverage();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<String> getHsetDupMethod() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetHsetDupMethod_1() throws Exception {
		CoverageInfo fixture = new CoverageInfo();

		Set<String> result = fixture.getHsetDupMethod();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception if the initialization fails for some reason
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception if the clean-up fails for some reason
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@After
	public void tearDown() throws Exception {
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
		new org.junit.runner.JUnitCore().run(CoverageInfo_iTest.class);
	}
}