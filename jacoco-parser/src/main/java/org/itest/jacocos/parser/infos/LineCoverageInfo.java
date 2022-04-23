/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser.infos;

public class LineCoverageInfo {
	/** 行号 */
	private int r;
	/** 覆盖状态 */
	private int s;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
}
