package Com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaginationSteps extends BaseClass {
	@Given("I am on category result page")
	public void i_am_on_category_result_page() {
		driver.navigate().to("https://stage.xxlhoreca.com/aankleding/horecameubilair/inklapbare-tafels/");
		String title = driver.getTitle();
	    Assert.assertEquals("Inklapbare tafels van XXLhoreca | De Product Expert", title);
	  
	}
	@When("I click on different page number")
	public void i_click_on_different_page_number() {
		driver.findElement(By.cssSelector("label[for='p2']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
	
	}
	@Then("I land on to selected page")
	public void i_land_on_to_selected_page() {
		String title = driver.getTitle();
	    Assert.assertEquals("Inklapbare tafels van XXLhoreca | De Product Expert", title);}
	 
	}



