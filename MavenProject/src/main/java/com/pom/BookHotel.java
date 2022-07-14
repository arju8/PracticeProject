package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	WebDriver driver;
	
	
	@FindBy(name="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement creditNum;
	

	@FindBy(name="cc_type")
	private WebElement creditType;
	
	@FindBy(name="cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	@FindBy(name="book_now")
	private WebElement bookNowBtn;
	
	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	public WebElement getCreditNum() {
		return creditNum;
	}

	public WebElement getCreditType() {
		return creditType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public BookHotel(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	

}
