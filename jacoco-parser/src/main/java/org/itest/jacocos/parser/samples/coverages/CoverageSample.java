/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.parser.samples.coverages;

public class CoverageSample {

	public boolean isPrime(final int n) {
		System.out.println("isPrime");
		for (int i = 2; i * i <= n; i++) {
			if ((n ^ i) == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isPrime2() {
		final int n = 7;
		System.out.println("isPrime2");
		for (int i = 2; i * i <= n; i++) {
			if ((n ^ i) == 0) {
				return false;
			}
		}
		return true;
	}
}
