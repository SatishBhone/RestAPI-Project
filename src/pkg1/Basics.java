package pkg1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;  // import by writing it
import static org.hamcrest.Matchers.*;    // import manually 

import org.testng.Assert;

import file.BodyPaylode;

public class Basics {

	public static void main(String[] args) 
	{
		// Validate if add place API work as Expected. 
		// Validate response body is as Expected.
		
		//given --> all input details
		//when --> Submit the API   Resource, and http method
		//then --> Validate the response
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		// Post Method add the place 
		String responce = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body(BodyPaylode.addPlace())
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200)
		.body("scope", equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
		
		System.out.println(responce);
		
		  
		//by using  Put method Update Place
		JsonPath js = new JsonPath(responce);  // for parsing json
		
		String placeId = js.get("place_id");  // store the string place id 
		
		// Put method 
		   String newAddress = "Pune Amravti Pune";
		  given().log().all().queryParam("key","qackick123").headers("Content-Type","application/json")
		  .body("{\r\n"
		  		+ "\"place_id\":\""+placeId+"\",\r\n"
		  		+ "\"address\":\""+newAddress+"\",\r\n"
		  		+ "\"key\":\"qaclick123\"\r\n"
		  		+ "}").when().put("maps/api/place/update/json")
		  .then().assertThat().log().all().statusCode(200).body("msg",equalTo( "Address successfully updated"));
		
		//  Get Method get Place 
		  
		String getPlaceResponce =  given().queryParam("key","qaclick123").queryParam("place_id",placeId).header("Content-Type","appliction/json")
		  .when().get("maps/api/place/get/json") 
		  .then().assertThat().statusCode(200).extract().response().asString();
		
		   JsonPath js1 =  file.ReUsableMethods.rawToJson(getPlaceResponce);
	      String actualaddress =  js1.getString("address"); 
	      
	      System.out.println(actualaddress);
	      Assert.assertEquals(actualaddress, "Pune Amravti Pune");
	      
	      
	}

}
