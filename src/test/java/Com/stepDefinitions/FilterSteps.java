package Com.stepDefinitions;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FilterSteps extends BaseClass {
	@Given("I am on category page")
	public void i_am_on_category_page() {
		driver.navigate().to("https://stage.xxlhoreca.com/keukenaccessoires/pannen/kookpannen/");
		String title = driver.getTitle();
        Assert.assertEquals("Kookpannen en Soeppannen kopen bij XXLhoreca", title);
	    
	}
	@When("I enter maximum price value")
	public void i_enter_maximum_price_value() {
		 driver.findElement(By.xpath("(//input[@name='max-price'])[1]")).sendKeys("30");
	   
	}
	@Then("I get related results")
	public void i_get_related_results() {
		String title = driver.getTitle();
        Assert.assertEquals("Kookpannen en Soeppannen kopen bij XXLhoreca", title);
	    
	}


	
	
	

@When("I select a brand from brand filter")
public void i_select_a_brand_from_brand_filter() {
	 driver.findElement(By.xpath("(//label[normalize-space()='Hendi'])[1]")).click();
}
@Then("I see that brands products")
public void i_see_that_brands_products() {
	String title = driver.getTitle();
    Assert.assertEquals("Kookpannen en Soeppannen kopen bij XXLhoreca", title);
    
}

}
