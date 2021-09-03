package com.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WrapperFunctions {

	private BaseTest objBaseTest;
	private WebDriverWait objWebDriverWait;
	public Actions objActions;

	public WrapperFunctions(BaseTest baseTest) {
		this.objBaseTest = baseTest;

	}

	public Actions doActions()
	{
		return objActions=new Actions(objBaseTest.getDriver());
	}
	public void webDriverWaitObject() {
		objWebDriverWait = new WebDriverWait(objBaseTest.getDriver() , (20));
	}
	
	public void scrollPage(int intScrollBy) {
		JavascriptExecutor js = (JavascriptExecutor) objBaseTest.getDriver();
		js.executeScript("window.scrollBy(0," + intScrollBy + ")");
	}
	
	public void setImplicitlyWait(int intTimeInSecond) {
		objBaseTest.getDriver().manage().timeouts().implicitlyWait(intTimeInSecond, TimeUnit.SECONDS);
	}

	
	
	public void setExplicitlyWait(By locator) throws NotFoundException {
		this.webDriverWaitObject();
		objWebDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
}