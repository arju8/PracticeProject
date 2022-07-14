package StepDefinitions;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/login.feature",glue= {"StepDefinitions"},
monochrome=true,
plugin={"pretty","junit:target1/JUNITReports1/report.xml",
		"json:target1/JSONReports1/report.json",
		"html:target1/HtmlReports"}
		)
public class Runner {

}
