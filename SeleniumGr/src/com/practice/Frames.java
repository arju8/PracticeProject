package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		//frame
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("Click")).click();

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().defaultContent();
		
		//nested frame
		driver.switchTo().frame(1);
		int size1=driver.findElements(By.tagName("iframe")).size();
		System.out.println(size1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		
		
	}

}
