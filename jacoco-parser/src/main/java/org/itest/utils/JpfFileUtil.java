/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Vector;

import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class JpfFileUtil {

	private static final Logger logger = LogManager.getLogger();

	private JpfFileUtil() {
	}

	// JACOCO文件
	public static final String JacocoFileName = "target" + java.io.File.separator + "jacoco.exec";

	public final static String FileSep = java.io.File.separator;

	public final static String CLASS_MAIN_PATH = "target" + java.io.File.separator + "classes";

	public final static String CLASS_TEST_PATH = "target" + java.io.File.separator + "test-classes";

	public final static String SRC_MAIN_JAVA_PATH = "src" + java.io.File.separator + "main" + java.io.File.separator
			+ "java";

	public final static String SRC_TEST_JAVA_PATH = "src" + java.io.File.separator + "test" + java.io.File.separator
			+ "java";

	public static String getSurefireReportsPath(final String strPomPath) {
		return joinPath(strPomPath, "target" + JpfFileUtil.FileSep + "surefire-reports");
	}


	/**
	 * @category 功能
	 * @return
	 
	 * @Date :2022年4月8日上午10:44:46
	 */
	public static String getJacocoFile(final String strPomPath) {
		return joinPath(strPomPath, JacocoFileName);
	}

	/**
	 * 
	 @
	 * @param strPath1
	 * @param strPath2
	 * @return 2020年3月21日
	 */
	public static String joinPath(String strPath1, String strPath2) {
		if (null == strPath1) {
			return null;
		}
		if (null == strPath2) {
			return strPath1;
		}
		if (strPath1.endsWith(FileSep)) {
			if (strPath2.startsWith(FileSep)) {
				return strPath1 + strPath2.substring(1, strPath2.length());
			} else {
				return strPath1 + strPath2;
			}
		}

		if (strPath2.startsWith(FileSep)) {
			return strPath1 + strPath2;
		} else {
			return strPath1 + FileSep + strPath2;
		}

	}
	/**
	 * 
	 * @category 功能
	 * @param strPath1
	 * @param strPath2
	 * @param strPath3
	 * @return
	 
	 * @Date :2022年4月12日上午9:16:43
	 */
	public static String joinPath(String strPath1, String strPath2, String strPath3) {
		return joinPath(joinPath(strPath1, strPath2), strPath3);
	}
	/**
	 * @category 功能
	 * @param strJacocoFileName
	 * @return
	 
	 * @Date :2022年4月8日上午10:44:59
	 */
	public static boolean isFileExist(String strFileName) {
		if (JacocosUtil.isEmpty(strFileName)) {
			return false;
		}
		File file = new File(strFileName);
		if (file.exists()) {
			return true;
		}

		return false;
	}

	/**
	 * @category 功能
	 * @param name
	 * @return
	 
	 * @Date :2022年4月8日上午10:50:14
	 */
	public static String getClassFileNameByClassName(final String strPomPath, String strFullClassName) {
		strFullClassName = strFullClassName.replaceAll("\\.", "/");
		return joinPath(getMainClassPath(strPomPath), strFullClassName + ".class");

	}

	public static String getMainClassPath(final String strPomPath) {
		return joinPath(strPomPath, CLASS_MAIN_PATH);
	}

	/**
	 * @category 功能
	 * @param name
	 * @return
	 
	 * @Date :2022年4月8日上午10:50:24
	 */
	public static String getSrcMainJavaFileNameByClassName(final String strPomPath, final String strFullClassName) {

		String strSourceClassName = getClassNameWithSlash(strFullClassName) + ".java";

		strSourceClassName = joinPath(getSrcMainJavaPath(strPomPath), strSourceClassName);
		if (logger.isTraceEnabled()) {
			logger.trace(strSourceClassName);
		}
		if (isFileExist(strSourceClassName)) {
			return strSourceClassName;
		}
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public static boolean isWindows() {
		String os = System.getProperty("os.name");
		// System.out.println(os);
		if (os.trim().toLowerCase().startsWith("windows")) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param strClassFullName
	 * @return
	 */
	public static String getClassNameWithSlash(String strClassFullName) {

		if (isWindows()) {
			return strClassFullName.replaceAll("\\.", "\\\\");
		}
		return strClassFullName.replaceAll("\\.", "/");

	}

	/**
	 * @category 功能
	 * @param string
	 * @return
	 
	 * @Date :2022年4月8日上午10:50:34
	 */
	public static String getTestedMethodName(String strTestMethodName) {
		// "cn.luischen.utils.UUID_UU64_0113_190014_107"
		// cn.luischen.utils.UUID_UU64_WGTest%%test_UU64_0113_190011_605_7_0
		if (logger.isDebugEnabled()) {
			logger.debug(strTestMethodName);
		}
		strTestMethodName = strTestMethodName.replaceAll(".*_iTest%%", "").replaceAll(".*_WGTest%%", "").replace("test_", "")
				.replaceAll("_\\d{8}_\\d{6}_\\d{3}.*", "").replaceAll("_\\d{4}_\\d{6}_\\d{3}.*", "");

		if (logger.isDebugEnabled()) {
			logger.debug(strTestMethodName);
		}
		return strTestMethodName;
	}

	/**
	 * @category 功能
	 * @param id
	 * @return
	 
	 * @Date :2022年4月8日上午10:51:35
	 */
	public static String getSourceClass(final String strTestMethodName) {
		int iPos = strTestMethodName.indexOf("_");
		if (iPos < 0) {
			return "";
		}
		String strResult = strTestMethodName.substring(0, iPos);

		strResult = strResult.replaceAll("\\.", "/");
		return strResult;
	}

	/**
	 * 
	 * @param strTestClassFileName
	 * @return
	 */
	public static String getSrcTestFileNameByTestClassFileName(String strTestClassFileName) {
		return strTestClassFileName.replace(CLASS_TEST_PATH, SRC_TEST_JAVA_PATH).replace(".class", ".java");

	}

	/**
	 * 
	 * @param strPomPath
	 * @return
	 */
	public static String getSrcMainJavaPath(String strPomPath) {
		return joinPath(strPomPath, SRC_MAIN_JAVA_PATH);

	}

	/**
	 * 
	 * @param inFilePath
	 * @param v
	 * @throws Exception
	 */
	public static void getFiles(String inFilePath, Vector<String> v) throws Exception {
		// String strFile = "";
		try {
			File f1 = new File(inFilePath);
			if (f1.isDirectory()) {
				File[] f2 = f1.listFiles();
				if (f2 != null) {
					for (int i = 0; i < f2.length; i++) {
						// strFile = f2[i].toString();

						if (f2[i].isDirectory()) {
							getFiles(f2[i].toString(), v);
						} else {
							v.add(f2[i].toString());
						}

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static String getFullClassNameBySrcFileName(String strSrcFileName) {

		String strClassName = strSrcFileName.substring(
				strSrcFileName.indexOf(SRC_MAIN_JAVA_PATH) + SRC_MAIN_JAVA_PATH.length() + 1,
				strSrcFileName.length() - 5);
		strClassName = strClassName.replaceAll("\\\\", ".").replaceAll("/", ".");

		return strClassName;
	}

	public static String getClassNameWithDot(String strClassName) {
		if (strClassName == null || strClassName.trim().length() == 0) {
			return "Object";
		}
		if (strClassName.startsWith("L") && !strClassName.startsWith("Long") && !strClassName.startsWith("List")) {
			strClassName = strClassName.substring(1, strClassName.length());
		}
		if (strClassName.startsWith(".")) {
			strClassName = strClassName.substring(1, strClassName.length());
		}
		return strClassName.replaceAll("/", ".").replaceAll("\\\\", ".");
	}

	public static String getFileTxt(String strFileName, String strEncode) throws Exception {
		if (null == strFileName || 0 == strFileName.trim().length()) {
			return "";
		}
		File f = new File(strFileName);
		if (!f.exists()) {

			return "";
		}
		// logger.info("strChat:" + strChat);
		StringBuilder sb = new StringBuilder();
		FileInputStream in = null;
		BufferedReader br = null;
		try {

			in = new FileInputStream(f);
			// 指定读取文件时以UTF-8的格式读取
			if (null == strEncode) {
				strEncode = Charset.defaultCharset().name();
			}
			// logger.info("strChat:" + strChat);
			br = new BufferedReader(new InputStreamReader(in, strEncode));

			String line = br.readLine();
			while (line != null) {
				sb.append(line).append(JacocosUtil.LINE_SEPARATOR);
				line = br.readLine();
			}
			br.close();
		} finally {
			JpfCloseUtil.close(br);
			JpfCloseUtil.close(in);
		}
		return sb.toString();
	}

	public static void saveFile(String strFileFullName, String str, String strEncoding) throws Exception {
		FileOutputStream fout = null;
		OutputStreamWriter osw = null;
		try {

			mkDirs(strFileFullName);

			fout = new FileOutputStream(strFileFullName);
			osw = new OutputStreamWriter(fout, strEncoding);
			osw.write(str);
			osw.flush();

		} catch (Exception e) {
			throw e;
		} finally {
			JpfCloseUtil.close(osw);
			JpfCloseUtil.close(fout);
		}
	}

	public static void mkDirs(String strTestFileName) throws Exception {
		// System.out.println(strTestFileName);
		strTestFileName = getFilePath(strTestFileName);
		// System.out.println("mkDirs:"+strTestFileName);
		File fp = new File(strTestFileName);
		// 创建目录
		if (!fp.exists()) {
			fp.mkdirs();
		}

	}
	public static void main(String[] args)
	{
		String filename="D:\\tdw\\财通证券财路通\\abc.txt";
		System.out.println(FilenameUtils.getFullPath(filename));
		System.out.println(getFilePath(filename));
	}
	public static String getFilePath(String sFilePathName) {
		
		return FilenameUtils.getFullPath(sFilePathName);
		/*
		 * int i = sFilePathName.lastIndexOf("/"); if (i > 0) { sFilePathName =
		 * sFilePathName.substring(0, i); return sFilePathName; }
		 * 
		 * i = sFilePathName.lastIndexOf(File.separator);
		 * 
		 * if (i > 0) { sFilePathName = sFilePathName.substring(0, i); } return
		 * sFilePathName;
		 */

	}

	public static void getFiles(String inFilePath, Vector<String> v, String strFileType) throws Exception {
		MyFilter cMyFilter = new MyFilter(strFileType);
		getFilesWithFilter(inFilePath, v, cMyFilter);
	}

	static class MyFilter implements FilenameFilter {
		private String[] types;

		public MyFilter(String type) {
			this.types = type.split(";");
		}

		@Override
		public boolean accept(File dir, String name) {

			if (!isFile(dir, name)) {
				return true;
			} else {
				for (String strType : types) {
					if (name.endsWith(strType)) {
						return true;
					}
				}
			}
			return false;
		}
	}

	/**
	 * 
	 * @param inFilePath
	 * @param v
	 * @param cMyFilter
	 * @throws Exception
	 */
	public static void getFilesWithFilter(String inFilePath, Vector<String> v, MyFilter cMyFilter) throws Exception {
		String strFile = "";
		try {
			File f1 = new File(inFilePath);
			if (f1.isDirectory()) {
				File[] f2 = f1.listFiles(cMyFilter);
				if (f2 != null) {
					for (int i = 0; i < f2.length; i++) {

						strFile = f2[i].toString();

						if (f2[i].isDirectory()) {
							getFilesWithFilter(f2[i].toString(), v, cMyFilter);
						} else {
							// System.out.println(strFile);
							v.add(f2[i].toString());
						}

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * 
	 * @category @author
	 * @param dir
	 * @param name
	 * @return update 2020年9月29日
	 */
	public static boolean isFile(File dir, String name) {
		File file = new File(dir.getAbsolutePath() + java.io.File.separator + name);
		if (file.exists() && file.isFile()) {
			return true;
		}
		return false;
	}
}
