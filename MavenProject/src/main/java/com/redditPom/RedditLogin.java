package com.redditPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedditLogin {
	 WebDriver driver;
	@FindBy(xpath = "//a[text()='Log In']")
	private WebElement logInBtn;

	public WebElement getLogInBtn() {
		return logInBtn;
	}

	public RedditLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	
	

}
