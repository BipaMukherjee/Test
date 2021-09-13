package com.driver;

import org.openqa.selenium.By;

import com.runner.Base;

public class Get extends Base{

	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	 public String getElementText(By elementName) {
	return	driver.findElement(elementName).getText();
	}
}
