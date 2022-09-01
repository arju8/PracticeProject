package com.red;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Base.BaseClass;

public class SampRed extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\welcome\\git\\GreensProject\\MavenProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.reddit.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> subreddit = driver.findElements(By.xpath("//div[@data-testid='post-container']/div[3]/div/div[2]//descendant::a[@data-click-id='subreddit']"));
		for (WebElement elem : subreddit) {
			System.out.println(elem.getText());
			
		}
		System.out.println("done");
//		driver.findElement(By.xpath("//a[text()='Log In']")).click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='_25r3t_lrPF3M6zD2YkWvZU']"));
//		driver.switchTo().frame(frame);
//		driver.findElement(By.xpath("//div[@class='Step__content']//input[@id='loginUsername']")).sendKeys("hwchbc");



	}

}
