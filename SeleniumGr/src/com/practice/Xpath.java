package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver103\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("html/body/div/div/div/header/div[2]/nav/div/div[3]")).click();
	driver.findElement(By.xpath("(//img[@class='image-image undefined image-hand'])[1]//following::picture")).click();//ucb
	
	
}
}
