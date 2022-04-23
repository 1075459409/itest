/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser.infos;

public enum EnumCaseAction {
	DeleteMethod("DeleteMethod"), WR("_WR"), WP("_WP"), WG("_WG"), WE("_WE");

	private String typeName;

	EnumCaseAction(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * 根据类型的名称，返回类型的枚举实例。
	 *
	 * @param typeName 类型名称
	 */
	public static EnumCaseAction fromTypeName(String typeName) {
		typeName = typeName.toLowerCase();
		for (EnumCaseAction type : EnumCaseAction.values()) {
			if (type.getTypeName().equals(typeName)) {
				return type;
			}
		}
		return null;
	}

	public String getTypeName() {
		return this.typeName;
	}
}
