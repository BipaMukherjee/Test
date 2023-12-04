package Com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PictureSteps extends BaseClass {
	
	private WebElement chooseFile;

	@Given("I am on the website")
	public void i_am_on_the_website() {

	    
	}

	@When("I click to to upload an image")
	public void i_click_to_to_upload_an_image() {
		
	
//		driver.findElement(By.cssSelector(".button.hero__button.button--small.button--small-mobile.button--white")).click();
		
	
		
	
		WebElement chooseFile = driver.findElement(By.cssSelector(".button.hero__button.button--small.button--small-mobile.button--white"));
		chooseFile.click();
		chooseFile.sendKeys("/Users/bipamukherjee/Desktop/testImage");
		


       

  
	    
	}

	@Then("I get an new updated image")
	public void i_get_an_new_updated_image() {
	    
	}



	}


