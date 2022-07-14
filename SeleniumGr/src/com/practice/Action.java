package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions builder= new Actions(driver);
		//double click
		WebElement dclick = driver.findElement(By.id("doubleClickBtn"));
		builder.doubleClick(dclick).build().perform();
		//rightclick
		WebElement rightclk = driver.findElement(By.id("rightClickBtn"));
		builder.contextClick(rightclk).build().perform();
		//click
		WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
		builder.click(click).build().perform();
		
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		//drag and drop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		builder.dragAndDrop(drag, drop).build().perform();
		driver.navigate().refresh();
		Thread.sleep(3000);
		//click and hold
		builder.clickAndHold(drag).moveToElement(drop).build().perform();
		
	}

}
