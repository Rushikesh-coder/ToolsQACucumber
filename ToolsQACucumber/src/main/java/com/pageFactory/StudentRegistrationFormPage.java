package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.Generic.BaseTest;

public class StudentRegistrationFormPage {

	public BaseTest objBaseTest;
	public boolean blnFlag = false;

	public StudentRegistrationFormPage(BaseTest baseTest) {
		this.objBaseTest = baseTest;
	}

	By loc_HeaderOfStudentRegistPage = By.xpath("//div[text()='Practice Form']");
	By loc_TextOfStudentRegistPage = By.xpath("//h5[text()='Student Registration Form']");
	By loc_firstName = By.xpath("//label[text()='Name']//following::input[@id='firstName']");
	By loc_LastName = By.xpath("//label[text()='Name']//following::input[@id='lastName']");
	By loc_Email = By.xpath("//label[text()='Email']//following::input[@id='userEmail']");

	public void verifHeaderOfPage() {

		blnFlag = objBaseTest.getDriver().findElement(loc_HeaderOfStudentRegistPage).isDisplayed();
		Assert.assertTrue(blnFlag);
	}

	public void verifyTextOfStudentRegForm() {

		blnFlag = objBaseTest.getDriver().findElement(loc_TextOfStudentRegistPage).isDisplayed();
		Assert.assertTrue(blnFlag);
	}

	public void setFirstName(String strName) {

		objBaseTest.getDriver().findElement(loc_firstName).sendKeys(strName);
	}

	public void setlastName(String strLastName) {

		objBaseTest.getDriver().findElement(loc_LastName).sendKeys(strLastName);
	}

	public void setEmailID(String strEmailID) {

		objBaseTest.getDriver().findElement(loc_Email).sendKeys(strEmailID);

	}

	public void setGender(String strGender) {
		By loc_Gender = By.xpath("//div[text()='Gender']//following::label[text()='" + strGender + "']");
		objBaseTest.getDriver().findElement(loc_Gender).click();
	}

	public void setMobileNumber(String strMobNumber) {
		By loc_MobileNumber = By.xpath("//label[text()='Mobile']//following::input[@id='userNumber']");
		objBaseTest.getDriver().findElement(loc_MobileNumber).sendKeys(strMobNumber);
	}

	public void setSubject(String strSubject) {
		By loc_subject = By.xpath("//label[text()='Subjects']//following::input[@id='subjectsInput']");
		objBaseTest.getDriver().findElement(loc_subject).sendKeys(strSubject);
		objBaseTest.getObjWrapperFunctions().doActions().sendKeys(Keys.ENTER).build().perform();

	}

	public void selectStateDropDownValue(String strState) {
		objBaseTest.getObjWrapperFunctions().scrollPage(400);
		By loc_DropDown = By.xpath("//label[text()='State and City']//following::div[@class=' css-yk16xz-control'][1]");
		objBaseTest.getDriver().findElement(loc_DropDown).click();

		By loc_ValueOfDropDown = By.xpath("//div[text()='" + strState + "']");

		objBaseTest.getDriver().findElement(loc_ValueOfDropDown).click();
	}

	public void selectCityDropDownValue(String strCity) {
		objBaseTest.getObjWrapperFunctions().setImplicitlyWait(20);
		By loc_DropDownCity = By
				.xpath("//label[text()='State and City']//following::div[@class=' css-yk16xz-control'][2]");
		objBaseTest.getDriver().findElement(loc_DropDownCity).click();

		By loc_ValueOfDropDown = By.xpath("//div[text()='" + strCity + "']");

		objBaseTest.getObjWrapperFunctions().setExplicitlyWait(loc_ValueOfDropDown);
		objBaseTest.getDriver().findElement(loc_ValueOfDropDown).click();
	}

	public void clickOnSubmitButton() {

		By loc_ClickOnSubmitButton = By.xpath("//button[text()='Submit']");
		objBaseTest.getObjWrapperFunctions().setExplicitlyWait(loc_ClickOnSubmitButton);
		objBaseTest.getDriver().findElement(loc_ClickOnSubmitButton).click();

	}

}
