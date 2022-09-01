package com.redditPom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedditLoginPage {
	WebDriver driver;

	@FindBy(xpath="//iframe[@class='_25r3t_lrPF3M6zD2YkWvZU']")
	private WebElement frame;

	@FindBy(xpath = "//div[@class='Step__content']//input[@id='loginUsername']")
	private WebElement userName;

	@FindBy(xpath="//div[@class='Step__content']//input[@id='loginPassword']")
	private WebElement passWord;

	@FindBy(xpath ="//div[@class='Step__content']//button[@type='submit']")
	private WebElement logIn;



	public WebElement getFrame() {
		return frame;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public RedditLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
