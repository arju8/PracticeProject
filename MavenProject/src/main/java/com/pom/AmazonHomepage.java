package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomepage {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	
	public WebElement getSearchBox() {
		return searchBox;
	}


	public void setSearchBox(WebElement searchBox) {
		this.searchBox = searchBox;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}


	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}


	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchButton;
	
	
	public AmazonHomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
}
