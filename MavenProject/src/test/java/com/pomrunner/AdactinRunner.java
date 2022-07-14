package com.pomrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.pom.AdactinLogIn;
import com.pom.BookHotel;
import com.pom.LogOut;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

public class AdactinRunner extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


		driver=browserlaunch("chrome");
		AdactinLogIn aL= new AdactinLogIn(driver);
		SearchHotel ht=new SearchHotel(driver);
		SelectHotel sH=new SelectHotel(driver);
		BookHotel bH= new BookHotel(driver);
		LogOut logO= new LogOut(driver);


		//login page
		url("https://adactinhotelapp.com/");
		WebElement username = aL.getUsername();
		sendKey(username, "arjunan08");
		WebElement password = aL.getPassword();
		sendKey(password, "arju12345");
		WebElement loginBtn = aL.getLoginBtn();
		clickElement(loginBtn);

		//search hotel page
		WebElement location = ht.getLocation();
		dropD(location, "value1", "Brisbane");

		WebElement hotel = ht.getHotel();
		dropD(hotel, "value1", "Hotel Sunshine");

		WebElement roomType = ht.getRoomType();
		dropD(roomType, "value1", "Super Deluxe");

		WebElement roomNo = ht.getRoomNo();
		dropD(roomNo, "value1", "2");

		WebElement checkIn = ht.getCheckIn();
		sendKey(checkIn, "18/07/2022");

		WebElement checkOut = ht.getCheckOut();
		sendKey(checkOut, "20/07/2022");

		WebElement adultsPerRoom = ht.getAdultsPerRoom();
		dropD(adultsPerRoom, "text", "2 - Two");

		WebElement childPerRoom = ht.getChildPerRoom();
		dropD(childPerRoom, "text", "1 - One");

		WebElement submitBtn = ht.getSubmitBtn();
		clickElement(submitBtn);

		//select hotel page

		WebElement radioBtn = sH.getRadioBtn();
		clickElement(radioBtn);

		WebElement continueBtn = sH.getContinueBtn();
		clickElement(continueBtn);

		//book a hotel
		WebElement fname = bH.getFname();
		sendKey(fname, "arjunan");

		WebElement lname = bH.getLname();
		sendKey(lname, "ganesan");

		WebElement address = bH.getAddress();
		sendKey(address, "Xyz street california");

		WebElement creditNum = bH.getCreditNum();
		sendKey(creditNum, "1234567890123456");

		WebElement creditType = bH.getCreditType();
		dropD(creditType, "text", "VISA");
		
		WebElement expMonth = bH.getExpMonth();
		dropD(expMonth, "text", "February");
		
		
		WebElement expYear = bH.getExpYear();
		dropD(expYear, "text", "2022");
		
		WebElement cvv = bH.getCvv();
		sendKey(cvv, "123");
		
		WebElement bookNowBtn = bH.getBookNowBtn();
		clickElement(bookNowBtn);
		
		//logOut

		WebElement logOut = logO.getLogOut();
		clickElement(logOut);
		

	}

}
