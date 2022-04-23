/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.mvntools;

import org.junit.*;
import static org.junit.Assert.*;

import org.itest.mvntools.JarInfo;

/**
 * The class <code>JarInfo_iTest</code> contains tests for the class <code>{@link JarInfo}</code>.
 *
 * @generatedBy  at 22-4-12 下午3:33
 * @author 
 * @version $Revision: 1.0 $
 */
public class JarInfo_iTest {
	/**
	 * Run the JarInfo() constructor test.
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testJarInfo_1()
		throws Exception {
		JarInfo result = new JarInfo();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getArtifactId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetArtifactId_1()
		throws Exception {
		JarInfo fixture = new JarInfo();
		fixture.setGroupId("");
		fixture.setVersion("");
		fixture.setArtifactId("");
		fixture.setPackaging("");

		String result = fixture.getArtifactId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getGroupId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetGroupId_1()
		throws Exception {
		JarInfo fixture = new JarInfo();
		fixture.setGroupId("");
		fixture.setVersion("");
		fixture.setArtifactId("");
		fixture.setPackaging("");

		String result = fixture.getGroupId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getPackaging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetPackaging_1()
		throws Exception {
		JarInfo fixture = new JarInfo();
		fixture.setGroupId("");
		fixture.setVersion("");
		fixture.setArtifactId("");
		fixture.setPackaging("");

		String result = fixture.getPackaging();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		JarInfo fixture = new JarInfo();
		fixture.setGroupId("");
		fixture.setVersion("");
		fixture.setArtifactId("");
		fixture.setPackaging("");

		String result = fixture.getVersion();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setArtifactId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testSetArtifactId_1()
		throws Exception {
		JarInfo fixture = new JarInfo();
		fixture.setGroupId("");
		fixture.setVersion("");
		fixture.setArtifactId("");
		fixture.setPackaging("");
		String artifactId = "";

		fixture.setArtifactId(artifactId);

		// add additional test code here
	}

	/**
	 * Run the void setGroupId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testSetGroupId_1()
		throws Exception {
		JarInfo fixture = new JarInfo();
		fixture.setGroupId("");
		fixture.setVersion("");
		fixture.setArtifactId("");
		fixture.setPackaging("");
		String groupId = "";

		fixture.setGroupId(groupId);

		// add additional test code here
	}

	/**
	 * Run the void setPackaging(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testSetPackaging_1()
		throws Exception {
		JarInfo fixture = new JarInfo();
		fixture.setGroupId("");
		fixture.setVersion("");
		fixture.setArtifactId("");
		fixture.setPackaging("");
		String packaging = "";

		fixture.setPackaging(packaging);

		// add additional test code here
	}

	/**
	 * Run the void setVersion(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	@Test
	public void testSetVersion_1()
		throws Exception {
		JarInfo fixture = new JarInfo();
		fixture.setGroupId("");
		fixture.setVersion("");
		fixture.setArtifactId("");
		fixture.setPackaging("");
		String version = "";

		fixture.setVersion(version);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy  at 22-4-12 下午3:33
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
	 * @generatedBy  at 22-4-12 下午3:33
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
	 * @generatedBy  at 22-4-12 下午3:33
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JarInfo_iTest.class);
	}
}