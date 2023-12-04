package Com.stepDefinitions;
import org.junit.Assert;
import org.openqa.selenium.By;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {
	@Given("user is in login page")
	public void user_is_in_login_page() {
		driver.navigate().to("https://stage.xxlhoreca.com/account/login");
		String title = driver.getTitle();
	    Assert.assertEquals("Registreren", title);
	   
	}

	@When("user enters correct login credentials")
	public void user_enters_correct_login_credentials() {
		driver.findElement(By.cssSelector("#loginMail")).clear();
		driver.findElement(By.cssSelector("#loginMail")).sendKeys("bipa.mukherjee@newporttakkt.com");
		driver.findElement(By.cssSelector("#loginPassword")).clear();
		driver.findElement(By.cssSelector("#loginPassword")).sendKeys("Test1234@@@@");
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.cssSelector("div[class='login-submit'] button[type='submit']")).click();
		
	    
	}

	@Then("user gets logged in")
	public void user_gets_logged_in() {
	   
	}

	@And("lands to my account page")
	public void lands_to_my_account_page() {
		String title = driver.getTitle();
        Assert.assertEquals("XXLHoreca.com", title);
	}
	


	

@When("user enters incorrect login credentials")
public void user_enters_incorrect_login_credentials() {
	driver.findElement(By.cssSelector("#loginMail")).clear();
	driver.findElement(By.cssSelector("#loginMail")).sendKeys("bipa.mukherjee@newporttakkt.com");
	driver.findElement(By.cssSelector("#loginPassword")).clear();
	driver.findElement(By.cssSelector("#loginPassword")).sendKeys("Test1234password");
   
}
@Then("user gets error message")
public void user_gets_error_message() {
	String title = driver.getTitle();
    Assert.assertEquals("Registreren", title);}
}