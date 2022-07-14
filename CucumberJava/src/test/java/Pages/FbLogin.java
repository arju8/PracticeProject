package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbLogin {
	WebDriver driver;
	public FbLogin(WebDriver driver) {
		this.driver=driver;
	}
	By txt_username=By.name("email");
	By txt_password=By.name("pass");
	By btn_logIn=By.name("login");
	By clk_accSet=By.xpath("//div[contains(text(),'Account Settings')]");//not working check it
	By clk_logOut=By.xpath("//span[contains(text(),'Log Out')]");
//	@FindBy(how=How.NAME, using="user" ) WebElement username;
//	@FindBy(how=How.NAME, using="pass") WebElement password;
//	@FindBy(how=How.NAME, using="login") WebElement login;
//	@FindBy(how=How.XPATH, using="//div[contains(text(),'Account Settings')]")  WebElement accSet;
//	@FindBy(how=How.XPATH, using="//span[contains(text(),'Log Out')]") WebElement logOut;
//	
	public void enterUser(String user) {
	driver.findElement(txt_username).sendKeys(user);
	}
	public void enterPass(String pass) {
		driver.findElement(txt_password).sendKeys(pass);
	}
	public void login() {
		driver.findElement(btn_logIn).click();
	}
	public void accountSettings() {
		driver.findElement(clk_accSet).click();
	}
	public void logOut() {
		driver.findElement(clk_logOut).click();
	}
	
}
