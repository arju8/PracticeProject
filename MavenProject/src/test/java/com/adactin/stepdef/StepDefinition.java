package com.adactin.stepdef;


import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.adactin.runner.AdactinRunnerCucu;
import com.propertyfile.FileReaderManager;
import com.sdp.ProjectObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	WebDriver driver=AdactinRunnerCucu.driver;
	ProjectObjectManager pom=new ProjectObjectManager(driver);


	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws IOException  {
		String url = FileReaderManager.getInstanceFR().getInstanceCr().getUrl();
		url(url);
	}

	@When("^user Enter The Username In The InputField$")
	public void user_Enter_The_Username_In_The_InputField()  {
		WebElement username = pom.getLogIn().getUsername();
		sendKey(username, "arjunan08");
	}

	@When("^user Enter The Password In The InputField$")
	public void user_Enter_The_Password_In_The_InputField()  {
		WebElement password = pom.getLogIn().getPassword();
		sendKey(password, "arju12345");
	}

	@Then("^user Click On The Login Button And It Navigates To The Searchpage$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Searchpage() {
		WebElement loginBtn = pom.getLogIn().getLoginBtn();
		clickElement(loginBtn);
		String url ="https://adactinhotelapp.com/SearchHotel.php";
		
		Assert.assertEquals(url, driver.getCurrentUrl());
		System.out.println("url equals");
	}

	@When("^user Select the Location From The DropDown$")
	public void user_Select_the_Location_From_The_DropDown()  {
		WebElement location = pom.getSearch().getLocation();
		dropD(location, "value1", "Brisbane");

	}

	@When("^user Select the Hotel From DropDown$")
	public void user_Select_the_Hotel_From_DropDown() {
		WebElement hotel = pom.getSearch().getHotel();
		dropD(hotel, "value1", "Hotel Sunshine");

	}

	@When("^user Select The Room Type From DropDown$")
	public void user_Select_The_Room_Type_From_DropDown() {
		WebElement roomType = pom.getSearch().getRoomType();
		dropD(roomType, "value1", "Super Deluxe");


	}

	@When("^user Select The No Of Room From DropDown$")
	public void user_Select_The_No_Of_Room_From_DropDown() {
		WebElement roomNo = pom.getSearch().getRoomNo();
		dropD(roomNo, "value1", "2");


	}

	@When("^user Chooses The Checkin Date$")
	public void user_Chooses_The_Checkin_Date() {
		WebElement checkIn = pom.getSearch().getCheckIn();
		sendKey(checkIn, "18/07/2022");


	}

	@When("^user Chooses The Check OUt Date$")
	public void user_Chooses_The_Check_OUt_Date() {
		WebElement checkOut = pom.getSearch().getCheckOut();
		sendKey(checkOut, "20/07/2022");

	}

	@When("^user Selects The Adult Per Room From DropDown$")
	public void user_Selects_The_Adult_Per_Room_From_DropDown() {
		WebElement adultsPerRoom = pom.getSearch().getAdultsPerRoom();
		dropD(adultsPerRoom, "text", "2 - Two");
	}

	@When("^user Selects The Child Per Room From DropDown$")
	public void user_Selects_The_Child_Per_Room_From_DropDown() {
		WebElement childPerRoom = pom.getSearch().getChildPerRoom();
		dropD(childPerRoom, "text", "1 - One");


	}

	@Then("^user Clicks On The Search Button and Navigates To Select Hotel Page$")
	public void user_Clicks_On_The_Search_Button_and_Navigates_To_Select_Hotel_Page() {

		WebElement submitBtn = pom.getSearch().getSubmitBtn();
		clickElement(submitBtn);

	}

	@When("^user Selects the Hotel By Clicking The Radio Button$")
	public void user_Selects_the_Hotel_By_Clicking_The_Radio_Button() {
		WebElement radioBtn = pom.getSelect().getRadioBtn();
		clickElement(radioBtn);
	}

	@Then("^user Click On The Continue Button And Navigates To Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_Navigates_To_Book_A_Hotel_Page() {

		WebElement continueBtn = pom.getSelect().getContinueBtn();
		clickElement(continueBtn);

	}

	@When("^user Enters The FirstName$")
	public void user_Enters_The_FirstName() {
		WebElement fname = pom.getBook().getFname();
		sendKey(fname, "arjunan");

	}

	@When("^user Enters The LastName$")
	public void user_Enters_The_LastName() {
		WebElement lname = pom.getBook().getLname();
		sendKey(lname, "ganesan");


	}

	@When("^user Enters The Billing Address$")
	public void user_Enters_The_Billing_Address()  {
		WebElement address = pom.getBook().getAddress();
		sendKey(address, "xyzstreet california");


	}

	@When("^user Enters The Credit Card Number$")
	public void user_Enters_The_Credit_Card_Number() {
		WebElement creditNum = pom.getBook().getCreditNum();
		sendKey(creditNum, "1234567890123456");


	}

	@When("^user Selects The Credit Card Type From$")
	public void user_Selects_The_Credit_Card_Type_From()  {
		WebElement creditType = pom.getBook().getCreditType();
		dropD(creditType, "text", "VISA");


	}

	@When("^user Selects The Expiry Month From The DropDown$")
	public void user_Selects_The_Expiry_Month_From_The_DropDown()  {

		WebElement expMonth = pom.getBook().getExpMonth();
		dropD(expMonth, "text", "February");

	}

	@When("^user Enters The Expiry Year From The DropDown$")
	public void user_Enters_The_Expiry_Year_From_The_DropDown()  {
		WebElement expYear = pom.getBook().getExpYear();
		dropD(expYear, "text", "2022");


	}

	@When("^user Enters The Cvv Number$")
	public void user_Enters_The_Cvv_Number()  {
		WebElement cvv = pom.getBook().getCvv();
		sendKey(cvv, "123");

	}

	@Then("^user Clicks On The Book Hotel Button And Navigates To LogOut Page$")
	public void user_Clicks_On_The_Book_Hotel_Button_And_Navigates_To_LogOut_Page()  {
		WebElement bookNowBtn = pom.getBook().getBookNowBtn();
		clickElement(bookNowBtn);

	}

	@When("^user Clicks ON The LogOut Button$")
	public void user_Clicks_ON_The_LogOut_Button()  {
		WebElement logOut = pom.getLogOut().getLogOut();
		clickElement(logOut);
	}

	@Then("^user Should LogOUt SuccessFully$")
	public void user_Should_LogOUt_SuccessFully() {
		System.out.println("==============Booking Done SuccessFully And Logged Out  of the Account=================== ");

	}





}
