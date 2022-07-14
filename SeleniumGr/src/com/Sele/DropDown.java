package com.Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
//		WebElement single = driver.findElement(By.id("oldSelectMenu"));
//		Select s= new Select(single);
//		s.selectByIndex(0);
//		s.selectByValue("4");
//		s.selectByVisibleText("Yellow");
//		WebElement fs = s.getFirstSelectedOption();
//		System.out.println(fs.getText());
//		
//		List<WebElement> option = s.getOptions();
//		for (WebElement web : option) {
//			System.out.println(web.getText());
//			
//		}
		WebElement multiple = driver.findElement(By.id("cars"));
		Select s1=new Select(multiple);
		s1.selectByIndex(0);
		s1.selectByValue("saab");
		s1.selectByVisibleText("Audi");
		List<WebElement> as = s1.getAllSelectedOptions();
		for (WebElement web2 : as) {
			System.out.println(web2.getText());
			
		}
		s1.deselectByIndex(0);

	}
}
