package Com.stepDefinitions;

import org.junit.Assert;
import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategorySteps extends BaseClass{
	@Given("I am on home page")
	public void i_am_on_home_page() {
		String title = driver.getTitle();
        Assert.assertEquals("Horeca apparatuur bestellen bij de groothandel XXLhoreca", title);
		
	}
	   
	@When("I click on a main category from mega navigation")
	public void i_click_on_a_main_category_from_mega_navigation() {
		driver.navigate().to("https://stage.xxlhoreca.com/keukenaccessoires/pannen/kookpannen/");
	   
	}
	@Then("I land onto main category page")
	public void i_land_onto_main_category_page() {
		String title = driver.getTitle();
        Assert.assertEquals("Kookpannen en Soeppannen kopen bij XXLhoreca", title);
	
	}
}
