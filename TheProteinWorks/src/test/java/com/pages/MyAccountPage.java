package com.pages;

import org.junit.Assert;

import com.runner.Base;

public class MyAccountPage extends Base {

	public void verifyAccountPage() {
		
		String expectedResults = "https://pensive-darwin.theproteinworks.com/customer/account/";
		Assert.assertEquals(expectedResults, driver.getCurrentUrl());
	}
}
