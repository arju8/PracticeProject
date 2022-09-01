package com.redditRunner;

import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.redditPom.RedditHomePage;
import com.redditPom.RedditLogin;
import com.redditPom.RedditLoginPage;

public class RedditRunner extends BaseClass{
	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver=browserlaunch("chrome");
		url("https://www.reddit.com/");

		RedditLogin red=new RedditLogin(driver);
		RedditLoginPage redLog=new RedditLoginPage(driver);
		RedditHomePage hmPage=new RedditHomePage(driver);

		red.getLogInBtn().click();


		WebElement frame = redLog.getFrame();
		frames(frame);

		sendKey(redLog.getUserName(), "arju8");


		sendKey(redLog.getPassWord(), "Arjunanaj@8");

		clickElement(redLog.getLogIn());
		
		
		//After Login Homepage
	Thread.sleep(3000);
	sendKey(hmPage.getSearchBtn(), "chennai");
	roboPress(KeyEvent.VK_ENTER);
	roboRelease(KeyEvent.VK_ENTER);
	 
	System.out.println("search done");
	
	
	driver.navigate().back();
	
	String text = hmPage.getPostsHeader().getText();
	Set<String> postHead=new HashSet<String>();
	postHead.add(text);
	System.out.println(postHead);
	


	}

}
