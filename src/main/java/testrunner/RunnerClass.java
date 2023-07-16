package testrunner;

import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Automation Testing\\Workspace\\PHPTravelsCucumber2023\\src\\main\\java\\feature\\TestCase1.feature",
glue="stepdefinitions",
monochrome=true,
dryRun = false,
plugin = {"pretty","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports/Cucumber.html","junit:target/cucumber-reports/Cucumber.xml"})

//plugin = {"html:reports/cucumber","json:reports/cucumber.json"})

public class RunnerClass  {

	
}
