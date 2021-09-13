package com.stepDefinitions;

import com.runner.Base;

import cucumber.api.java.en.Then;

public class MyAccountStepDefinition extends Base {

	@Then("^It Should direct me My account page$")
	public void it_Should_direct_me_My_account_page() throws Throwable {
		myAccountPage.verifyAccountPage();
	}
}
