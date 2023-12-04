package Com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import Com.cucumberRunner.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends BaseClass {

	
	@Before
	public void initializedriver() throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "/Users/bipamukherjee/Documents/New chrome driver and browser/chromedriver-mac-x64/chromedriver");
//		ChromeOptions options = new ChromeOptions();
//		options.setBinary("/Users/bipamukherjee/Documents/New chrome driver and browser/chrome-mac-x64");
//		driver =new ChromeDriver(options);
//		driver.get("https://stage.xxlhoreca.com/");
//	    driver.manage().window().maximize();
//	    driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
	 
	    
	    
		System.setProperty("webdriver.gecko.driver", "/Users/bipamukherjee/Documents/New chrome driver and browser/geckodriver");
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("security.fileuri.strict_origin_policy", false);
		options.addPreference("network.http.referer.XOriginPolicy", 0);
		driver = new FirefoxDriver(options);
	    driver.get("https://stage.xxlhoreca.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();	
	}
	
	@AfterStep
	public void takeScreenshot (Scenario scenario) {
		if(scenario.isFailed())
		{
		final byte [] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");
		}
	}
	
  @After
	    public void destroy() {
	        if (driver != null) {
	            driver.quit();
      }
	    }
	}



