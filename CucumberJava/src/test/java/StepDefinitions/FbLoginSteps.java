package StepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbLoginSteps {
	
	WebDriver driver =null;
	@Given("open the browser")
	public void open_the_browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RS\\eclipse-workspace\\CucumberJava\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	   
		
	}
	@And("navigate to the page")
	public void navigate_to_the_page() {
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
	
	    
	}

	@When("^i enter the (.*) and (.*)$")
	public void i_enter_the_username_and_password(String username, String password) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
	
	    
	}

	@And("click on the login button")
	public void click_on_the_login_button() {
	  driver.findElement(By.name("login")).click();  
	}

	@Then("we can see the error page")
	public void we_can_see_the_error_page() throws InterruptedException{
	    Thread.sleep(3000);
	    driver.getPageSource().contains("Invalid");
	    driver.close();
	    driver.quit();
	}

}
