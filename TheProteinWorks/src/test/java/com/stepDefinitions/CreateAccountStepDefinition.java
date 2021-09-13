package com.stepDefinitions;



import com.runner.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given ;
import cucumber.api.java.en.When;


public class CreateAccountStepDefinition extends Base{

	
	@Given("^I am on Create Account page$")
	public void i_am_on_Create_Account_page() throws Throwable {
		createAccountPage.verifyGivenPage();
	}

	@When("^I enters valid credentials$")
	public void i_enters_valid_credentials(DataTable dataTable) throws Throwable {

		createAccountPage.fieldsWithValidCredentials(dataTable);
	}

	@When("^I select gender$")
	public void i_select_gender() throws Throwable {
		createAccountPage.genderSelect();
	}

	@When("^select Date of birth$")
	public void select_Date_of_birth() throws Throwable {
		createAccountPage.BODSelect();
	}

	@When("^write phone number$")
	public void write_phone_number(DataTable dataTable) throws Throwable {
		createAccountPage.phoneNumber(dataTable);
	}

	@When("^I select Main goal$")
	public void i_select_Main_goal() throws Throwable {
		createAccountPage.mainGoal();
	}

	@When("^I select COUNT ME redio button$")
	public void i_select_COUNT_ME_redio_button() throws Throwable {
		createAccountPage.countButton();
	}

	@When("^I Click JOIN IN$")
	public void i_Click_clicl_JOIN_IN() throws Throwable {
		createAccountPage.joinIN();
	}

	


}
