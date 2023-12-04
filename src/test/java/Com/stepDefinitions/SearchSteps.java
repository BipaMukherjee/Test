package Com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends BaseClass {

@Given("I am in home page")
public void i_am_in_home_page() {
	String title = driver.getTitle();
    Assert.assertEquals("Horeca apparatuur bestellen bij de groothandel XXLhoreca", title);
   
}


@When("I search with valid data {string}")
public void i_search_with_valid_data(String data) {
	driver.findElement(By.xpath("//*[@id=\"searchCollapse\"]/div/form/div/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"searchCollapse\"]/div/form/div/input")).sendKeys(data);
	driver.findElement(By.xpath("//span[@class='icon icon-search']//*[name()='svg']")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
}


@Then("I should see {string}")
public void i_should_see(String resutls) {
	String URL = driver.getTitle();
    Assert.assertEquals("XXLHoreca.com", URL);
}

}