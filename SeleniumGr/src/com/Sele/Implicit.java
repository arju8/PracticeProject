package com.Sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Implicit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		driver.findElement(By.name("emailOrPhone")).sendKeys("Arju1423@gmail.com");
		driver.findElement(By.name("fullName")).sendKeys("arjunan");
		driver.findElement(By.name("username")).sendKeys("arjy12878390");
		driver.findElement(By.name("password")).sendKeys("1234567890@tyefyA");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month:']"));
		Select sel=new Select(month);
		sel.selectByVisibleText("June");
		WebElement day = driver.findElement(By.xpath("//select[@title='Day:']"));
		Select sele=new Select(day);
		sele.selectByIndex(22);
		WebElement year = driver.findElement(By.xpath("//select[@title='Year:']"));
		Select selec=new Select(year);
		selec.selectByValue("2001");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		
		
	}

}
