package com.Sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowh {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RS\\eclipse-workspace\\SeleniumGr\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://amazon.in/");
	driver.manage().window().maximize();
	Actions as= new Actions(driver);
	WebElement best = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
	as.contextClick(best).build().perform();
	Robot robo = new Robot();
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement mob = driver.findElement(By.xpath("(//a[text()='Mobiles'])[1]"));
	as.contextClick(mob).build().perform();
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement cser = driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));
	as.contextClick(cser).build().perform();
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	
	
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	
	Set<String> sub = driver.getWindowHandles();
	System.out.println(sub);
	
	Iterator<String> iter = sub.iterator();
	
		while(iter.next() != parent) {
		System.out.println();
		iter.hasNext();
		if (iter.next()!=parent) {
			driver.switchTo().window(iter.next()).close();
		}
	}
	
	
}
}
