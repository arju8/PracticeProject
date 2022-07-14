package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.AdactinLogIn;
import com.pom.BookHotel;
import com.pom.LogOut;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

public class ProjectObjectManager {
	
	WebDriver driver;
	
	private AdactinLogIn logIn;
	private BookHotel book;
	private SearchHotel search;
	private SelectHotel select;
	private LogOut logOut;
	public AdactinLogIn getLogIn() {
		logIn= new AdactinLogIn(driver);
		return logIn;
	}
	public BookHotel getBook() {
		book= new BookHotel(driver);
		return book;
	}
	public SearchHotel getSearch() {
		search=new SearchHotel(driver);
		return search;
	}
	public SelectHotel getSelect() {
		select=new SelectHotel(driver);
		return select;
	}
	public LogOut getLogOut() {
		logOut=new LogOut(driver);
		return logOut;
	}
	
	public ProjectObjectManager(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
