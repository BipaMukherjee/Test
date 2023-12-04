package Com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class BrandpageSteps extends BaseClass {
	@When("I click on brand page from footer")
	public void i_click_on_brand_page_from_footer() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(" (//a[@title='Dyson'][normalize-space()='Dyson'])[1]")));
		element.click();
	
	   	}
	@Then("I get connected to brand page")
	public void i_get_connected_to_brand_page() {
        String actual = driver.findElement(By.cssSelector(".cms-element-cbax-manufacturers-headline")).getText();
        Assert.assertEquals("Products of Dyson", actual);
	    
	}


}
