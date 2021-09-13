package com.pages;



import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


import com.constants.CreateAccountConstants;
import com.runner.Base;

import cucumber.api.DataTable;



public class CreateAccountPage extends Base {

	public void verifyGivenPage() {
		String actualResults = "https://pensive-darwin.theproteinworks.com/customer/account/create/";
		Assert.assertEquals(actualResults, get.getCurrentURL());
	}
	
	public void fieldsWithValidCredentials(DataTable dataTable) throws InterruptedException {
		
		Map<String,String> registerTable = dataTable.asMap(String.class, String.class);
		
		String firstNameValue 	= registerTable.get("First Name");
		String lastNameValue 	= registerTable.get("Last Name");
		String emailValue 		= registerTable.get("email address");
		String passWordValue 	= registerTable.get("password");
		String confirmPassWord 	= registerTable.get("confirm password");
		
		action.updateElement(CreateAccountConstants.FirstNameBox, firstNameValue);
		action.updateElement(CreateAccountConstants.LastNameBox, lastNameValue);
		action.updateElement(CreateAccountConstants.EnailBox, emailValue);
		action.updateElement(CreateAccountConstants.PassWordBox, passWordValue);
		action.updateElement(CreateAccountConstants.ComPassWordBox, confirmPassWord);
		
	}
	
	public void genderSelect() throws InterruptedException {
		wait.elementToBeClickable(CreateAccountConstants.GenderBox, 10);
		action.dropDownByIndex(CreateAccountConstants.GenderBox, 1);
	}
	
	public void BODSelect() {
		
		action.clickOnTheElement(CreateAccountConstants.DOBBox);
		action.dropDownByVisibleText(CreateAccountConstants.DOBYear, "2000");
		action.dropDownByVisibleText(CreateAccountConstants.DOBMonth, "Dec");
		action.clickOnTheElement(CreateAccountConstants.DOBDay);
	}

	public void phoneNumber(DataTable dataTable) {
		
		Map<String,String> phoneTable = dataTable.asMap(String.class, String.class);
		String phoneValue = phoneTable.get("Phone Number");
		action.updateElement(CreateAccountConstants.PhoneNumber, phoneValue);
	}
	
	public void mainGoal() {
		
		action.scrollDown(CreateAccountConstants.MainGoal);
		action.dropDownByIndex(CreateAccountConstants.MainGoal, 4);

	}
	
	public void countButton() throws InterruptedException {
		
		wait.elementToBeClickable(CreateAccountConstants.RedioButton, 10);
		WebElement redio = driver.findElement(CreateAccountConstants.RedioButton);
		redio.click();
		System.out.print(redio.isSelected());
		
	}
	public void joinIN() {
		
		action.clickOnTheElement(CreateAccountConstants.JoinInButton);
	}
}