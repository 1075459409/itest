/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser.infos;

import org.junit.*;
import static org.junit.Assert.*;

import org.itest.jacocos.parser.infos.LineCoverageInfo;

/**
 * The class <code>LineCoverageInfo_iTest</code> contains tests for the class <code>{@link LineCoverageInfo}</code>.
 *
 * @generatedBy  at 22-4-8 下午4:34
 * @author 
 * @version $Revision: 1.0 $
 */
public class LineCoverageInfo_iTest {
	/**
	 * Run the int getR() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetR_1()
		throws Exception {
		LineCoverageInfo fixture = new LineCoverageInfo();
		fixture.setS(1);
		fixture.setR(1);

		int result = fixture.getR();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getS() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetS_1()
		throws Exception {
		LineCoverageInfo fixture = new LineCoverageInfo();
		fixture.setS(1);
		fixture.setR(1);

		int result = fixture.getS();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setR(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetR_1()
		throws Exception {
		LineCoverageInfo fixture = new LineCoverageInfo();
		fixture.setS(1);
		fixture.setR(1);
		int r = 1;

		fixture.setR(r);

		// add additional test code here
	}

	/**
	 * Run the void setS(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetS_1()
		throws Exception {
		LineCoverageInfo fixture = new LineCoverageInfo();
		fixture.setS(1);
		fixture.setR(1);
		int s = 1;

		fixture.setS(s);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(LineCoverageInfo_iTest.class);
	}
}