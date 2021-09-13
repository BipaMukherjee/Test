package com.stepDefinitions;





import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;

import com.constants.CreateAccountConstants;
import com.runner.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends Base{
	


	@Before
	public void initializedriver() throws InterruptedException {  
	System.setProperty("webdriver.chrome.driver", "/Users/sahadatdipu/Documents/chromedriver");
	
	driver = new ChromeDriver();
	driver.get("https://pensive-darwin.theproteinworks.com/customer/account/create/");
	driver.manage().window().maximize();
	driver.findElement(CreateAccountConstants.Cookie).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	@After
    public void destroy() {
    	driver.close();
    }

}
