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

		System.out.println("List of prices in Rs."+ allPricesList);
		System.out.println("Total dresses with Discounted price"+allPricesList.size());
		System.out.println("Lowest Price"+Collections.min(allPricesList));

	}
	public static void getNameOfLowestPriceProduct() {
		//all names only finded not the lowest price found
		List<WebElement> allProductsName = driver.findElements(By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']//ancestor::div[@class='product-productMetaInfo']//h3"));
		for (WebElement allNames : allProductsName) {
			String text = allNames.getText();
			allNamesList.add(text);

		}
		System.out.println(allNamesList);

	}
	public static void subtitleBrandName(String xpath) {
		WebElement subtitle = driver.findElement(By.xpath(xpath));
		System.out.println(subtitle.getText());
	}
	public static void subtitleAndPrice() {
		List<WebElement> findElements = driver.findElements(By.xpath("//*[@class='product-product' or @span='product-discountedPrice']"));
		for (WebElement subPrice : findElements) {
			System.out.println(subPrice.getText());

		}

	}
	public static void main(String[] args) {   
		browserlaunch();
		getLowestPrice();
		getNameOfLowestPriceProduct();
		subtitleBrandName("//h4[text()='Boys Printed Bio Finish T-shirt']//preceding-sibling::h3");
        subtitleAndPrice();
	}


}




