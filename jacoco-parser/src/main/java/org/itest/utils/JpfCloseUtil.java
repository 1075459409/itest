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

public class JpfCloseUtil {

	private JpfCloseUtil() {
	}

	/**
	 * 
	 * @param c
	 */
	public static void close(Closeable c) {
		try {
			if (c != null) {
				c.close();
			}
		} catch (Exception e) {
		}
	}

	/**
	 * 
	 * @param c
	 */
	public static void close(AutoCloseable c) {
		try {
			if (c != null) {
				c.close();
			}
		} catch (Exception e) {
		}
	}

	/**
	 * 
	 * @param p
	 */
	public static void destroyProcess(Process p) {
		try {
			if (p == null) {
				return;
			}
			close(p.getInputStream());
			close(p.getErrorStream());
			close(p.getOutputStream());

			p.destroy();
		} catch (Exception e) {
		}

	}
}
