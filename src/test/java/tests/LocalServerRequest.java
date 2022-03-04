package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class LocalServerRequest {
	@Test
	public void getUsers() {
		
		
	Response res = RestAssured.get("http://localhost:3000/users");
	System.out.println("List of users" + res.asString());
	
	int statusCode = res.getStatusCode();
	
	Assert.assertEquals(statusCode,200);
	
	}
	
	@Test
	public void postUsers() {
		
		
	}

}
