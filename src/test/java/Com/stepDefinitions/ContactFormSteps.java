package Com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactFormSteps extends BaseClass {
	
	
//	Inquiry Form
	@Given("I have opened general inquiry form")
	public void i_have_opened_general_inquiry_form() {
		driver.navigate().to("https://stage.xxlhoreca.com/pizza-oven-elektrisch-dubbel-pizza-32-cm-8-stuks-975x924x-h-745mm/1000462");
		driver.findElement(By.xpath("//span[normalize-space()='Vragen? Mail ons']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	   }}
  
	@When("I entered all details to general inquiry form")
	public void i_entered_all_details_to_general_inquiry_form() {
		driver.findElement(By.xpath("//input[@id='form-contactName']")).clear();
		driver.findElement(By.xpath("//input[@id='form-contactName']")).sendKeys("Bipa");
		driver.findElement(By.xpath("//input[@id='form-email']")).clear();
		driver.findElement(By.xpath("//input[@id='form-email']")).sendKeys("Bipa.Mukherjee@takkt.com");
		driver.findElement(By.xpath("//input[@id='form-phone']")).clear();
		driver.findElement(By.xpath("//input[@id='form-phone']")).sendKeys("00000000000");
		driver.findElement(By.xpath("//textarea[@id='form-question']")).clear();
		driver.findElement(By.xpath("//textarea[@id='form-question']")).sendKeys("Testing this form, please ignore");
	  
	}
	@And("I accept T&C of the general inquiry form")
	public void i_accept_t_c_of_the_general_inquiry_form() {
		WebElement element = driver.findElement(By.cssSelector("label[for='form-privacy-opt-in-']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		
		
	}
	@And("I click to submit the general inquiry form")
	public void i_click_to_submit_the_general_inquiry_form() {
			driver.findElement(By.cssSelector("button[class='btn btn-primary float-right']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	   
 
		}
	}   
	@Then("I get connected to PDP and see alert message of general inquiry form")
	public void i_get_connected_to_PDP_and_see_alert_message_of_general_inquiry_form() {
		 String Title = driver.getTitle();
	        Assert.assertEquals("Pizza Oven Elektrisch Dubbel - Pizza 32 cm - 8 stuks - 975x924x(h)745mm", Title);
		
   
	}
	


	
	
//Lease Form
	@Given("I have opened Lease form")
	public void i_have_opened_lease_form() {
		driver.navigate().to("https://stage.xxlhoreca.com/pizza-oven-elektrisch-dubbel-pizza-32-cm-8-stuks-975x924x-h-745mm/1000462");
		driver.findElement(By.xpath("//span[normalize-space()='Vraag lease aan']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	   }
	    
	}
	@When("I entered all details to Lease form")
	public void i_entered_all_details_to_lease_form() {
		driver.findElement(By.xpath("//input[@id='form-contactName']")).clear();
		driver.findElement(By.xpath("//input[@id='form-contactName']")).sendKeys("Bipa");
		driver.findElement(By.xpath("//input[@id='form-companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='form-companyName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='form-kvkNumber']")).clear();
		driver.findElement(By.xpath("//input[@id='form-kvkNumber']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='form-email']")).clear();
		driver.findElement(By.xpath("//input[@id='form-email']")).sendKeys("Bipa.Mukherjee@test.com");
		driver.findElement(By.xpath("//input[@id='form-phone']")).clear();
		driver.findElement(By.xpath("//input[@id='form-phone']")).sendKeys("Phone");
		driver.findElement(By.xpath("//input[@id='form-quantity']")).clear();
		driver.findElement(By.xpath("//input[@id='form-quantity']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='form-existenceInYears']")).clear();
		driver.findElement(By.xpath("//input[@id='form-existenceInYears']")).sendKeys("5");
		driver.findElement(By.xpath("//textarea[@id='form-comment']")).clear();
		driver.findElement(By.xpath("//textarea[@id='form-comment']")).sendKeys("Testing this form, please ignore");
	    
	}
	@And("I accept T&C of the Lease form")
	public void i_accept_t_c_of_the_lease_form() {
		driver.findElement(By.xpath("//label[contains(text(),'Door doorgaan te selecteren, bevestigt u dat u onz')]")).click();
		
	    
	}
	@And("I click to submit the Lease form")
	public void i_click_to_submit_the_lease_form() {
		driver.findElement(By.xpath("//button[normalize-space()='Verzenden']")).click();
	   
	}
	@Then("I get connected to PDP and see alert message of Lease form")
	public void i_get_connected_to_pdp_and_see_alert_message_of_lease_form() {
		String Title = driver.getTitle();
        Assert.assertEquals("Pizza Oven Elektrisch Dubbel - Pizza 32 cm - 8 stuks - 975x924x(h)745mm", Title);
	    } 
	
	
	
	

//Quote Form
	@Given("I have opened quote form")
	public void i_have_opened_quote_form() {
	driver.navigate().to("https://stage.xxlhoreca.com/rvs-wandschap-op-maat-alle-soorten-wandschappen-van-roestvrij-staal-leverbaar-in-iedere-maat/1112599");
	driver.findElement(By.xpath("//strong[normalize-space()='OFFERTE AANVRAGEN']")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();	   }
	}

	@When("I entered all details to quote form")
	public void i_entered_all_details_to_quote_form() {
		driver.findElement(By.xpath("//input[@id='form-contactName']")).clear();
		driver.findElement(By.xpath("//input[@id='form-contactName']")).sendKeys("Bipa");
		driver.findElement(By.xpath("//input[@id='form-email']")).clear();
		driver.findElement(By.xpath("//input[@id='form-email']")).sendKeys("Bipa.Mukherjee@test.com");
		driver.findElement(By.xpath("//input[@id='form-phone']")).clear();
		driver.findElement(By.xpath("//input[@id='form-phone']")).sendKeys("Phone");
		driver.findElement(By.xpath("//input[@id='form-quantity[0]']")).clear();
		driver.findElement(By.xpath("//input[@id='form-quantity[0]']")).sendKeys("300");
		driver.findElement(By.xpath("//input[@id='form-leng[0]']")).clear();
		driver.findElement(By.xpath("//input[@id='form-leng[0]']")).sendKeys("300");
		driver.findElement(By.xpath("//input[@id='form-depth[0]']")).clear();
		driver.findElement(By.xpath("//input[@id='form-depth[0]']")).sendKeys("300");
		driver.findElement(By.xpath("//textarea[@name='additional[0]']")).clear();
		driver.findElement(By.xpath("//textarea[@name='additional[0]']")).sendKeys("Testing please ignore");
		driver.findElement(By.xpath("//span[@class='action-add clickable']")).click();
		driver.findElement(By.xpath("//input[@id='form-quantity[1]']")).clear();
		driver.findElement(By.xpath("//input[@id='form-quantity[1]']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@id='form-leng[1]']")).clear();
		driver.findElement(By.xpath("//input[@id='form-leng[1]']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@id='form-depth[1]']")).clear();
		driver.findElement(By.xpath("//input[@id='form-depth[1]']")).sendKeys("500");
		driver.findElement(By.xpath("//textarea[@name='additional[1]']")).clear();
		driver.findElement(By.xpath("//textarea[@name='additional[1]']")).sendKeys("Testing please ignore");
	    
	}
	@And("I accept T&C of the quote form")
	public void i_accept_t_c_of_the_quote_form() {
		driver.findElement(By.xpath("//label[contains(text(),'Door doorgaan te selecteren, bevestigt u dat u onz')]")).click();
	    
	}
	@And("I click to submit the quote form")
	public void i_click_to_submit_the_quote_form() {
		driver.findElement(By.xpath("//button[normalize-space()='Verzenden']")).click();
	    
	}
	@Then("I get connected to PDP and see alert message of quote form")
	public void i_get_connected_to_pdp_and_see_alert_message_of_quote_form() {
		String Title = driver.getTitle();
        Assert.assertEquals("RVS Wandschap op Maat - Alle soorten Wandschappen van Roestvrij Staal leverbaar in iedere Maat| XXLHoreca.com", Title);
		}



//	Footer contact form
	@Given("I have opened contact form")
	public void i_have_opened_contact_form() {
	driver.navigate().to("https://stage.xxlhoreca.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Klantenservice & Contact')]")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();	   }
	   
	}
	@When("I entered all details to contact form")
	public void i_entered_all_details_to_contact_form() {
		driver.findElement(By.xpath("//select[@id='form-Salutation']")).click();
		WebElement optionElement = driver.findElement(By.xpath("//option[@value='884e91c5f4bd490c8349228321a0a23f']"));
        optionElement.click();
		driver.findElement(By.xpath("//input[@id='form-firstName']")).clear();
		driver.findElement(By.xpath("//input[@id='form-firstName']")).sendKeys("Bipa");
		driver.findElement(By.xpath("//input[@id='form-lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='form-lastName']")).sendKeys("Mukheerjee");
		driver.findElement(By.xpath("//input[@id='form-email']")).clear();
		driver.findElement(By.xpath("//input[@id='form-email']")).sendKeys("Bipa.Mukherjee@test.com");
		driver.findElement(By.xpath("//input[@id='form-phone']")).clear();
		driver.findElement(By.xpath("//input[@id='form-phone']")).sendKeys("Phone");
		driver.findElement(By.xpath("//input[@id='form-subject']")).clear();
		driver.findElement(By.xpath("//input[@id='form-subject']")).sendKeys("Test");
		driver.findElement(By.xpath("//textarea[@id='form-comment']")).clear();
		driver.findElement(By.xpath("//textarea[@id='form-comment']")).sendKeys("Please ignore this request");
	   
	}
	@And("I accept T&C of the contact form")
	public void i_accept_t_c_of_the_contact_form() {
		driver.findElement(By.xpath("//label[contains(text(),'Door doorgaan te selecteren, bevestigt u dat u onz')]")).click();
	
	}
	@And("I click to submit the contact form")
	public void i_click_to_submit_the_contact_form() {
		driver.findElement(By.xpath("//button[normalize-space()='Verzenden']")).click();

	   
	}
	@Then("I get connected to customer service page and see message of contact form submitted successfully")
	public void i_get_connected_to_customer_service_page_and_see_message_of_contact_form_submitted_successfully() {
		String Title = driver.getTitle();
        Assert.assertEquals("Klantenservice & Contact", Title);
	
	}

	

}
