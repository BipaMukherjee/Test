package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.runner.Base;

public class Action extends Base{

	public void clickOnTheElement(By elementName) {
		driver.findElement(elementName).click();
	}
	public void updateElement(By elementName,String keyword) {
		driver.findElement(elementName).clear();
        driver.findElement(elementName).sendKeys(keyword);
	}
	public void dropDownByIndex(By elementName,int index) {
		Select dropDown = new Select(driver.findElement(elementName));
		dropDown.selectByIndex(index);
	} 
	public void clickOnTheElementWithIndex(By elementName,int index) {
		driver.findElements(elementName).get(index).click();
	}
	public void scrollDown(By elementName) {
		WebElement element = driver.findElement(elementName); 
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);  
	}
	public void scrollUP(By elementName) {
		WebElement element = driver.findElement(elementName); 
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
	}
	
	public void dropDownByVisibleText(By elementName, String keyWord) {
		Select dropDown = new Select (driver.findElement(elementName));
		dropDown.selectByVisibleText(keyWord);
	}
	
}
