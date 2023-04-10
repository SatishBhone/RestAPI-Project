package pkg3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class GetRequest {
	
	@Test
	public static void GetBookdetails() 
	{
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		
		String responce = given().header("Content-Type","application/json").when()
		.get().then().log().all().statusCode(200).extract().response().asString();
		
		
	}

}
