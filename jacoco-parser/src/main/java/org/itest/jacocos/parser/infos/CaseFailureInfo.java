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

public class CaseFailureInfo {
	String UtFileName;
	String UtClassName;
	String UtMethodName;
	String UtTime;
	String FailureMsg;
	String FailureType;
	List<String> FailureCauseList = new ArrayList<String>();
	int FailureRow;

	String System_Err = null;

	private EnumCaseAction cEnumCaseAction;

	public String toString() {
		return UtClassName + ";" + UtMethodName + ";" + FailureRow + ";" + FailureType;
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
		UtClassName = utClassName;
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

	public String getFailureMsg() {
		return FailureMsg;
	}

	public void setFailureMsg(String failureMsg) {
		FailureMsg = failureMsg;
	}

	public String getFailureType() {
		return FailureType;
	}

	public void setFailureType(String failureType) {
		FailureType = failureType;
	}

	public List<String> getFailureCauseList() {
		return FailureCauseList;
	}

	public void setFailureCauseList(List<String> failureCauseList) {
		FailureCauseList = failureCauseList;

		setFailureRow(ClassExceptionUtil.getRowNumFromCauseList(UtClassName + "." + UtMethodName, failureCauseList));
	}

	public int getFailureRow() {
		return FailureRow;
	}

	public void setFailureRow(int failureRow) {
		FailureRow = failureRow;
	}

	public void printInfo() {

		System.out.println(UtClassName + ";" + UtMethodName + ";" + UtTime + ";" + FailureMsg + ";" + FailureType);
	}

	public String getSystem_Err() {
		return System_Err;
	}

	public void setSystem_Err(String system_Err) {
		System_Err = system_Err;
	}

	public EnumCaseAction getcEnumCaseAction() {
		return cEnumCaseAction;
	}

	public void setEnumCaseAction(EnumCaseAction cEnumCaseAction) {
		this.cEnumCaseAction = cEnumCaseAction;
	}
}
