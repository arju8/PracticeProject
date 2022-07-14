package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver103\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("New User Register Here")).click();
	driver.findElement(By.id("username")).sendKeys("arjunan08");
	driver.findElement(By.id("password")).sendKeys("arju12345");
	driver.findElement(By.id("re_password")).sendKeys("arju12345");
	driver.findElement(By.name("full_name")).sendKeys("arjunan");
	driver.findElement(By.name("email_add")).sendKeys("arju1423@gmail.com");
	
	}
}
