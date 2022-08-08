package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class WebTable extends BaseClass {



	public static void browserLaunch() {
		browserlaunch("chrome");

		url("https://www.worldometers.info/coronavirus/");

	}

	public static void allData() {

		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr/td"));
		for (WebElement allD : allData) {
			System.out.println(allD.getText());

		}

	}

	public static void rowData() {

		List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr[7]"));

		for (WebElement rD : rowData) {

			System.out.println(rD.getText());

		}

	}

	public static void coulumnData() {
		List<WebElement> columnData = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr/td[2]"));


		for (WebElement cData : columnData) {
			System.out.println(cData.getText());

		}
	}

	public static void particularData() {
		WebElement indiaPopulation = driver.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr[7]/td[15]"));

		System.out.println( "population of india :"+indiaPopulation.getText());
	}


	public static void main(String[] args) {
		browserLaunch();
		//allData();
		rowData();
		coulumnData();
		particularData();

	}


}
