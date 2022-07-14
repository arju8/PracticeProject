package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	WebDriver driver;

	@FindBy(name="location")
	private WebElement location;
	@FindBy(name="hotels")
	private WebElement hotel;
	@FindBy(name="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement roomNo;
	@FindBy(name="datepick_in")
	private WebElement checkIn;
	@FindBy(name="datepick_out")
	private WebElement checkOut;
	@FindBy(name="adult_room")
	private WebElement adultsPerRoom;
	@FindBy(name="child_room")
	private  WebElement childPerRoom;
	@FindBy(name="Submit")
	private WebElement submitBtn;



	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNo() {
		return roomNo;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public SearchHotel(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	


}


