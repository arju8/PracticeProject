package com.amazon.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\amazon\\feature\\Amazon.feature", glue="com.amazon.stepdef")
public class Am_RunnerClass{
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver=BaseClass.browserlaunch("chrome");
	}

	
	@AfterClass
	public static void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		
	}
}
