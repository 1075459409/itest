/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.utils;

import java.io.Closeable;
import org.easymock.EasyMock;
import org.itest.utils.JpfCloseUtil;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JpfCloseUtil_iTest</code> contains tests for the class <code>{@link JpfCloseUtil}</code>.
 *
 * @generatedBy  at 22-4-12 下午3:34
 * @author 
 * @version $Revision: 1.0 $
 */
public class JpfCloseUtil_iTest {
	/**
	 * Run the void close(Closeable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testClose_1()
		throws Exception {
		Closeable c = EasyMock.createMock(Closeable.class);
		// add mock object expectations here

		EasyMock.replay(c);

		JpfCloseUtil.close(c);

		// add additional test code here
		EasyMock.verify(c);
	}

	/**
	 * Run the void close(Closeable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testClose_2()
		throws Exception {
		Closeable c = null;

		JpfCloseUtil.close(c);

		// add additional test code here
	}

	/**
	 * Run the void close(Closeable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testClose_3()
		throws Exception {
		Closeable c = EasyMock.createMock(Closeable.class);
		// add mock object expectations here

		EasyMock.replay(c);

		JpfCloseUtil.close(c);

		// add additional test code here
		EasyMock.verify(c);
	}

	/**
	 * Run the void close(AutoCloseable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testClose_4()
		throws Exception {
		AutoCloseable c = EasyMock.createMock(AutoCloseable.class);
		// add mock object expectations here

		EasyMock.replay(c);

		JpfCloseUtil.close(c);

		// add additional test code here
		EasyMock.verify(c);
	}

	/**
	 * Run the void close(AutoCloseable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testClose_5()
		throws Exception {
		AutoCloseable c = null;

		JpfCloseUtil.close(c);

		// add additional test code here
	}

	/**
	 * Run the void close(AutoCloseable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testClose_6()
		throws Exception {
		AutoCloseable c = EasyMock.createMock(AutoCloseable.class);
		// add mock object expectations here

		EasyMock.replay(c);

		JpfCloseUtil.close(c);

		// add additional test code here
		EasyMock.verify(c);
	}

	/**
	 * Run the void destroyProcess(Process) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testDestroyProcess_1()
		throws Exception {
		Process p = null;

		JpfCloseUtil.destroyProcess(p);

		// add additional test code here
	}

	/**
	 * Run the void destroyProcess(Process) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testDestroyProcess_2()
		throws Exception {
		Process p = null;

		JpfCloseUtil.destroyProcess(p);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(JpfCloseUtil_iTest.class);
	}
}