

package Com.stepDefinitions;
import org.junit.Assert;
import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PageSizeSteps extends BaseClass {


	  @Given("I am on the homepage")
	  public void i_am_on_the_homepage() {
		  String title = driver.getTitle();
	        Assert.assertEquals("Horeca apparatuur bestellen bij de groothandel XXLhoreca", title);
	    
	  }

	  @When("I navigate to the {string}")
	  public void i_navigate_to_the(String page) {
	    driver.navigate().to(page);
	  }
	   

	    
	   @Then("the total size of resources loaded by the {string} should be less than {string} kilobytes")
	    public void andTheTotalSizeOfResourcesLoadedByThePageShouldBeLessThanSize(String page, String expectedSize) {
		int expectedSizeInt = Integer.parseInt(expectedSize);
	    long pageSize = driver.getPageSource().length() / 1024;
	    Assert.assertTrue("Page size exceeds the expected size", pageSize <= expectedSizeInt);
	        
	   }
	   }
	    
	    
	    

		


