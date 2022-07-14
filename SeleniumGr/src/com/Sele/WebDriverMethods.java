package com.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
         WebDriver driver =new ChromeDriver();
         driver.get("https://en-gb.facebook.com/");
         driver.manage().window().maximize();
         WebElement email = driver.findElement(By.id("email"));
         email.sendKeys("arj@66hmail.com");		
         boolean enabled = email.isEnabled();
         System.out.println(enabled);
         System.out.println(email.getAttribute("value"));
         WebElement pass  = driver.findElement(By.id("pass"));
         pass.sendKeys("adsfsfgfg");
         boolean displayed = pass.isDisplayed();
         System.out.println(displayed);
         System.out.println(pass.getAttribute("pass"));
         WebElement login = driver.findElement(By.name("login"));
         login.click();



	}

}