/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.utils;

import java.io.FileNotFoundException;
import org.easymock.EasyMock;
import org.itest.utils.Jpfw3cXmlUtil;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXParseException;

/**
 * The class <code>Jpfw3cXmlUtil_iTest</code> contains tests for the class <code>{@link Jpfw3cXmlUtil}</code>.
 *
 * @generatedBy  at 22-4-12 下午3:34
 * @author 
 * @version $Revision: 1.0 $
 */
public class Jpfw3cXmlUtil_iTest {
	/**
	 * Run the Element getChildElement(Element,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetChildElement_1()
		throws Exception {
		Element mElement = EasyMock.createMock(Element.class);
		String strTagName = "";
		// add mock object expectations here

		EasyMock.replay(mElement);

		Element result = Jpfw3cXmlUtil.getChildElement(mElement, strTagName);

		// add additional test code here
		EasyMock.verify(mElement);
		assertNotNull(result);
	}

	/**
	 * Run the Element getChildElement(Element,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetChildElement_2()
		throws Exception {
		Element mElement = EasyMock.createMock(Element.class);
		String strTagName = "";
		// add mock object expectations here

		EasyMock.replay(mElement);

		Element result = Jpfw3cXmlUtil.getChildElement(mElement, strTagName);

		// add additional test code here
		EasyMock.verify(mElement);
		assertNotNull(result);
	}

	/**
	 * Run the Element getElementFromXml(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetElementFromXml_1()
		throws Exception {
		String TagsName = null;
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.getElementFromXml(TagsName, in_FileName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getElementFromXml(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetElementFromXml_2()
		throws Exception {
		String TagsName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.getElementFromXml(TagsName, in_FileName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getElementFromXml(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetElementFromXml_3()
		throws Exception {
		String TagsName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.getElementFromXml(TagsName, in_FileName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getElementFromXml(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetElementFromXml_4()
		throws Exception {
		String TagsName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.getElementFromXml(TagsName, in_FileName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getElementFromXml(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetElementFromXml_5()
		throws Exception {
		String TagsName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.getElementFromXml(TagsName, in_FileName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Element getElementFromXml(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetElementFromXml_6()
		throws Exception {
		String TagsName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.getElementFromXml(TagsName, in_FileName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the NodeList getNodeList(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetNodeList_1()
		throws Exception {
		String in_Tag = "";
		String in_FileName = "";

		NodeList result = Jpfw3cXmlUtil.getNodeList(in_Tag, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the NodeList getNodeList(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetNodeList_2()
		throws Exception {
		String in_Tag = "";
		String in_FileName = "";

		NodeList result = Jpfw3cXmlUtil.getNodeList(in_Tag, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the NodeList getNodeList(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetNodeList_3()
		throws Exception {
		String in_Tag = "";
		String in_FileName = "";

		NodeList result = Jpfw3cXmlUtil.getNodeList(in_Tag, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the NodeList getNodeList(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetNodeList_4()
		throws Exception {
		String in_Tag = "";
		String in_FileName = "";

		NodeList result = Jpfw3cXmlUtil.getNodeList(in_Tag, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean getParBoolValue(Element,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetParBoolValue_1()
		throws Exception {
		Element in_el = EasyMock.createMock(Element.class);
		String in_ParName = "";
		// add mock object expectations here

		EasyMock.replay(in_el);

		boolean result = Jpfw3cXmlUtil.getParBoolValue(in_el, in_ParName);

		// add additional test code here
		EasyMock.verify(in_el);
		assertTrue(result);
	}

	/**
	 * Run the boolean getParBoolValue(Element,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetParBoolValue_2()
		throws Exception {
		Element in_el = EasyMock.createMock(Element.class);
		String in_ParName = "";
		// add mock object expectations here

		EasyMock.replay(in_el);

		boolean result = Jpfw3cXmlUtil.getParBoolValue(in_el, in_ParName);

		// add additional test code here
		EasyMock.verify(in_el);
		assertTrue(result);
	}

	/**
	 * Run the int getParIntValue(Element,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetParIntValue_1()
		throws Exception {
		Element in_el = EasyMock.createMock(Element.class);
		String in_ParName = "";
		// add mock object expectations here

		EasyMock.replay(in_el);

		int result = Jpfw3cXmlUtil.getParIntValue(in_el, in_ParName);

		// add additional test code here
		EasyMock.verify(in_el);
		assertEquals(0, result);
	}

	/**
	 * Run the int getParIntValue(Element,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetParIntValue_2()
		throws Exception {
		Element in_el = EasyMock.createMock(Element.class);
		String in_ParName = "";
		// add mock object expectations here

		EasyMock.replay(in_el);

		int result = Jpfw3cXmlUtil.getParIntValue(in_el, in_ParName);

		// add additional test code here
		EasyMock.verify(in_el);
		assertEquals(0, result);
	}

	/**
	 * Run the int getParIntValue(Element,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetParIntValue_3()
		throws Exception {
		Element in_el = EasyMock.createMock(Element.class);
		String in_ParName = "";
		int defaultValue = 1;
		// add mock object expectations here

		EasyMock.replay(in_el);

		int result = Jpfw3cXmlUtil.getParIntValue(in_el, in_ParName, defaultValue);

		// add additional test code here
		EasyMock.verify(in_el);
		assertEquals(1, result);
	}

	/**
	 * Run the int getParIntValue(Element,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetParIntValue_4()
		throws Exception {
		Element in_el = EasyMock.createMock(Element.class);
		String in_ParName = "";
		int defaultValue = 1;
		// add mock object expectations here

		EasyMock.replay(in_el);

		int result = Jpfw3cXmlUtil.getParIntValue(in_el, in_ParName, defaultValue);

		// add additional test code here
		EasyMock.verify(in_el);
		assertEquals(1, result);
	}

	/**
	 * Run the String getParStrValue(Element,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetParStrValue_1()
		throws Exception {
		Element in_el = EasyMock.createMock(Element.class);
		String in_ParName = "";
		// add mock object expectations here

		EasyMock.replay(in_el);

		String result = Jpfw3cXmlUtil.getParStrValue(in_el, in_ParName);

		// add additional test code here
		EasyMock.verify(in_el);
		assertNotNull(result);
	}

	/**
	 * Run the String getParStrValue(Element,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetParStrValue_2()
		throws Exception {
		Element in_el = EasyMock.createMock(Element.class);
		String in_ParName = "";
		// add mock object expectations here

		EasyMock.replay(in_el);

		String result = Jpfw3cXmlUtil.getParStrValue(in_el, in_ParName);

		// add additional test code here
		EasyMock.verify(in_el);
		assertNotNull(result);
	}

	/**
	 * Run the String getParStrValue(Element,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetParStrValue_3()
		throws Exception {
		Element in_el = EasyMock.createMock(Element.class);
		String in_ParName = "";
		// add mock object expectations here

		EasyMock.replay(in_el);

		String result = Jpfw3cXmlUtil.getParStrValue(in_el, in_ParName);

		// add additional test code here
		EasyMock.verify(in_el);
		assertNotNull(result);
	}

	/**
	 * Run the String getParStrValue2(Element,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetParStrValue2_1()
		throws Exception {
		Element in_el = EasyMock.createMock(Element.class);
		String in_ParName = "";
		// add mock object expectations here

		EasyMock.replay(in_el);

		String result = Jpfw3cXmlUtil.getParStrValue2(in_el, in_ParName);

		// add additional test code here
		EasyMock.verify(in_el);
		assertNotNull(result);
	}

	/**
	 * Run the String getParStrValue2(Element,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetParStrValue2_2()
		throws Exception {
		Element in_el = EasyMock.createMock(Element.class);
		String in_ParName = "";
		// add mock object expectations here

		EasyMock.replay(in_el);

		String result = Jpfw3cXmlUtil.getParStrValue2(in_el, in_ParName);

		// add additional test code here
		EasyMock.verify(in_el);
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetRootElement_1()
		throws Exception {
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.getRootElement(in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetRootElement_2()
		throws Exception {
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.getRootElement(in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetRootElement_3()
		throws Exception {
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.getRootElement(in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element getRootElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testGetRootElement_4()
		throws Exception {
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.getRootElement(in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRootElementAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetRootElementAttribute_1()
		throws Exception {
		String in_AttributeName = "";
		String in_FileName = "";

		String result = Jpfw3cXmlUtil.getRootElementAttribute(in_AttributeName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRootElementAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetRootElementAttribute_2()
		throws Exception {
		String in_AttributeName = "";
		String in_FileName = "";

		String result = Jpfw3cXmlUtil.getRootElementAttribute(in_AttributeName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRootElementAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetRootElementAttribute_3()
		throws Exception {
		String in_AttributeName = "";
		String in_FileName = "";

		String result = Jpfw3cXmlUtil.getRootElementAttribute(in_AttributeName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRootElementAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetRootElementAttribute_4()
		throws Exception {
		String in_AttributeName = "";
		String in_FileName = "";

		String result = Jpfw3cXmlUtil.getRootElementAttribute(in_AttributeName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRootElementAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetRootElementAttribute_5()
		throws Exception {
		String in_AttributeName = "";
		String in_FileName = "";

		String result = Jpfw3cXmlUtil.getRootElementAttribute(in_AttributeName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRootElementAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetRootElementAttribute_6()
		throws Exception {
		String in_AttributeName = "";
		String in_FileName = "";

		String result = Jpfw3cXmlUtil.getRootElementAttribute(in_AttributeName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRootElementAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetRootElementAttribute_7()
		throws Exception {
		String in_AttributeName = "";
		String in_FileName = "";

		String result = Jpfw3cXmlUtil.getRootElementAttribute(in_AttributeName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRootElementAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetRootElementAttribute_8()
		throws Exception {
		String in_AttributeName = "";
		String in_FileName = "";

		String result = Jpfw3cXmlUtil.getRootElementAttribute(in_AttributeName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRootElementAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetRootElementAttribute_9()
		throws Exception {
		String in_AttributeName = "";
		String in_FileName = "";

		String result = Jpfw3cXmlUtil.getRootElementAttribute(in_AttributeName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRootElementAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetRootElementAttribute_10()
		throws Exception {
		String in_AttributeName = "";
		String in_FileName = "";

		String result = Jpfw3cXmlUtil.getRootElementAttribute(in_AttributeName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element paraseXMLFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParaseXMLFile_1()
		throws Exception {
		String in_TagName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.paraseXMLFile(in_TagName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element paraseXMLFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParaseXMLFile_2()
		throws Exception {
		String in_TagName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.paraseXMLFile(in_TagName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element paraseXMLFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParaseXMLFile_3()
		throws Exception {
		String in_TagName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.paraseXMLFile(in_TagName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element paraseXMLFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParaseXMLFile_4()
		throws Exception {
		String in_TagName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.paraseXMLFile(in_TagName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element paraseXMLFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testParaseXMLFile_5()
		throws Exception {
		String in_TagName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.paraseXMLFile(in_TagName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element readXMLFile(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile_1()
		throws Exception {
		String in_FirstTagName = "";
		String in_SecondTagName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.readXMLFile(in_FirstTagName, in_SecondTagName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element readXMLFile(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile_2()
		throws Exception {
		String in_FirstTagName = "";
		String in_SecondTagName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.readXMLFile(in_FirstTagName, in_SecondTagName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element readXMLFile(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile_3()
		throws Exception {
		String in_FirstTagName = "";
		String in_SecondTagName = "";
		String in_FileName = "";

		Element result = Jpfw3cXmlUtil.readXMLFile(in_FirstTagName, in_SecondTagName, in_FileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element readXMLFile2(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile2_1()
		throws Exception {
		String in_FileName = "";
		String in_TagName = "";
		String strSecondNode = "";

		Element result = Jpfw3cXmlUtil.readXMLFile2(in_FileName, in_TagName, strSecondNode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element readXMLFile2(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile2_2()
		throws Exception {
		String in_FileName = "";
		String in_TagName = "";
		String strSecondNode = "";

		Element result = Jpfw3cXmlUtil.readXMLFile2(in_FileName, in_TagName, strSecondNode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Element readXMLFile2(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile2_3()
		throws Exception {
		String in_FileName = "";
		String in_TagName = "";
		String strSecondNode = "";

		Element result = Jpfw3cXmlUtil.readXMLFile2(in_FileName, in_TagName, strSecondNode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readXMLFile3(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile3_1()
		throws Exception {
		String in_FileName = "";
		String in_TagName = "";

		String result = Jpfw3cXmlUtil.readXMLFile3(in_FileName, in_TagName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readXMLFile3(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile3_2()
		throws Exception {
		String in_FileName = "";
		String in_TagName = "";

		String result = Jpfw3cXmlUtil.readXMLFile3(in_FileName, in_TagName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readXMLFile3(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile3_3()
		throws Exception {
		String in_FileName = "";
		String in_TagName = "";

		String result = Jpfw3cXmlUtil.readXMLFile3(in_FileName, in_TagName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readXMLFile3(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile3_4()
		throws Exception {
		String in_FileName = "";
		String in_TagName = "";

		String result = Jpfw3cXmlUtil.readXMLFile3(in_FileName, in_TagName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readXMLFile3(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile3_5()
		throws Exception {
		String in_FileName = "";
		String in_TagName = "";

		String result = Jpfw3cXmlUtil.readXMLFile3(in_FileName, in_TagName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readXMLFile3(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile3_6()
		throws Exception {
		String in_FileName = "";
		String in_TagName = "";

		String result = Jpfw3cXmlUtil.readXMLFile3(in_FileName, in_TagName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readXMLFile3(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile3_7()
		throws Exception {
		String in_FileName = "";
		String in_TagName = "";

		String result = Jpfw3cXmlUtil.readXMLFile3(in_FileName, in_TagName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readXMLFile3(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = org.xml.sax.SAXParseException.class)
	public void testReadXMLFile3_8()
		throws Exception {
		String in_FileName = "";
		String in_TagName = "";

		String result = Jpfw3cXmlUtil.readXMLFile3(in_FileName, in_TagName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void stripNonValidXMLChars(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testStripNonValidXMLChars_1()
		throws Exception {
		String strFileName = "";

		Jpfw3cXmlUtil.stripNonValidXMLChars(strFileName);

		// add additional test code here
	}

	/**
	 * Run the void stripNonValidXMLChars(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testStripNonValidXMLChars_2()
		throws Exception {
		String strFileName = "";

		Jpfw3cXmlUtil.stripNonValidXMLChars(strFileName);

		// add additional test code here
	}

	/**
	 * Run the void stripNonValidXMLChars(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testStripNonValidXMLChars_3()
		throws Exception {
		String strFileName = "";

		Jpfw3cXmlUtil.stripNonValidXMLChars(strFileName);

		// add additional test code here
	}

	/**
	 * Run the void stripNonValidXMLChars(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testStripNonValidXMLChars_4()
		throws Exception {
		String strFileName = "";

		Jpfw3cXmlUtil.stripNonValidXMLChars(strFileName);

		// add additional test code here
	}

	/**
	 * Run the void stripNonValidXMLChars(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testStripNonValidXMLChars_5()
		throws Exception {
		String strFileName = "";

		Jpfw3cXmlUtil.stripNonValidXMLChars(strFileName);

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
		new org.junit.runner.JUnitCore().run(Jpfw3cXmlUtil_iTest.class);
	}
}