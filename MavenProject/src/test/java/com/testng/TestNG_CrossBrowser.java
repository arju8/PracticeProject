package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.BaseClass;


public class TestNG_CrossBrowser extends BaseClass {
	@Parameters({"browsers"})
	@BeforeClass
	public void launchbrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			browserlaunch("chrome");
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			browserlaunch("firefox");
		}

	}
	@BeforeMethod
	public void loginFB() {
		url("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "data")
	public void login(String user,String pass){

		sendKey(driver.findElement(By.id("email")), user);
		sendKey(driver.findElement(By.id("pass")), pass);
		clickElement(driver.findElement(By.id("loginbutton")));
	}

	@AfterMethod
	public void afterlogin() {
		System.out.println("login failed enter correct username and password");
	}

	@DataProvider(name="data")
	public Object[][] testData() {


		return new Object[][] {
			{"arjunan","12345"},{"arju","123654"},{"jbrhwvrw","125455"}
		};
	}
	@AfterClass
	public void quitBrowser() {
		quit();

	}
}
