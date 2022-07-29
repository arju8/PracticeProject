package com.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browserlaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\git\\GreensProject\\MavenProject\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			//firefox browser
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\welcome\\git\\GreensProject\\MavenProject\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("invalid browser");
		}

		driver.manage().window().maximize();
		return driver;
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void  sendKey(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void takeScreenShot(String fileName) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\RS\\eclipse-workspace\\MavenProject\\ScreenShot\\"+fileName+".png");
		FileUtils.copyFile(source, dest);
		System.out.println("successfull");
	}
	public static void clickElement(WebElement element) {
		element.click();
	}
	public static void dropD(WebElement element,String methodType,String value) {
		Select s= new Select(element);
		if(methodType.equalsIgnoreCase("value1")) {
			s.selectByValue(value);
		}
		else if (methodType.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);

		}else if(methodType.equalsIgnoreCase("index")) {
			int index=Integer.parseInt(value);
			s.selectByIndex(index);

		}

	}
	public static void windowH(String expectedTitle) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if(driver.switchTo().window(string).getTitle().equalsIgnoreCase(expectedTitle)) {
				System.out.println(expectedTitle);
			}
		}
	}

	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void navigateTo(String url1) {
		driver.navigate().to(url1);
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void navigateForward() {
		driver.navigate().forward();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void alert(String alertname,WebElement element,String keys) {
		element.click();
		if(alertname.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}
		else if(alertname.equalsIgnoreCase("dismiss")){
			driver.switchTo().alert().dismiss();
		}
		else if(alertname.equalsIgnoreCase("keys")) {
			driver.switchTo().alert().sendKeys(keys);
		}
		else if(alertname.equalsIgnoreCase("text")) {
			driver.switchTo().alert().getText();
		}


	}
	public static void Actions(String method,WebElement element) {
		Actions act= new Actions(driver);
		if(method.equalsIgnoreCase("click")) {
			act.click(element).build().perform();
		}
		else if(method.equalsIgnoreCase("rightClick")) {
			act.contextClick(element).build().perform();
		}
		else if(method.equalsIgnoreCase("doubleClick")) {
			act.doubleClick(element).build().perform();
		}


	}
	public static void dragDrop(String type, WebElement source,WebElement target) {
		Actions act1=new Actions(driver);
		if(type.equalsIgnoreCase("DragAndDrop")) {
			act1.dragAndDrop(source, target).build().perform();
		}
		else if(type.equalsIgnoreCase("clickandhold")) {
			act1.clickAndHold(source).moveToElement(target).build().perform();
		}
	}
	public static void frames(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}
	public static void roboPress(int keycode) throws AWTException {
		Robot robo=new Robot();
		robo.keyPress(keycode);

	}
	public static void roboRelease(int args) throws AWTException {
		Robot robo=new Robot();
		robo.keyRelease(args);
	}
	public static void isEnabled(WebElement element) {
		element.isEnabled();
	}
	public static void isSelected(WebElement element) {
		element.isSelected();
	}
	public static void isDisplayed(WebElement element) {
		element.isDisplayed();
	}
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void explicitwait(WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void jsExecutor(String script) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(script);


	}
	public static void attribute(WebElement element,String name) {
		System.out.println(element.getAttribute(name));//check this
	}
}