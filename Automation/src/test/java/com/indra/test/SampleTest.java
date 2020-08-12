package com.indra.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.indra.actions.SampleAction;

import indra.automation.browser.handlers.DriverThreadManager;
import indra.automation.browser.test.base.simple.TestBase;

public class SampleTest extends TestBase {
	
	@BeforeMethod
	public void setDevicePropertyForAll() {
		setDeviceProperty("ChromeLocal");
		DriverThreadManager.getWebDriverThreadLocal().manage().window().maximize();
	}
	
	@Test
	public void sampleTest() throws Exception {
		SampleAction action = pageGeneratorThread.get().getInstance(SampleAction.class);
		action.clickElement1();
		action.inputTextOnElement2("LIS");
	}
	
}
