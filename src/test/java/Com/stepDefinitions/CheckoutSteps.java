package Com.stepDefinitions;

import org.junit.Assert;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps extends BaseClass {
	@Given("I am on basket page with a product")
	public void i_am_on_basket_page_with_a_product() {
		driver.navigate().to("https://stage.xxlhoreca.com/warmhouden/warme-dranken/waterkokers/");
		driver.findElement(By
				.cssSelector("div[class='product-info'] a[title='Waterkoker RVS | 1,7L | 2,2 kW | 165x210x(H)240mm']")).click();
		driver.findElement(By.cssSelector("button[title='In winkelwagen']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	   
 
		}
			
		}	
	@And("I click on continue to checkout and land on login page")
	public void i_click_on_continue_to_checkout_and_land_on_login_page() {
		driver.navigate().to("https://stage.xxlhoreca.com/checkout/register");
		driver.findElement(By.xpath("(//strong[normalize-space()='Al klant? Klik hier om u aan te melden.'])[1]")).click();
		
	}
		
	
	@When("I login with valid data")
	public void i_login_with_valid_data() {
		driver.findElement(By.xpath("//input[@id='loginMail']")).clear();
		driver.findElement(By.xpath("//input[@id='loginMail']")).sendKeys("bipa.mukherjee@newporttakkt.com");
		driver.findElement(By.xpath("//input[@id='loginPassword']")).clear();
		driver.findElement(By.xpath("//input[@id='loginPassword']")).sendKeys("Test1234@@@@");
		driver.findElement(By.cssSelector("div[class='login-submit'] button[type='submit']")).click();
		
	}
	 
	
	@And("I get connected to order confirm page")
	public void i_get_connected_to_order_confirm_page() {}
	@And("I select payment and shipping type")
	public void i_select_payment_and_shipping_type() {}
	
	
	
	@And("I select privacy policy checkbox")
	public void i_select_privacy_policy_checkbox() {
		WebElement element = driver.findElement(By.cssSelector("#tos"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		  
		
		
	}
	@And("I click on continue and get connected to payment page")
	public void i_click_on_continue_and_get_connected_to_payment_page() {
		driver.findElement(By.xpath("//button[@id='confirmFormSubmit']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}
	@And("I provide payment details and continue")
	public void i_provide_payment_details_and_continue() {
		driver.findElement(By.cssSelector("#credit-card")).clear();
		driver.findElement(By.cssSelector("#credit-card")).sendKeys("4111111111111111");
		driver.findElement(By.cssSelector("#field-extvar2")).clear();
		driver.findElement(By.cssSelector("#field-extvar2")).sendKeys("Auto Test");
		driver.findElement(By.xpath("//select[@name='expiry-month']")).click();
		Select drpMonth = new Select(driver.findElement(By.xpath("//select[@name='expiry-month']")));
		drpMonth.selectByValue("number:3");
		driver.findElement(By.xpath("//select[@name='expiry-year']")).click();
		Select drpYear = new Select(driver.findElement(By.xpath("//select[@name='expiry-year']")));
		drpYear.selectByValue("string:25");
		driver.findElement(By.xpath("(//input[@id='field-extvar4'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='field-extvar4'])[1]")).sendKeys("123");
		driver.findElement(By.cssSelector(".btn.btn-blue")).click();
	}
	   
	
	@Then("After payment is successfull I can see thank you page")
	public void after_payment_is_successfull_i_can_see_thank_you_page() {
		
		 String Title = driver.getTitle();
	        Assert.assertEquals("Pay with Multisafepay Connect", Title);
	       
	
	}


}
