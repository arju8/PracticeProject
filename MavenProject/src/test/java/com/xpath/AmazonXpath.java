package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\git\\GreensProject\\MavenProject\\drivers\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='a-cardui-header as-title-block']//h2[text()='Today’s Deals']//following::div/div/ul/li"));
	    
	
	}
}
