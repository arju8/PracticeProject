package com.Sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/signin");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.name("email")).sendKeys("ajarjunan8@gmail.com");
	driver.findElement(By.name("password")).sendKeys("arju@123");
	driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	WebElement pop = driver.findElement(By.xpath("//div[@role='alertdialog']"));
	WebDriverWait wait= new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.visibilityOf(pop));
	System.out.println(pop.getText());
}
}
