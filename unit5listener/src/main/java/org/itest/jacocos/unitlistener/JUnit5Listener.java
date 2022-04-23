/**
 * Copyright (C) 2020-2021 org.itest
 *
* This file is part of org.itest
 * @author org.itest
 * @version 1.0.0
 * 
 **/
package org.itest.jacocos.unitlistener;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;

/**
 * JUnit listener that instructs JaCoCo to create one session per test.
 * Based on: https://github.com/SonarSource/sonar-java/blob/master/sonar-jacoco-listeners/src/main/java/org/sonar/java/jacoco/JUnitListener.java
 */

public class JUnit5Listener implements TestExecutionListener {

	protected JacocoController jacoco;

	public void testPlanExecutionStarted(TestPlan testPlan) {

		System.out.println("[JUnit5Listener]testPlanExecutionStarted.");

	}

	public void executionStarted(TestIdentifier testIdentifier) {

		if (testIdentifier.isTest()) {
			System.out.println("[JUnit5Listener]executionStarted" + testIdentifier.getUniqueId());
			getJacocoController().onTestStart();
		}
	}

	public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {

		if (testIdentifier.isTest()) {
			System.out.println("[JUnit5Listener]executionFinished:" + testIdentifier.getUniqueId());
			getJacocoController().onTestFinish(testIdentifier);
		}
	}

	public void testPlanExecutionFinished(TestPlan testPlan) {

		System.out.println("[JUnit5Listener]testPlanExecutionFinished");

	}

	protected JacocoController getJacocoController() {
		if (jacoco == null) {
			jacoco = JacocoController.getInstance();
		}
		return jacoco;
	}
}
