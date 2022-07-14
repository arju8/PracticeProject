package com.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);
        String text = driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]")).getText();
		 System.out.println(text);
        driver.switchTo().defaultContent();
        
        WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame2);
       String text1 =driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]")).getText();
       System.out.println(text1);
       driver.switchTo().defaultContent();
       Thread.sleep(3000);
       
       Dimension size = driver.findElement(By.tagName("iframe")).getSize();
       System.out.println(size);
       
        
        
	}

}
