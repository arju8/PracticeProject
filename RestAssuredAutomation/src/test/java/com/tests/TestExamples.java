package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import  static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class TestExamples {

	@Test
	public void restApi() {
		Response response =get("https://reqres.in/api/users?page=2");

		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getContentType());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());

		int statusCode= response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

	}
	@Test
	public void test2() {
		System.out.println("arjunan");
		baseURI="https://reqres.in/api";
		given().
		get("/users?page=2").
		then().
		statusCode(200).
		body("data.id[1]", equalTo(8));

	}

}
