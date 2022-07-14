package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		//simple alert
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		//confirm
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		String text2= driver.switchTo().alert().getText();
		System.out.println(text2);
		driver.switchTo().alert().dismiss();
		//prompt alert
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		String text3=driver.switchTo().alert().getText();
		System.out.println(text3);
		driver.switchTo().alert().sendKeys("rdyhftt");
		driver.switchTo().alert().accept();
	}

}
