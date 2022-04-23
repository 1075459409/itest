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

public class MethodPosInfo {

	private String MethodName;
	private int StartLineBody = 0;
	private int EndLineBody = 0;
	private String ReturnType2;
	private int Modifier;
	private String mBody;
	private int RowId;
	private long BodyLength;
	private long preEndLine = 0;

	private String JavaDoc;
	private int StartLineDoc = 0;
	private int EndLineDoc = 0;

	private int MinStartLine = 0;
	private int MaxEndLine = 0;
	private List<String> annotation = new ArrayList<String>();

	public List<String> getAnnotation() {
		return this.annotation;
	}

	public void setAnnotation(List<String> inlistAnnotation) {
		this.annotation = inlistAnnotation;
	}

	public int getDocStartLine() {
		return this.StartLineDoc;
	}

	public void setDocStartLine(int docStartLine) {
		this.StartLineDoc = docStartLine;
		setMinStartLine(docStartLine);
	}

	public int getDocEndLine() {
		return this.EndLineDoc;
	}

	public void setDocEndLine(int docEndLine) {
		this.EndLineDoc = docEndLine;
	}

	public long getPreEndLine() {
		return this.preEndLine;
	}

	public void setPreEndLine(long preEndLine) {
		this.preEndLine = preEndLine;
	}

	public long getBodyLength() {
		return this.BodyLength;
	}

	public void setBodyLength(long bodyLength) {
		this.BodyLength = bodyLength;
	}

	public String getJavaDoc() {
		return this.JavaDoc;
	}

	public void setJavaDoc(String javaDoc) {
		this.JavaDoc = javaDoc;
	}

	public String getMethodName() {
		return this.MethodName;
	}

	public void setMethodName(String mName) {
		this.MethodName = mName;
	}

	public int getStartLineBody() {
		return this.StartLineBody;
	}

	public void setStartLineBody(int startLineBody) {
		this.StartLineBody = startLineBody;
		setMinStartLine(startLineBody);
		if (EndLineBody > 0 && StartLineBody > 0) {
			BodyLength = EndLineBody - StartLineBody;
		}
	}

	public int getEndLineBody() {
		return this.EndLineBody;
	}

	public void setEndLineBody(int endLineBody) {
		this.EndLineBody = endLineBody;
		setMaxEndLine(endLineBody);
		if (EndLineBody > 0 && StartLineBody > 0) {
			BodyLength = EndLineBody - StartLineBody;
		}
	}

	public int getMinStartLine() {
		return this.MinStartLine;
	}

	public void setMinStartLine(int minStartLine) {
		if (0 == this.MinStartLine || this.MinStartLine > minStartLine) {
			this.MinStartLine = minStartLine;
		}
	}

	public int getMaxEndLine() {
		return this.MaxEndLine;
	}

	public void setMaxEndLine(int maxEndLine) {
		this.MaxEndLine = maxEndLine;
	}

	public String getReturnType2() {
		return this.ReturnType2;
	}

	public void setReturnType2(String returnType2) {
		this.ReturnType2 = returnType2;
	}

	public int getModifier() {
		return this.Modifier;
	}

	public void setModifier(int modifier) {
		this.Modifier = modifier;
	}

	public String getmBody() {
		return this.mBody;
	}

	public void setmBody(String mBody) {
		this.mBody = mBody;
	}

	public int getRowId() {
		return this.RowId;
	}

	public void setRowId(int rowId) {
		this.RowId = rowId;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof MethodPosInfo)) {
			return false;
		}
		MethodPosInfo cDupMethodInfo2 = (MethodPosInfo) o;
		if (this.mBody.equalsIgnoreCase(cDupMethodInfo2.mBody)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return mBody.hashCode();
	}

	@Override
	public String toString() {
		return "MethodName=" + MethodName + "\npreEndLine=" + preEndLine + "\nStartLine=" + MinStartLine + "\nEndLine="
				+ MaxEndLine + "\nStartLineDoc=" + StartLineDoc + "\nEndLineDoc=" + EndLineDoc + "\nStartLineBody="
				+ StartLineBody + "\nEndLineBody=" + EndLineBody + "\nReturnType2=" + ReturnType2 + "\nModifier="
				+ Modifier + "\nmBody=" + mBody + "\nBodyLength=" + BodyLength + "\nRowId=" + RowId + "\nJavaDoc="
				+ JavaDoc;
	}

}
