package com.indra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import indra.automation.browser.test.action.TestBaseAction;

public class SamplePage extends TestBaseAction{
	
	public SamplePage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	
	//HeaderText
	@FindBy(css = ".booking-type-selector li:nth-child(1) > button")
	protected WebElement element1;	

	//HeaderText
	@FindBy(css = ".#flight-search-from")
	protected WebElement element2;
	
	
	
}
