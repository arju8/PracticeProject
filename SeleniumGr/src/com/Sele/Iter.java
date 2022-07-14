package com.Sele;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> allclass = driver.findElements(By.xpath("//a[@class='a-link-normal']"));
		ListIterator<WebElement> iter = allclass.listIterator();
		while(iter.hasPrevious()) {
			System.out.println(iter.previous().getText());
		}
	}

}
