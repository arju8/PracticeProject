package com.Sele;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("gduigfvui");
		driver.findElement(By.name("pass")).sendKeys("fyuyvu");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\Screenshots/fb.jpeg");
		FileUtils.copyFile(src, des);
	}

}
