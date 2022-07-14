package com.Sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String title = driver.getTitle();
	   System.out.println(title);
	   
	   driver.navigate().to("https://www.instagram.com/");
	   driver.navigate().back();
	   driver.navigate().forward();
	   driver.navigate().refresh();
	   driver.close();
	}

}
