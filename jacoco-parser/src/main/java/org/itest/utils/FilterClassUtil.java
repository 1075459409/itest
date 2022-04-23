/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.utils;

import java.util.Set;

public class FilterClassUtil {

	private FilterClassUtil() {
	}

	/**
	 * @category 功能
	 * @param strkey
	 * @param setFilter
	 * @return
	 * @Date :2022年4月8日上午10:48:52
	 */
	public static boolean isFilterClass(String strkey, Set<String> setFilter) {
		for (String str : setFilter) {
			if (strkey.startsWith(str)) {
				return true;
			}
		}
		return false;
	}

}
