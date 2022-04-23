/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser.infos;

import java.util.List;
import org.easymock.EasyMock;
import org.itest.jacocos.parser.infos.MethodPosInfo;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MethodPosInfo_iTest</code> contains tests for the class <code>{@link MethodPosInfo}</code>.
 *
 * @generatedBy  at 22-4-8 下午4:34
 * @author 
 * @version $Revision: 1.0 $
 */
public class MethodPosInfo_iTest {
	/**
	 * Run the MethodPosInfo() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testMethodPosInfo_1()
		throws Exception {

		MethodPosInfo result = new MethodPosInfo();

		// add additional test code here
		assertNotNull(result);
		assertEquals("MethodName=null\npreEndLine=0\nStartLine=0\nEndLine=0\nStartLineDoc=0\nEndLineDoc=0\nStartLineBody=0\nEndLineBody=0\nReturnType2=null\nModifier=0\nmBody=null\nBodyLength=0\nRowId=0\nJavaDoc=null", result.toString());
		assertEquals(null, result.getMethodName());
		assertEquals(null, result.getReturnType2());
		assertEquals(null, result.getJavaDoc());
		assertEquals(0, result.getMinStartLine());
		assertEquals(0, result.getMaxEndLine());
		assertEquals(0, result.getDocStartLine());
		assertEquals(0, result.getDocEndLine());
		assertEquals(0L, result.getPreEndLine());
		assertEquals(0L, result.getBodyLength());
		assertEquals(0, result.getRowId());
		assertEquals(0, result.getModifier());
		assertEquals(0, result.getStartLineBody());
		assertEquals(null, result.getmBody());
		assertEquals(0, result.getEndLineBody());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		Object o = null;

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		MethodPosInfo o = new MethodPosInfo();
		o.setmBody("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		MethodPosInfo o = new MethodPosInfo();
		o.setmBody("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the List<String> getAnnotation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetAnnotation_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		List<String> result = fixture.getAnnotation();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the long getBodyLength() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetBodyLength_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		long result = fixture.getBodyLength();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the int getDocEndLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetDocEndLine_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		int result = fixture.getDocEndLine();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDocStartLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetDocStartLine_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		int result = fixture.getDocStartLine();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getEndLineBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetEndLineBody_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		int result = fixture.getEndLineBody();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getJavaDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetJavaDoc_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		String result = fixture.getJavaDoc();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getMaxEndLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetMaxEndLine_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		int result = fixture.getMaxEndLine();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getMethodName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetMethodName_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		String result = fixture.getMethodName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getMinStartLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetMinStartLine_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		int result = fixture.getMinStartLine();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getModifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetModifier_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		int result = fixture.getModifier();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the long getPreEndLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetPreEndLine_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		long result = fixture.getPreEndLine();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the String getReturnType2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetReturnType2_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		String result = fixture.getReturnType2();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getRowId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetRowId_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		int result = fixture.getRowId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getStartLineBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetStartLineBody_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		int result = fixture.getStartLineBody();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getmBody() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testGetmBody_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		String result = fixture.getmBody();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setAnnotation(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetAnnotation_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		List<String> inlistAnnotation = EasyMock.createMock(List.class);
		// add mock object expectations here

		EasyMock.replay(inlistAnnotation);

		fixture.setAnnotation(inlistAnnotation);

		// add additional test code here
		EasyMock.verify(inlistAnnotation);
	}

	/**
	 * Run the void setBodyLength(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetBodyLength_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		long bodyLength = 1L;

		fixture.setBodyLength(bodyLength);

		// add additional test code here
	}

	/**
	 * Run the void setDocEndLine(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetDocEndLine_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int docEndLine = 1;

		fixture.setDocEndLine(docEndLine);

		// add additional test code here
	}

	/**
	 * Run the void setDocStartLine(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetDocStartLine_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int docStartLine = 1;

		fixture.setDocStartLine(docStartLine);

		// add additional test code here
	}

	/**
	 * Run the void setEndLineBody(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetEndLineBody_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int endLineBody = 1;

		fixture.setEndLineBody(endLineBody);

		// add additional test code here
	}

	/**
	 * Run the void setEndLineBody(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetEndLineBody_2()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int endLineBody = 0;

		fixture.setEndLineBody(endLineBody);

		// add additional test code here
	}

	/**
	 * Run the void setEndLineBody(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetEndLineBody_3()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(0);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int endLineBody = 1;

		fixture.setEndLineBody(endLineBody);

		// add additional test code here
	}

	/**
	 * Run the void setJavaDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetJavaDoc_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		String javaDoc = "";

		fixture.setJavaDoc(javaDoc);

		// add additional test code here
	}

	/**
	 * Run the void setMaxEndLine(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetMaxEndLine_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int maxEndLine = 1;

		fixture.setMaxEndLine(maxEndLine);

		// add additional test code here
	}

	/**
	 * Run the void setMethodName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetMethodName_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		String mName = "";

		fixture.setMethodName(mName);

		// add additional test code here
	}

	/**
	 * Run the void setMinStartLine(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetMinStartLine_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int minStartLine = 1;

		fixture.setMinStartLine(minStartLine);

		// add additional test code here
	}

	/**
	 * Run the void setMinStartLine(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetMinStartLine_2()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int minStartLine = 1;

		fixture.setMinStartLine(minStartLine);

		// add additional test code here
	}

	/**
	 * Run the void setMinStartLine(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetMinStartLine_3()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int minStartLine = 1;

		fixture.setMinStartLine(minStartLine);

		// add additional test code here
	}

	/**
	 * Run the void setModifier(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetModifier_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int modifier = 1;

		fixture.setModifier(modifier);

		// add additional test code here
	}

	/**
	 * Run the void setPreEndLine(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetPreEndLine_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		long preEndLine = 1L;

		fixture.setPreEndLine(preEndLine);

		// add additional test code here
	}

	/**
	 * Run the void setReturnType2(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetReturnType2_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		String returnType2 = "";

		fixture.setReturnType2(returnType2);

		// add additional test code here
	}

	/**
	 * Run the void setRowId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetRowId_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int rowId = 1;

		fixture.setRowId(rowId);

		// add additional test code here
	}

	/**
	 * Run the void setStartLineBody(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetStartLineBody_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int startLineBody = 1;

		fixture.setStartLineBody(startLineBody);

		// add additional test code here
	}

	/**
	 * Run the void setStartLineBody(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetStartLineBody_2()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(0);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int startLineBody = 1;

		fixture.setStartLineBody(startLineBody);

		// add additional test code here
	}

	/**
	 * Run the void setStartLineBody(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetStartLineBody_3()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		int startLineBody = 0;

		fixture.setStartLineBody(startLineBody);

		// add additional test code here
	}

	/**
	 * Run the void setmBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testSetmBody_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);
		String mBody = "";

		fixture.setmBody(mBody);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-8 下午4:34
	 */
	@Test
	public void testToString_1()
		throws Exception {
		MethodPosInfo fixture = new MethodPosInfo();
		fixture.setmBody("");
		fixture.setJavaDoc("");
		fixture.setRowId(1);
		fixture.setStartLineBody(1);
		fixture.setEndLineBody(1);
		fixture.setMaxEndLine(1);
		fixture.setDocEndLine(1);
		fixture.setDocStartLine(1);
		fixture.setPreEndLine(1L);
		fixture.setBodyLength(1L);
		fixture.setAnnotation(EasyMock.createNiceMock(List.class));
		fixture.setMethodName("");
		fixture.setReturnType2("");
		fixture.setModifier(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("MethodName=\npreEndLine=1\nStartLine=1\nEndLine=1\nStartLineDoc=1\nEndLineDoc=1\nStartLineBody=1\nEndLineBody=1\nReturnType2=\nModifier=1\nmBody=\nBodyLength=1\nRowId=1\nJavaDoc=", result);
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
		new org.junit.runner.JUnitCore().run(MethodPosInfo_iTest.class);
	}
}