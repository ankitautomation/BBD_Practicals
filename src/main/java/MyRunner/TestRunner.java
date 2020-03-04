package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\Selenium_Workspace\\BDD\\src\\main\\java\\Features\\login.feature", // This is the path off feature file
		glue= {"stepDefinition"}, // This is the path of the step definition files
		dryRun=false, // It will generate the report output on desire format
		format= {"pretty","html:HTMLtestOutput"}, // It will display proper readable format out
		monochrome=true
		)


public class TestRunner {

}
