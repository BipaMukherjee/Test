package Com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviewSteps extends BaseClass {
	@When("I click on ecomi review option")
	public void i_click_on_ecomi_review_option() {
		driver.findElement(By.xpath("(//div[@class='rating-line'])[1]")).click();
	}
	@Then("I can see a new Ecomi tab")
	public void i_can_see_a_new_ecomi_tab() {
		String title = driver.getTitle();
        Assert.assertEquals("Horeca apparatuur bestellen bij de groothandel XXLhoreca", title);
        
    
	    
	}



}
