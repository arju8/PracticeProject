package com.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1900)");
		Thread.sleep(3000);
		WebElement cloth = driver.findElement(By.xpath("(//span[text()='Clothing'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", cloth);
		js.executeScript("arguments[0].click();", cloth);
		js.executeScript("document.getelementById('twotabsearchtextbox').value='cutter';");
	}

}
