package com.ipt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class Myntra extends BaseClass {
	static List<Integer> allPricesList=new ArrayList<Integer>();
	static List<String> allNamesList=new ArrayList<String>();
	static Integer lp;

	public static void browserlaunch() {
		browserlaunch("chrome");
		url("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");

	}

	public static void getLowestPrice() {
		List<WebElement> alldiscPriceList = driver.findElements(By.xpath("//li[@class=\"product-base\"]//descendant::span[@class=\"product-discountedPrice\"]"));

		for (WebElement discPrice : alldiscPriceList) {
			String replace = discPrice.getText().replace("Rs. ", "");
			Integer price = Integer.valueOf(replace);
			allPricesList.add(price);
		}
		 lp = Collections.min(allPricesList);
		System.out.println("List of prices in Rs."+ allPricesList);
		System.out.println("Total dresses with Discounted price"+allPricesList.size());
		System.out.println("Lowest Price"+lp);

	}
	public static void getNameOfProduct() {
		List<WebElement> allProductsName = driver.findElements(By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']//ancestor::div[@class='product-productMetaInfo']//h3"));
		for (WebElement allNames : allProductsName) {
			String text = allNames.getText();
			allNamesList.add(text);

		}
		System.out.println(allNamesList);

	}
	public static void getNameOfLowestPriceOfProduct(Integer lp) {
      WebElement LowestProductNAme = driver.findElement(By.xpath("//*[text()='"+lp+"']//ancestor::div[@class='product-productMetaInfo']/h3"));
      System.out.println("lowestProduct name:"+LowestProductNAme.getText());
	
}
	
	public static void subtitleBrandName(String xpath) {
		WebElement subtitle = driver.findElement(By.xpath(xpath));
		System.out.println(subtitle.getText());
	}
	public static void subtitle() {
		List<WebElement> findElements = driver.findElements(By.xpath("//*[@class='product-product' or @span='product-discountedPrice']"));
		for (WebElement subPrice : findElements) {
			System.out.println(subPrice.getText());

		}

	}
	public static void main(String[] args) {   
		browserlaunch();
		getLowestPrice();
		getNameOfProduct();
		subtitleBrandName("//h4[text()='Boys Printed Bio Finish T-shirt']//preceding-sibling::h3");
        subtitle();
        getNameOfLowestPriceOfProduct(lp);
	}


}




