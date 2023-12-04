package Com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrtionSteps extends BaseClass {
	@Given("I am in registration page")
	public void i_am_in_registration_page() {
		driver.navigate().to("https://stage.xxlhoreca.com/account/login");
		String title = driver.getTitle();
	    Assert.assertEquals("Registreren", title);
	    
	}
	@And("I enter my name, surname, phone, email, password amd address")
	public void i_enter_my_name_surname_phone_email_password_amd_address() {
//		Fill up details on the form
		 driver.findElement(By.xpath("(//input[@id='personalFirstName'])[1]")).sendKeys("Bipa");
		 driver.findElement(By.xpath("(//input[@id='personalLastName'])[1]")).sendKeys("Mukherjee");
	     driver.findElement(By.xpath("(//input[@id='billingAddressAddressPhoneNumber'])[1]")).sendKeys("Phone");
	     driver.findElement(By.xpath("(//input[@id='personalMail'])[1]")).sendKeys("bipa.mukherjee@newporttakkt.com");
	     driver.findElement(By.xpath("(//input[@id='personalPassword'])[1]")).sendKeys("Test1234@@@@");
	     driver.findElement(By.xpath("(//input[@id='billingAddressAddressStreet'])[1]")).sendKeys("Philitelaan 67");
	     driver.findElement(By.xpath("(//input[@id='billingAddressAddressZipcode'])[1]")).sendKeys("5617 AM");
	     driver.findElement(By.xpath("(//input[@id='billingAddressAddressCity'])[1]")).sendKeys("Eindhoven");
	}
	     
	     
	     @And("I select privacy policy")
	     public void i_select_privacy_policy() {
//	     Click on terms and condition
	    	 driver.manage().window().maximize();
	    	 WebElement element =  driver.findElement(By.cssSelector("label[for='tos']")); 
			Actions actions = new Actions(driver);

			actions.moveToElement(element).click().perform();
//			label[for='acceptedDataProtection']
			  
	    
	}
	
	
	@When("I click on continue")
	public void i_click_on_continue() {
		driver.findElement(By.cssSelector(".register-submit")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	
	}
	@Then("I see an error message \\(customer allredy registered)")
	public void i_see_an_error_message_customer_allredy_registered() {
		 String actual = driver.findElement(By.xpath("(//div[@class='invalid-feedback'])[1]")).getText();
	        Assert.assertEquals("Dit e-mailadres is al geregistreerd.", actual);
	}
}
