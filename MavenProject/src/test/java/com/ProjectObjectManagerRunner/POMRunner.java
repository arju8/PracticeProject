package com.ProjectObjectManagerRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.sdp.ProjectObjectManager;

public class POMRunner extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=browserlaunch("chrome");
		url("https://adactinhotelapp.com/");

		ProjectObjectManager pom=new ProjectObjectManager(driver);
		//login
		WebElement username = pom.getLogIn().getUsername();
		sendKey(username, "arjunan08");

		WebElement password = pom.getLogIn().getPassword();
		sendKey(password, "arju12345");

		WebElement loginBtn = pom.getLogIn().getLoginBtn();
		clickElement(loginBtn);

		//search
		WebElement location = pom.getSearch().getLocation();
		dropD(location, "value1", "Brisbane");

		WebElement hotel = pom.getSearch().getHotel();
		dropD(hotel, "value1", "Hotel Sunshine");

		WebElement roomType = pom.getSearch().getRoomType();
		dropD(roomType, "value1", "Super Deluxe");

		WebElement roomNo = pom.getSearch().getRoomNo();
		dropD(roomNo, "value1", "2");

		WebElement checkIn = pom.getSearch().getCheckIn();
		sendKey(checkIn, "18/07/2022");

		WebElement checkOut = pom.getSearch().getCheckOut();
		sendKey(checkOut, "20/07/2022");

		WebElement adultsPerRoom = pom.getSearch().getAdultsPerRoom();
		dropD(adultsPerRoom, "text", "2 - Two");

		WebElement childPerRoom = pom.getSearch().getChildPerRoom();
		dropD(childPerRoom, "text", "1 - One");

		WebElement submitBtn = pom.getSearch().getSubmitBtn();
		clickElement(submitBtn);

		//select hotel
		WebElement radioBtn = pom.getSelect().getRadioBtn();
		clickElement(radioBtn);

		WebElement continueBtn = pom.getSelect().getContinueBtn();
		clickElement(continueBtn);

		//BookHotel

		WebElement fname = pom.getBook().getFname();
		sendKey(fname, "arjunan");

		WebElement lname = pom.getBook().getLname();
		sendKey(lname, "ganesan");

		WebElement address = pom.getBook().getAddress();
		sendKey(address, "xyzstreet california");


		WebElement creditNum = pom.getBook().getCreditNum();
		sendKey(creditNum, "1234567890123456");

		WebElement creditType = pom.getBook().getCreditType();
		dropD(creditType, "text", "VISA");

		WebElement expMonth = pom.getBook().getExpMonth();
		dropD(expMonth, "text", "February");

		WebElement expYear = pom.getBook().getExpYear();
		dropD(expYear, "text", "2022");

		WebElement cvv = pom.getBook().getCvv();
		sendKey(cvv, "123");

		WebElement bookNowBtn = pom.getBook().getBookNowBtn();
		clickElement(bookNowBtn);
		
		//logout
		WebElement logOut = pom.getLogOut().getLogOut();
		clickElement(logOut);



	}

}
