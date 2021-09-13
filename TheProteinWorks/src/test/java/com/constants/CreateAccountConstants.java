package com.constants;

import org.openqa.selenium.By;

public interface CreateAccountConstants {

	
	By FirstNameBox 	= By.cssSelector("#firstname");
	By LastNameBox 		= By.cssSelector("#lastname");
	By EnailBox			= By.cssSelector("#email_address");
	By PassWordBox		= By.xpath("//input[@name='password']");
	By ComPassWordBox	= By.cssSelector("input[name='password_confirmation']");
	By GenderBox		= By.cssSelector("select[name='gender']");
	By DOBBox			= By.cssSelector(".control.customer-dob");
	By DOBDay			= By.linkText("20");
	By DOBMonth			= By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/select[1]");
	By DOBYear			= By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/select[2]");
	By JoinInButton		= By.cssSelector("button[type='submit']");	
	By PhoneNumber		= By.cssSelector("#mobile_number_input");
	By MainGoal			= By.cssSelector("#customer_goal");
	By RedioButton		= By.cssSelector("#is_subscribed_yes");
	By Cookie			= By.cssSelector(".cookie-button");
}
