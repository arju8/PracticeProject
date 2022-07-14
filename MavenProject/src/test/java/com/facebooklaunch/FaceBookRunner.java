package com.facebooklaunch;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class FaceBookRunner extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		browserlaunch("chrome");
		url("https://www.facebook.com/");
		sendKey(driver.findElement(By.id("email")), "arjunan");
		clickElement(driver.findElement(By.xpath("(//a[@role='button'])[2]  ")));
		Thread.sleep(4000);
		WebElement day = driver.findElement(By.name("birthday_day"));
		dropD(day,"value1", "14");
		WebElement month = driver.findElement(By.name("birthday_month"));
		dropD(month, "text", "Jun");
		WebElement year = driver.findElement(By.name("birthday_year"));
		dropD(year, "text", "1997");
		WebElement signin = driver.findElement(By.name("websubmit"));
	    Actions("rightclick", signin);
	    title();
	    jsExecutor("window.scrollBy(0,1000)");
	   
	    
	    roboPress(KeyEvent.VK_DOWN);	
	    roboPress(KeyEvent.VK_DOWN);	
        roboPress(KeyEvent.VK_DOWN);	
	    roboPress(KeyEvent.VK_DOWN);
	    roboPress(KeyEvent.VK_ENTER);	
		takeScreenShot("fb2"); 
	}

	

}
