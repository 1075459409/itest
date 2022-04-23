/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.utils;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassExceptionUtil {
	private static final Logger logger = LogManager.getLogger();

	private ClassExceptionUtil() {
	}

	/**
	 * 
	 * @param errKeyStr
	 * @param ErrCauseList
	 * @return
	 */
	public static int getRowNumFromCauseList(String errKeyStr, List<String> ErrCauseList) {

		if (logger.isDebugEnabled()) {
			logger.debug(errKeyStr);
		}
		for (String strCause : ErrCauseList) {
			int iPos = strCause.indexOf(errKeyStr);
			if (iPos > 0) {
				return getRowNumFromExceptionStr(strCause.substring(iPos, strCause.length()));
			}
		}
		return -1;
	}

	/**
	 * 
	 * @param errStr
	 * @return
	 */
	protected static int getRowNumFromExceptionStr(String errStr) {
		// at cn.com.jbbis.afx.DataApp.getDataAccess(DataApp.java:175)
		if (logger.isDebugEnabled()) {
			logger.debug(errStr);
		}
		errStr = errStr.trim();

		int iPos = errStr.indexOf(".java:");
		if (iPos == -1) {
			return -1;
		}

		errStr = errStr.substring(iPos + 6, errStr.length() - 1);

		return Integer.parseInt(errStr);
	}

}
