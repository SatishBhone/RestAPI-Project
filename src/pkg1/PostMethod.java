package pkg1;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import file.BodyPaylode;
public class PostMethod {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in";
		
		given().log().all().queryParam("page", "2").header("Content-Type","application/json")
		.body(BodyPaylode.addInfo())
		.when().post("/api/users")
		.then().log().all().assertThat().statusCode(201).body("first_name", equalTo("Satish"))
		.header("Server", "cloudflare");
		
		
		// getMethod--> it is used to get data from user 
		
	String  getresponce =	given().log().all().queryParam("page","2").header("Content-Type","application/json")
		.when().get("/api/users/2") 
		.then().assertThat().log().all().statusCode(200).header("Server", "cloudflare").extract().response().asString();
		
		System.out.println(getresponce);
		
	}

}
