package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import  io.restassured.matcher.ResponseAwareMatcher;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class GetUser {
	
	@Test
	public void GetRequestSingleUser() {
	
	
		Response res=RestAssured.get("https://reqres.in/api/users/2");
		System.out.println("response body    " + res.asString());
		System.out.println("status code   " + res.getStatusCode());
		System.out.println("status line    " + res.getStatusLine());
		System.out.println("response body   " + res.getBody().asString());
		System.out.println("header   " + res.getHeader("content-type"));
		
		int statusCode=res.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}

	
	@Test
	public void test1() {
		
		RestAssured.given()
		   .get("https://reqres.in/api/users?page=2")
		   .then()
		   .statusCode(200)
		   .body("data.id[0]",equalTo(7));
	
	}


	
	
		

	

}
