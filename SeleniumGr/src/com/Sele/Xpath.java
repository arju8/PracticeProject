package com.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement foot = driver.findElement(By.xpath("//img[@alt='Footwear']"));
	foot.click();
	WebElement mfoot = driver.findElement(By.xpath("(//img[contains(@alt,'footwear')])[1]"));
	mfoot.click();
	WebElement cservice = driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));
	cservice.click();
	Thread.sleep(3000);
	driver.close();
}
}
