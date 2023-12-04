package Com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add2CartSteps extends BaseClass {

@Given("I am in PDP")
public void i_am_in_pdp() {
	driver.navigate().to("https://stage.xxlhoreca.com/warmhouden/warme-dranken/waterkokers/");
	driver.findElement(By
			.cssSelector("div[class='product-info'] a[title='Waterkoker RVS | 1,7L | 2,2 kW | 165x210x(H)240mm']")).click();
	
}
@When("I click add to cart button")
public void i_click_add_to_cart_button() {
	driver.findElement(By.cssSelector("button[title='In winkelwagen']")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Then("Product gets added to the basket")
public void product_gets_added_to_the_basket() {
	driver.navigate().to("https://stage.xxlhoreca.com/checkout/cart");
	
 
}
@And("Product is available on basket page")
public void product_is_available_on_basket_page() {
    // Check that the basket page is displayed
    String title = driver.getTitle();
    Assert.assertEquals("Winkelwagen", title);
   
}


}
