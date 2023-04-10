package pkg3;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateStatusCode {
	
	@Test
	public static void StatusCodeValidation() 
	{
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		
		// Get the RequestSpecification of the request to be sent to the
		RequestSpecification httpRequest = RestAssured.given();
		
		Response responce = httpRequest.get("");
		
		// Get the status code of the request. 
	      //If request is successful, status code will be 200
		
	      int statuscode  = responce.getStatusCode();
	      int ExpectedStatuscode = 200;
	
	     //Validation 
	       Assert.assertEquals(statuscode, ExpectedStatuscode);
	
	       System.out.println("Test is Pass");
		
		
		
	}

}
