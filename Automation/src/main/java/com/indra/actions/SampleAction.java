package com.indra.actions;

import org.openqa.selenium.WebDriver;

import com.indra.pages.SamplePage;

public class SampleAction extends SamplePage {
	
	public SampleAction(WebDriver webDriver) {
		super(webDriver);
	}

	public void clickElement1()
	{
		element1.click();
	}
	
	public void inputTextOnElement2(String text)
	{
		element2.click();
		element2.sendKeys(text);
	}
}
