package com.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.leafground.com/pages/frame.html");
       // WebElement frame1= driver.findElement(By.id("//iframe[@src='default.html']"));
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[@id='Click']")).click();
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(1);
        WebElement nes = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(nes);
        driver.findElement(By.xpath("//button[@id='Click1']")).click();
        
	}

}
