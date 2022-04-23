/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser.infos;

import java.util.HashSet;
import java.util.Set;

public class CoverageInfo {

	private Set<String> setCoverage = new HashSet<String>();

	private Set<String> setDupMethod = new HashSet<String>();

	public Set<String> getHsetCoverage() {
		return setCoverage;
	}

	public Set<String> getHsetDupMethod() {
		return setDupMethod;
	}
}
