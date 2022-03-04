package tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class testExample {
	
	@Test
	public void test1() {
	
	Response res = get("https://reqres.in/api/users?page=2");
	System.out.println("response body    " + res.asString());
	

}
	
	
	@Test
	public void test2() {
		baseURI = "https://reqres.in/api";
		given()
		  .get("users?page=2")
		.then()
		   .statusCode(200)
		   .body("data.id[6]",equalTo(7)) 
		   .log().all();
	}
}