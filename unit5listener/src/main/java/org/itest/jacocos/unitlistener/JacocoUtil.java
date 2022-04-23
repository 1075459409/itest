/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.unitlistener;

import org.junit.runner.Description;

public class JacocoUtil {

	/**
	 * 
	 */
	private JacocoUtil() {
	}
	/**
	 * 
	 * @category 功能
	 * @param description
	 * @return
	 * @Date :2021年6月4日下午3:17:15
	 */
	public static String getName(Description description) {
		return description.getClassName() + "%%" + description.getMethodName();
	}
	
	public static String getName(final String strData)
	{
		String result=strData.replaceAll(".*\\[test:", "").replace(")]", "");
		//System.out.println(result);
		String className=result.replaceAll(".*\\(", "");
		String methodName=result.replaceAll("\\(.*", "");
		return className+ "%%" +methodName;
	}
	
	public static void main(String[] args)
	{
		System.out.println(getName("[engine:junit-vintage]/[runner:org.jacocos.unitlistener.sample1.Sample1_iTest]/[test:test_getInt_1(org.jacocos.unitlistener.sample1.Sample1_iTest)]"));
	}
}
