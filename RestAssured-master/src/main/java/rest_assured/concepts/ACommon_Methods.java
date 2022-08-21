package rest_assured.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ACommon_Methods {


	//@Test
	public void getMethod() {

		RestAssured.baseURI="https://api.github.com";

		String bearerToken="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";
		Response response= (Response) RestAssured.given()
				.header("Authentication", "Bearer Token" + bearerToken)
				.when().get("/users/arju8/repos")
				.then().log().all()
				.extract()
				.response();

		int statusCode = response.statusCode();

		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.time());

		org.testng.Assert.assertEquals(statusCode, 200);
	}


	@Test
	public void postMethod() {

		RestAssured.baseURI="https://api.github.com/user/repos";

		String bearerToken="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";
		Response response= (Response) RestAssured.given()
				.header("Authentication", " Token" + bearerToken)
				.body("{\r\n"
						+ "    \"name\":\"NEWREPO8\"\r\n"
						+ "}")
				.when().post("/user/repos")
				.then().log().all()
				.extract()
				.response();

		int statusCode = response.statusCode();

		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.time());

		Assert.assertEquals(statusCode, 201);


	}

}
