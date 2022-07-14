package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

	WebDriver driver;

	@FindBy(name="radiobutton_0")
	private WebElement radioBtn;
	@FindBy(name="continue")
	private WebElement continueBtn;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	public SelectHotel(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}





}
