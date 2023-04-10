package pkg1;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class GetMethod {

	public static void main(String[] args) 
	{
		RestAssured.baseURI ="https://reqres.in";
		
		// given --> all the input details
		
		given().log().all().queryParam("page", "2").header("Content-Type","application/json")
		.when().get("/api/users")
		.then().log().all().assertThat().statusCode(200).header("Server", "cloudflare");

		
	}

}
