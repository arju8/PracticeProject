package com.Sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MProject {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//		driver.findElement(By.id("email_create")).sendKeys("arju1234@gmail.com");
		//		driver.findElement(By.id("SubmitCreate")).click();
		//		driver.findElement(By.id("id_gender1")).click();
		//		driver.findElement(By.id("customer_firstname")).sendKeys("arjunan");
		//		driver.findElement(By.id("customer_lastname")).sendKeys("ganesan");
		//		driver.findElement(By.id("passwd")).sendKeys("123456");
		//		WebElement day = driver.findElement(By.id("days"));
		//		Select sc= new Select(day);
		//		sc.selectByValue("7");
		//		WebElement mon = driver.findElement(By.id("months"));
		//		Select sc1= new Select(mon);
		//		sc1.selectByValue("6");
		//		WebElement year = driver.findElement(By.id("years"));
		//		Select sc2= new Select(year);
		//		sc2.selectByValue("2010");
		//		driver.findElement(By.id("firstname")).sendKeys("arju");
		//		driver.findElement(By.id("lastname")).sendKeys("ganesan");
		//		driver.findElement(By.id("company")).sendKeys("abc infotech");
		//		driver.findElement(By.id("address1")).sendKeys("xyz street,chennai");
		//		driver.findElement(By.name("city")).sendKeys("chennai");
		//		WebElement state = driver.findElement(By.id("id_state"));
		//		Select sc4= new Select(state);
		//		sc4.selectByValue("32");
		//		driver.findElement(By.id("postcode")).sendKeys("60028");
		//		WebElement country = driver.findElement(By.id("id_country"));
		//		Select sc5= new Select(country);
		//		sc5.selectByVisibleText("United States");
		//		driver.findElement(By.name("phone_mobile")).sendKeys("9797643456");
		//		driver.findElement(By.id("alias")).sendKeys("xyz street,lasvegas");
		//		driver.findElement(By.id("submitAccount")).click();
		
		System.out.println("******After Register*******");
		
		
		driver.findElement(By.id("email")).sendKeys("arju1234@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Add to cart'])")).click();
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		System.out.println("==order placed successfully====");




	}

}
