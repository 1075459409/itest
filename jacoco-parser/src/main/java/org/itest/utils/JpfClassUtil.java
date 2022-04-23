/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.utils;

public class JpfClassUtil {

	private JpfClassUtil() {}
	/**
	 * 
	 * @param strClassFullName
	 * @return
	 */
	public static String getClassNameWithSlash(String strClassFullName) {
		return strClassFullName.replaceAll("\\.", "/");
	}

}
