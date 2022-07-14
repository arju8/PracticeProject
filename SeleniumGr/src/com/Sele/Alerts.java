package com.Sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		WebElement simple = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		simple.click();
		driver.switchTo().alert().accept();
		
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
		confirm.click();
		driver.switchTo().alert().dismiss();
		
		WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
		prompt.click();
		
		driver.switchTo().alert().sendKeys("Arjunan");
		driver.switchTo().alert().accept();
		
		WebElement modern = driver.findElement(By.xpath("//button[text()='Modern Alert']"));
		modern.click();
		
		Robot myrobo=new Robot();
		myrobo.mouseMove(2045,50);
		Thread.sleep(4000);
		myrobo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(4000);
		myrobo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		
		
		System.out.println("Alerts done");

	}

}
