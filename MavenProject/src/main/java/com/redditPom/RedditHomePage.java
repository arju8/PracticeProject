package com.redditPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedditHomePage {
	WebDriver driver;
	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchBtn;

	@FindBy(xpath="//div[@data-testid='post-container']/div[3]/div/div[2]//descendant::a[@data-click-id='subreddit']")
	private WebElement postsHeader;

	@FindBy(xpath="//button[@class='h-jI8r2f9ozTNqu_2TBeY']")
	private WebElement communityBtn;

	@FindBy(xpath = "//div[@role='menu']//a//span[@class='_2aqH0n-kSzFY7HZZ5GL-Jb']")
	private WebElement subReddit;



	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getPostsHeader() {
		return postsHeader;
	}

	public WebElement getCommunityBtn() {
		return communityBtn;
	}

	public WebElement getSubReddit() {
		return subReddit;
	}

	public RedditHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
