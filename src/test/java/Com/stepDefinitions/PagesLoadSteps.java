package Com.stepDefinitions;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Assert;
import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PagesLoadSteps extends BaseClass {
	 private StopWatch watch;

	  @Given("I am at homepage")
	  public void i_am_at_homepage() {
		  String title = driver.getTitle();
	        Assert.assertEquals("Horeca apparatuur bestellen bij de groothandel XXLhoreca", title);
	    
	  }

	  @When("I go to the {string}")
	  public void i_go_to_the(String page) {
	    watch = new StopWatch();
	    watch.start();
	    driver.navigate().to(page);
	  }
	   
	  
	    @Then("the {string} should load in less than {string} seconds")
	    public void the_should_load_in_less_than_seconds(String page, String expectedTime) {
	        int expectedTimeInt = Integer.parseInt(expectedTime);
	        watch.stop();
	        long elapsedTime = watch.getTime();
	        Assert.assertTrue("Page " + page + " took " + elapsedTime + "ms to load, which is more than " + expectedTime + " seconds", elapsedTime < expectedTimeInt * 1000);
	   
	        
	   }
	   }
	    
	    