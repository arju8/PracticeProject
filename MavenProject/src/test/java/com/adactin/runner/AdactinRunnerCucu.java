package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature", glue = "com.adactin.stepdef",
plugin = {"pretty","html:Reports/CucumberHtml","json:Reports/CucumberJson.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/cucumberExtent.html"},
monochrome =true, 
strict =true)

public class AdactinRunnerCucu {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver=BaseClass.browserlaunch("chrome");

	}



	@AfterClass
	public static void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		BaseClass.close();

	}
}
