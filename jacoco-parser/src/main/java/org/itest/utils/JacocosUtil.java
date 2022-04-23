/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.utils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JacocosUtil {
	private static final Logger logger = LogManager.getLogger();

	private JacocosUtil() {
	}

	public static final String EnCoding = "UTF-8";

	public final static String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void printMap(Map<?, ?> map) {
		Iterator<?> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			Object key = iterator.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
	}


	/**
	 * 
	 * @param hSet
	 */
	public static void printSet(Set<?> hSet) {
		for (Object obj : hSet) {
			System.out.println(obj);
		}

	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (null != str && str.trim().length() > 0) {
			return false;
		}
		return true;
	}
}
