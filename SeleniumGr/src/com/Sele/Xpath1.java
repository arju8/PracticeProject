package com.Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href='course.php'])[2]")).click();
		List<WebElement> Elements = driver.findElements(By.xpath("//a[contains(@href,'selen')]"));
		System.out.println(Elements);
		
		for (WebElement web : Elements) {
			System.out.println(web.getText());
			
		}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//a[contains(text(),'Selenium Training')]")).click();
		WebElement tag = driver.findElement(By.xpath("//a[contains(text(),'Live Project')]"));
		System.out.println(tag.getTagName());
		System.out.println(tag.getCssValue("font-style")); 
		tag.click();
		
		
		
		
	}

}
