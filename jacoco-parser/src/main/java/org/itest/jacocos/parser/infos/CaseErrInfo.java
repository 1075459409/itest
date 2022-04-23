/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser.infos;

import java.util.ArrayList;
import java.util.List;

import org.itest.utils.ClassExceptionUtil;

public class CaseErrInfo {
	private String UtFileName;
	private String UtClassName;
	private String UtMethodName;
	private String UtTime;
	private String ErrMsg;
	private String ErrType;
	private String SourceClassName;
	private List<String> ErrCauseList = new ArrayList<String>();
	private int ErrRow;
	// 采取的修复操作
	private EnumCaseAction cCaseErrActionEnum;

	public String getSourceClassName() {
		return SourceClassName;
	}

	public void setSourceClassName(String sourceClassName) {
		SourceClassName = sourceClassName;
	}

	public String getUtFileName() {
		return UtFileName;
	}

	public void setUtFileName(String utFileName) {
		UtFileName = utFileName;
	}

	public String getUtClassName() {
		return UtClassName;
	}

	public void setUtClassName(String utClassName) {
		if (utClassName == null || utClassName.length() == 0) {
			return;
		}
		this.UtClassName = utClassName.trim();

		setSourceClassName(getSourceClassNameBySurefireReport2(this.UtClassName));

	}

	public String getSourceClassNameBySurefireReport2(String strResult) {

		if (strResult.endsWith("_WGTest")) {
			return strResult.substring(0, strResult.length() - 7);
		}
		if (strResult.endsWith("_iTest")) {
			return strResult.substring(0, strResult.length() - 6);
		}

		return strResult;
	}

	public String getUtMethodName() {
		return UtMethodName;
	}

	public void setUtMethodName(String utMethodName) {
		UtMethodName = utMethodName;
	}

	public String getUtTime() {
		return UtTime;
	}

	public void setUtTime(String utTime) {
		UtTime = utTime;
	}

	public String getErrMsg() {
		return ErrMsg;
	}

	public void setErrMsg(String errMsg) {
		ErrMsg = errMsg;
	}

	public String getErrType() {
		return ErrType;
	}

	public void setErrType(String errType) {
		ErrType = errType;
	}

	public List<String> getErrCauseList() {
		return ErrCauseList;
	}

	public void setErrCauseList(List<String> errCauseList) {
		ErrCauseList = errCauseList;

		setErrRow(ClassExceptionUtil.getRowNumFromCauseList(getSourceClassName() + ".", errCauseList));
	}

	public int getErrRow() {
		return ErrRow;
	}

	public void setErrRow(int errRow) {
		ErrRow = errRow;
	}

	public EnumCaseAction getcCaseErrActionEnum() {
		return cCaseErrActionEnum;
	}

	public void setcCaseErrActionEnum(EnumCaseAction cCaseErrActionEnum) {
		this.cCaseErrActionEnum = cCaseErrActionEnum;
	}
}
