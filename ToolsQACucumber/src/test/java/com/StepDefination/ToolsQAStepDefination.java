package com.StepDefination;

import com.Generic.BaseTest;
import com.pageFactory.StudentRegistrationFormPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToolsQAStepDefination extends BaseTest {

	public StudentRegistrationFormPage objStudentRegistrationFormPage;

	public ToolsQAStepDefination() {
		objStudentRegistrationFormPage = new StudentRegistrationFormPage(this);
	}
	
	@Given("user is on the {string} website")
	public void user_is_on_the_website(String string) {
	   this.initializeWebEnvirenment(string);
	}

	@And("user can see the page Header as {string}")
	public void user_can_see_the_page_header_as(String string) {
	   objStudentRegistrationFormPage.verifHeaderOfPage();
	}

	@When("user can see the student registration form text")
	public void user_can_see_the_student_registration_form_text() {
	   objStudentRegistrationFormPage.verifyTextOfStudentRegForm();
	}

	@And("user enters Name as {string} and {string}")
	public void user_enters_name_as_and(String string, String string2) {
	    objStudentRegistrationFormPage.setFirstName(string);
	    objStudentRegistrationFormPage.setlastName(string2);
	}

	@And("user enters emailID as {string}")
	public void user_enters_email_id_as(String string) {
	  objStudentRegistrationFormPage.setEmailID(string);
	}

	@And("user select Gender {string}")
	public void user_select_gender(String string) {
	   objStudentRegistrationFormPage.setGender(string);
	}
	
	@And("user enters Mobile Number {string}")
	public void user_enters_mobile_number(String string) {
	    objStudentRegistrationFormPage.setMobileNumber(string);
	}

	@And("user enter subject name {string}")
	public void user_enter_subject_name(String string) {
	   objStudentRegistrationFormPage.setSubject(string);
	}

	@And("user select state from dropDown {string} and city {string}")
	public void user_select_state_from_drop_down_and_city(String string, String string2) {
	  objStudentRegistrationFormPage.selectStateDropDownValue(string);
	  objStudentRegistrationFormPage.selectCityDropDownValue(string2);
	}
	
	@Then("user submit student registration form")
	public void user_submit_student_registration_form() {
	    objStudentRegistrationFormPage.clickOnSubmitButton();
	}
}
