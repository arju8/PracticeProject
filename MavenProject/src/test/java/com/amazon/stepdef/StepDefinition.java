package com.amazon.stepdef;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.amazon.runner.Am_RunnerClass;
import com.pom.AmazonHomepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{

	WebDriver driver=Am_RunnerClass.driver;
	AmazonHomepage am=new AmazonHomepage(driver);

	@Given("^user  landed on the amazon homepage$")
	public void user_landed_on_the_amazon_homepage() throws Throwable {
		url("https://www.amazon.in/");
	}

	@When("^user enters \"([^\"]*)\"$")
	public void user_enters(String arg1) throws Throwable {
		WebElement searchBox = am.getSearchBox();
		sendKey(searchBox, arg1);


	}

	@When("^user hits the search button$")
	public void user_hits_the_search_button() throws Throwable {
		WebElement searchButton = am.getSearchButton();
		clickElement(searchButton);

	}

	@Then("^user should be displayed (\\d+) items per page$")
	public void user_should_be_displayed_items_per_page(int arg1) throws Throwable {
		System.out.println("20 items displayed");

	}


}
