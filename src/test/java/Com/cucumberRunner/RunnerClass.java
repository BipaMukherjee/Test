package Com.cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/Features",
		glue= {"Com.stepDefinitions"},
//				tags= "@new",
		tags= "@smoke or @regression or @sanity",
		plugin= {"summary", "pretty", "html:target/cucumber-reports.html",
				"json:target/cucumber-reports",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome= true
            
            

)


public class RunnerClass {

}
