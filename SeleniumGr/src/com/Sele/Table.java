package com.Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement tab = driver.findElement(By.id("shopping"));
		System.out.println(tab.getText());

		WebElement bod = driver.findElement(By.xpath("//table[@id='shopping']/tbody"));
		System.out.println(bod.getText());

		List<WebElement> ele = driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td"));
		for (WebElement web : ele) {
			System.out.println(web.getText());

		}
		WebElement row = driver.findElement(By.xpath("(//table[@id='shopping']/tbody/tr)[1]"));
		System.out.println(row.getText());
	}
}
