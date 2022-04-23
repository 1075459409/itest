/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Map;

import org.itest.jacocos.parser.JacocoExecReader;
import org.itest.jacocos.parser.infos.CoverageInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>JacocoExecReader_iTest</code> contains tests for the class <code>{@link JacocoExecReader}</code>.
 *
 * @generatedBy  at 22-4-8 下午4:34
 * @author 
 * @version $Revision: 1.0 $
 */
public class JacocoExecReader_iTest {
	/**
	 * Run the JacocoExecReader() constructor test.
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testJacocoExecReader_1()
		throws Exception {
		JacocoExecReader result = new JacocoExecReader();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Map<String, CoverageInfo> getSrcClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetSrcClass_1()
		throws Exception {
		JacocoExecReader fixture = new JacocoExecReader();
		String strPomPath = "";

		Map<String, CoverageInfo> result = fixture.getSrcClass(strPomPath);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Map<String, CoverageInfo> getSrcClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetSrcClass_2()
		throws Exception {
		JacocoExecReader fixture = new JacocoExecReader();
		String strPomPath = "";

		Map<String, CoverageInfo> result = fixture.getSrcClass(strPomPath);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Map<String, CoverageInfo> getSrcClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetSrcClass_3()
		throws Exception {
		JacocoExecReader fixture = new JacocoExecReader();
		String strPomPath = "";

		Map<String, CoverageInfo> result = fixture.getSrcClass(strPomPath);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Map<String, CoverageInfo> getUnUsedCase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetUnUsedCase_1()
		throws Exception {
		JacocoExecReader fixture = new JacocoExecReader();
		String strPomPath = "";

		Map<String, CoverageInfo> result = fixture.getUnUsedCase(strPomPath);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<String, CoverageInfo> getUnUsedCase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetUnUsedCase_2()
		throws Exception {
		JacocoExecReader fixture = new JacocoExecReader();
		String strPomPath = "";

		Map<String, CoverageInfo> result = fixture.getUnUsedCase(strPomPath);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<String, CoverageInfo> getUnUsedCase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetUnUsedCase_3()
		throws Exception {
		JacocoExecReader fixture = new JacocoExecReader();
		String strPomPath = "";

		Map<String, CoverageInfo> result = fixture.getUnUsedCase(strPomPath);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<String, CoverageInfo> getUnUsedCase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetUnUsedCase_4()
		throws Exception {
		JacocoExecReader fixture = new JacocoExecReader();
		String strPomPath = "";

		Map<String, CoverageInfo> result = fixture.getUnUsedCase(strPomPath);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int readDump(String,String,HashSet<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testReadDump_1()
		throws Exception {
		JacocoExecReader fixture = new JacocoExecReader();
		String strPomPath = "";
		String strKeyClass = "";
		HashSet<String> hset = new HashSet();

		int result = fixture.readDump(strPomPath, strKeyClass, hset);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int readDump(String,String,HashSet<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testReadDump_2()
		throws Exception {
		JacocoExecReader fixture = new JacocoExecReader();
		String strPomPath = "";
		String strKeyClass = "";
		HashSet<String> hset = new HashSet();

		int result = fixture.readDump(strPomPath, strKeyClass, hset);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int readDump(String,String,HashSet<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testReadDump_3()
		throws Exception {
		JacocoExecReader fixture = new JacocoExecReader();
		String strPomPath = "";
		String strKeyClass = "";
		HashSet<String> hset = new HashSet();

		int result = fixture.readDump(strPomPath, strKeyClass, hset);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int readDump(String,String,HashSet<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testReadDump_4()
		throws Exception {
		JacocoExecReader fixture = new JacocoExecReader();
		String strPomPath = "";
		String strKeyClass = "";
		HashSet<String> hset = new HashSet();

		int result = fixture.readDump(strPomPath, strKeyClass, hset);

		// add additional test code here
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(JacocoExecReader_iTest.class);
	}
}