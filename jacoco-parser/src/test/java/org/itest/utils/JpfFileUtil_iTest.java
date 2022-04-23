/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.utils;

import java.io.File;
import java.util.Vector;

import org.itest.utils.JpfFileUtil;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JpfFileUtil_iTest</code> contains tests for the class <code>{@link JpfFileUtil}</code>.
 *
 * @generatedBy  at 22-4-12 下午3:34
 * @author 
 * @version $Revision: 1.0 $
 */
public class JpfFileUtil_iTest {
	/**
	 * Run the String getClassFileNameByClassName(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetClassFileNameByClassName_1()
		throws Exception {
		String strPomPath = "";
		String strFullClassName = "";

		String result = JpfFileUtil.getClassFileNameByClassName(strPomPath, strFullClassName);

		// add additional test code here
		assertEquals("\\target\\classes\\.class", result);
	}

	/**
	 * Run the String getClassNameWithDot(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetClassNameWithDot_1()
		throws Exception {
		String strClassName = null;

		String result = JpfFileUtil.getClassNameWithDot(strClassName);

		// add additional test code here
		assertEquals("Object", result);
	}

	/**
	 * Run the String getClassNameWithDot(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetClassNameWithDot_2()
		throws Exception {
		String strClassName = "";

		String result = JpfFileUtil.getClassNameWithDot(strClassName);

		// add additional test code here
		assertEquals("Object", result);
	}

	/**
	 * Run the String getClassNameWithDot(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetClassNameWithDot_3()
		throws Exception {
		String strClassName = "L";

		String result = JpfFileUtil.getClassNameWithDot(strClassName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getClassNameWithDot(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetClassNameWithDot_4()
		throws Exception {
		String strClassName = "";

		String result = JpfFileUtil.getClassNameWithDot(strClassName);

		// add additional test code here
		assertEquals("Object", result);
	}

	/**
	 * Run the String getClassNameWithDot(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetClassNameWithDot_5()
		throws Exception {
		String strClassName = "";

		String result = JpfFileUtil.getClassNameWithDot(strClassName);

		// add additional test code here
		assertEquals("Object", result);
	}

	/**
	 * Run the String getClassNameWithDot(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetClassNameWithDot_6()
		throws Exception {
		String strClassName = "";

		String result = JpfFileUtil.getClassNameWithDot(strClassName);

		// add additional test code here
		assertEquals("Object", result);
	}

	/**
	 * Run the String getClassNameWithSlash(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetClassNameWithSlash_1()
		throws Exception {
		String strClassFullName = "";

		String result = JpfFileUtil.getClassNameWithSlash(strClassFullName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getClassNameWithSlash(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetClassNameWithSlash_2()
		throws Exception {
		String strClassFullName = "";

		String result = JpfFileUtil.getClassNameWithSlash(strClassFullName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFilePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFilePath_1()
		throws Exception {
		String sFilePathName = "";

		String result = JpfFileUtil.getFilePath(sFilePathName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFilePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFilePath_2()
		throws Exception {
		String sFilePathName = "";

		String result = JpfFileUtil.getFilePath(sFilePathName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFilePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFilePath_3()
		throws Exception {
		String sFilePathName = "";

		String result = JpfFileUtil.getFilePath(sFilePathName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileTxt(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFileTxt_1()
		throws Exception {
		String strFileName = null;
		String strEncode = "";

		String result = JpfFileUtil.getFileTxt(strFileName, strEncode);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileTxt(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFileTxt_2()
		throws Exception {
		String strFileName = "";
		String strEncode = "";

		String result = JpfFileUtil.getFileTxt(strFileName, strEncode);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileTxt(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFileTxt_3()
		throws Exception {
		String strFileName = "";
		String strEncode = "";

		String result = JpfFileUtil.getFileTxt(strFileName, strEncode);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileTxt(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFileTxt_4()
		throws Exception {
		String strFileName = "";
		String strEncode = "";

		String result = JpfFileUtil.getFileTxt(strFileName, strEncode);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileTxt(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFileTxt_5()
		throws Exception {
		String strFileName = "";
		String strEncode = "";

		String result = JpfFileUtil.getFileTxt(strFileName, strEncode);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileTxt(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFileTxt_6()
		throws Exception {
		String strFileName = "";
		String strEncode = "";

		String result = JpfFileUtil.getFileTxt(strFileName, strEncode);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileTxt(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFileTxt_7()
		throws Exception {
		String strFileName = "";
		String strEncode = "";

		String result = JpfFileUtil.getFileTxt(strFileName, strEncode);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileTxt(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFileTxt_8()
		throws Exception {
		String strFileName = "";
		String strEncode = null;

		String result = JpfFileUtil.getFileTxt(strFileName, strEncode);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFileTxt(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFileTxt_9()
		throws Exception {
		String strFileName = "";
		String strEncode = "";

		String result = JpfFileUtil.getFileTxt(strFileName, strEncode);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void getFiles(String,Vector<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFiles_1()
		throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();

		JpfFileUtil.getFiles(inFilePath, v);

		// add additional test code here
	}

	/**
	 * Run the void getFiles(String,Vector<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFiles_2()
		throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();

		JpfFileUtil.getFiles(inFilePath, v);

		// add additional test code here
	}

	/**
	 * Run the void getFiles(String,Vector<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFiles_3()
		throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();

		JpfFileUtil.getFiles(inFilePath, v);

		// add additional test code here
	}

	/**
	 * Run the void getFiles(String,Vector<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFiles_4()
		throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();

		JpfFileUtil.getFiles(inFilePath, v);

		// add additional test code here
	}

	/**
	 * Run the void getFiles(String,Vector<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFiles_5()
		throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();

		JpfFileUtil.getFiles(inFilePath, v);

		// add additional test code here
	}

	/**
	 * Run the void getFiles(String,Vector<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFiles_6()
		throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		String strFileType = "";

		JpfFileUtil.getFiles(inFilePath, v, strFileType);

		// add additional test code here
	}

	/**
	 * Run the void getFiles(String,Vector<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFiles_7()
		throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		String strFileType = "";

		JpfFileUtil.getFiles(inFilePath, v, strFileType);

		// add additional test code here
	}

	/**
	 * Run the void getFilesWithFilter(String,Vector<String>,MyFilter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFilesWithFilter_1()
		throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		JpfFileUtil.MyFilter cMyFilter = new JpfFileUtil.MyFilter("");

		JpfFileUtil.getFilesWithFilter(inFilePath, v, cMyFilter);

		// add additional test code here
	}

	/**
	 * Run the void getFilesWithFilter(String,Vector<String>,MyFilter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFilesWithFilter_2()
		throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		JpfFileUtil.MyFilter cMyFilter = new JpfFileUtil.MyFilter("");

		JpfFileUtil.getFilesWithFilter(inFilePath, v, cMyFilter);

		// add additional test code here
	}

	/**
	 * Run the void getFilesWithFilter(String,Vector<String>,MyFilter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFilesWithFilter_3()
		throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		JpfFileUtil.MyFilter cMyFilter = new JpfFileUtil.MyFilter("");

		JpfFileUtil.getFilesWithFilter(inFilePath, v, cMyFilter);

		// add additional test code here
	}

	/**
	 * Run the void getFilesWithFilter(String,Vector<String>,MyFilter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFilesWithFilter_4()
		throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		JpfFileUtil.MyFilter cMyFilter = new JpfFileUtil.MyFilter("");

		JpfFileUtil.getFilesWithFilter(inFilePath, v, cMyFilter);

		// add additional test code here
	}

	/**
	 * Run the void getFilesWithFilter(String,Vector<String>,MyFilter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetFilesWithFilter_5()
		throws Exception {
		String inFilePath = "";
		Vector<String> v = new Vector();
		JpfFileUtil.MyFilter cMyFilter = new JpfFileUtil.MyFilter("");

		JpfFileUtil.getFilesWithFilter(inFilePath, v, cMyFilter);

		// add additional test code here
	}

	/**
	 * Run the String getFullClassNameBySrcFileName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.StringIndexOutOfBoundsException.class)
	public void testGetFullClassNameBySrcFileName_1()
		throws Exception {
		String strSrcFileName = "";

		String result = JpfFileUtil.getFullClassNameBySrcFileName(strSrcFileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getJacocoFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetJacocoFile_1()
		throws Exception {
		String strPomPath = "";

		String result = JpfFileUtil.getJacocoFile(strPomPath);

		// add additional test code here
		assertEquals("\\target\\jacoco.exec", result);
	}

	/**
	 * Run the String getMainClassPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetMainClassPath_1()
		throws Exception {
		String strPomPath = "";

		String result = JpfFileUtil.getMainClassPath(strPomPath);

		// add additional test code here
		assertEquals("\\target\\classes", result);
	}

	/**
	 * Run the String getSourceClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetSourceClass_1()
		throws Exception {
		String strTestMethodName = "";

		String result = JpfFileUtil.getSourceClass(strTestMethodName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSourceClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetSourceClass_2()
		throws Exception {
		String strTestMethodName = "";

		String result = JpfFileUtil.getSourceClass(strTestMethodName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSrcMainJavaFileNameByClassName(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetSrcMainJavaFileNameByClassName_1()
		throws Exception {
		String strPomPath = "";
		String strFullClassName = "";

		String result = JpfFileUtil.getSrcMainJavaFileNameByClassName(strPomPath, strFullClassName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getSrcMainJavaFileNameByClassName(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetSrcMainJavaFileNameByClassName_2()
		throws Exception {
		String strPomPath = "";
		String strFullClassName = "";

		String result = JpfFileUtil.getSrcMainJavaFileNameByClassName(strPomPath, strFullClassName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getSrcMainJavaPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetSrcMainJavaPath_1()
		throws Exception {
		String strPomPath = "";

		String result = JpfFileUtil.getSrcMainJavaPath(strPomPath);

		// add additional test code here
		assertEquals("\\src\\main\\java", result);
	}

	/**
	 * Run the String getSrcTestFileNameByTestClassFileName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetSrcTestFileNameByTestClassFileName_1()
		throws Exception {
		String strTestClassFileName = "";

		String result = JpfFileUtil.getSrcTestFileNameByTestClassFileName(strTestClassFileName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSurefireReportsPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetSurefireReportsPath_1()
		throws Exception {
		String strPomPath = "";

		String result = JpfFileUtil.getSurefireReportsPath(strPomPath);

		// add additional test code here
		assertEquals("\\target\\surefire-reports", result);
	}

	/**
	 * Run the String getTestedMethodName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetTestedMethodName_1()
		throws Exception {
		String strTestMethodName = "";

		String result = JpfFileUtil.getTestedMethodName(strTestMethodName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTestedMethodName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testGetTestedMethodName_2()
		throws Exception {
		String strTestMethodName = "";

		String result = JpfFileUtil.getTestedMethodName(strTestMethodName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isFile(File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testIsFile_1()
		throws Exception {
		File dir = new File("");
		String name = "";

		boolean result = JpfFileUtil.isFile(dir, name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFile(File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testIsFile_2()
		throws Exception {
		File dir = new File("");
		String name = "";

		boolean result = JpfFileUtil.isFile(dir, name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFile(File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testIsFile_3()
		throws Exception {
		File dir = new File("");
		String name = "";

		boolean result = JpfFileUtil.isFile(dir, name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFileExist(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testIsFileExist_1()
		throws Exception {
		String strFileName = "";

		boolean result = JpfFileUtil.isFileExist(strFileName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFileExist(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testIsFileExist_2()
		throws Exception {
		String strFileName = "";

		boolean result = JpfFileUtil.isFileExist(strFileName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFileExist(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testIsFileExist_3()
		throws Exception {
		String strFileName = "";

		boolean result = JpfFileUtil.isFileExist(strFileName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isWindows() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testIsWindows_1()
		throws Exception {

		boolean result = JpfFileUtil.isWindows();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isWindows() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testIsWindows_2()
		throws Exception {

		boolean result = JpfFileUtil.isWindows();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the String joinPath(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testJoinPath_1()
		throws Exception {
		String strPath1 = null;
		String strPath2 = "";

		String result = JpfFileUtil.joinPath(strPath1, strPath2);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String joinPath(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testJoinPath_2()
		throws Exception {
		String strPath1 = "";
		String strPath2 = null;

		String result = JpfFileUtil.joinPath(strPath1, strPath2);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String joinPath(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testJoinPath_3()
		throws Exception {
		String strPath1 = "";
		String strPath2 = "";

		String result = JpfFileUtil.joinPath(strPath1, strPath2);

		// add additional test code here
		assertEquals("\\", result);
	}

	/**
	 * Run the String joinPath(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testJoinPath_4()
		throws Exception {
		String strPath1 = "";
		String strPath2 = "";

		String result = JpfFileUtil.joinPath(strPath1, strPath2);

		// add additional test code here
		assertEquals("\\", result);
	}

	/**
	 * Run the String joinPath(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testJoinPath_5()
		throws Exception {
		String strPath1 = "";
		String strPath2 = "";

		String result = JpfFileUtil.joinPath(strPath1, strPath2);

		// add additional test code here
		assertEquals("\\", result);
	}

	/**
	 * Run the String joinPath(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testJoinPath_6()
		throws Exception {
		String strPath1 = "";
		String strPath2 = "";

		String result = JpfFileUtil.joinPath(strPath1, strPath2);

		// add additional test code here
		assertEquals("\\", result);
	}

	/**
	 * Run the String joinPath(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test
	public void testJoinPath_7()
		throws Exception {
		String strPath1 = "";
		String strPath2 = "";
		String strPath3 = "";

		String result = JpfFileUtil.joinPath(strPath1, strPath2, strPath3);

		// add additional test code here
		assertEquals("\\", result);
	}

	/**
	 * Run the void mkDirs(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.SecurityException.class)
	public void testMkDirs_1()
		throws Exception {
		String strTestFileName = "";

		JpfFileUtil.mkDirs(strTestFileName);

		// add additional test code here
	}

	/**
	 * Run the void mkDirs(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.SecurityException.class)
	public void testMkDirs_2()
		throws Exception {
		String strTestFileName = "";

		JpfFileUtil.mkDirs(strTestFileName);

		// add additional test code here
	}

	/**
	 * Run the void saveFile(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 22-4-12 下午3:34
	 */
	@Test(expected = java.lang.SecurityException.class)
	public void testSaveFile_1()
		throws Exception {
		String strFileFullName = "";
		String str = "";
		String strEncoding = "";

		JpfFileUtil.saveFile(strFileFullName, str, strEncoding);

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
		new org.junit.runner.JUnitCore().run(JpfFileUtil_iTest.class);
	}
}