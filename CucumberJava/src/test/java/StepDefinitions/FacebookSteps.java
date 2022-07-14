package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.FbLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookSteps {
	WebDriver driver= null;
	FbLogin log;
	
	@Given("Open the browser")
	public void open_the_browser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\RS\\eclipse-workspace\\CucumberJava\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	   
	}

	@And("navigate to the webpage")
	public void navigate_to_the_webpage() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	    
	}
	@When("^i enter the valid (.*) and (.*)$")
	public void i_enter_the_valid_user_and_pass(String user1, String pass1) {
	log=new FbLogin(driver);
		log.enterUser(user1);
		log.enterPass(pass1);
		
		
	
	}

	@And("click the login button and enter homepage")
	public void click_the_login_button_and_enter_homepage() { 
		log.login();
		
	}

	@Then("click the logout button")
	public void click_the_logout_button() {
	   log.accountSettings();
	   log.logOut();
	}


}
