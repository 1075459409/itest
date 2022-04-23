/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser.samples.coverages;

import org.junit.*;
import static org.junit.Assert.*;

import org.itest.jacocos.parser.samples.coverages.CoverageSample;

/**
 * The class <code>CoverageSample_iTest</code> contains tests for the class <code>{@link CoverageSample}</code>.
 *
 * @generatedBy  at 22-4-8 下午4:34
 * @author 
 * @version $Revision: 1.0 $
 */
public class CoverageSample_iTest {
	/**
	 * Run the boolean isPrime(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testIsPrime_1()
		throws Exception {
		CoverageSample fixture = new CoverageSample();
		int n = 4;

		boolean result = fixture.isPrime(n);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPrime(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testIsPrime_2()
		throws Exception {
		CoverageSample fixture = new CoverageSample();
		int n = 4;

		boolean result = fixture.isPrime(n);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPrime(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testIsPrime_3()
		throws Exception {
		CoverageSample fixture = new CoverageSample();
		int n = 1;

		boolean result = fixture.isPrime(n);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPrime2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testIsPrime2_1()
		throws Exception {
		CoverageSample fixture = new CoverageSample();

		boolean result = fixture.isPrime2();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPrime2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testIsPrime2_2()
		throws Exception {
		CoverageSample fixture = new CoverageSample();

		boolean result = fixture.isPrime2();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPrime2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testIsPrime2_3()
		throws Exception {
		CoverageSample fixture = new CoverageSample();

		boolean result = fixture.isPrime2();

		// add additional test code here
		assertEquals(true, result);
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
		new org.junit.runner.JUnitCore().run(CoverageSample_iTest.class);
	}
}