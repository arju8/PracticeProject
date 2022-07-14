package com.Sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://letcode.in/waits");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("accept")).click();
	    //driver.switchTo().alert().accept();
	    WebDriverWait wait= new WebDriverWait(driver, 30);
	    Alert Text = wait.until(ExpectedConditions.alertIsPresent());
	    System.out.println(Text.getText());
	    Text.accept();
	}

}
