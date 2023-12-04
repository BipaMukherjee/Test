package Com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishlistSteps extends BaseClass {
	@Given("I login using my correct credentials")
	public void i_login_using_my_correct_credentials() {
		driver.navigate().to("https://stage.xxlhoreca.com/account/login");
		String title = driver.getTitle();
	    Assert.assertEquals("Registreren", title);
	    
	    driver.findElement(By.cssSelector("#loginMail")).clear();
		driver.findElement(By.cssSelector("#loginMail")).sendKeys("bipa.mukherjee@newporttakkt.com");
		driver.findElement(By.cssSelector("#loginPassword")).clear();
		driver.findElement(By.cssSelector("#loginPassword")).sendKeys("Test1234@@@@");
		driver.findElement(By.cssSelector("div[class='login-submit'] button[type='submit']")).click(); 
		
	}
	@When("I click on wishlist icon on header")
	public void i_click_on_wishlist_icon_on_header() {
		driver.findElement(By.xpath("(//span[@id='wishlist-basket'])[1]")).click();
	    
	}
	@Then("I land onto wishlist page")
	public void i_land_onto_wishlist_page() {
		String title = driver.getTitle();
        Assert.assertEquals("Uw verlanglijst", title);
	    
	}
	


}
