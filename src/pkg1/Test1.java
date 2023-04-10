package pkg1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test1 {

	public static void main(String[] args) {
		
		
	Response responce = RestAssured.get("https://rahulshettyacademy.com/maps/api/place/add/json?key=qaclick123");
	
	
	 System.out.println(responce.getStatusCode());
	 System.out.println(responce.getBody());
	 System.out.println(responce.contentType());
	 System.out.println(responce.getHeader(""));
	 System.out.println(responce.getTime());
	 
	}

}
