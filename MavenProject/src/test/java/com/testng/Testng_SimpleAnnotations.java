package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_SimpleAnnotations {
    @BeforeSuite
	public void setup() {
		System.out.println("setup");
	}
 @BeforeTest
	public void browserlaunch() {
		System.out.println("browser");
	}
 @BeforeClass
	public void appLaunch() {
		System.out.println("app url");
	}
 @BeforeMethod
	public void login() {
		System.out.println("login credentials");
	}
 @Test
	public void lenovoLap() {
		System.out.println("lenovo lap page");
	}
 @Test
	public void iphone() {
		System.out.println("iphone page");

	}
 @AfterMethod
	public void verifyPage() {
		System.out.println("verify page/ assertion");
	}
@AfterClass
	public void logOut() {
		System.out.println("logout");
	}
@AfterTest
	public void browserClose() {
		System.out.println("close");
	}
@AfterSuite
	public void deleteCookies() {
		System.out.println("delete cookies");
	}


}
