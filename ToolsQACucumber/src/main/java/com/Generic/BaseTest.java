package com.Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {

	public WebDriver driver = null;
	private WrapperFunctions objWrapperFunctions;

	

	public void initializeWebEnvirenment(String url) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		 objWrapperFunctions=new WrapperFunctions(this);
		 this.setObjWrapperFunctions(objWrapperFunctions);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
//	public void scrollPage(int intScrollBy) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0," + intScrollBy + ")");
//	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public WrapperFunctions getObjWrapperFunctions() {
		return objWrapperFunctions;
	}

	public void setObjWrapperFunctions(WrapperFunctions objWrapperFunctions) {
		this.objWrapperFunctions = objWrapperFunctions;
	}
	
	public void tearDownEnvirnment() {
		driver.quit();
		System.out.println("Browser closed");
	}
	
	
	
}
