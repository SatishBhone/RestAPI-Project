package file;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJson {

	@Test(dataProvider="BooksData")
	public void AddBook(String isbn, String aisle) 
	{
		RestAssured.baseURI="http://216.10.245.166";
		
		String responce = given().log().all().header("Content-Type","application/json")
	    .body(BodyPaylode.Addbooks(isbn,aisle)).when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = ReUsableMethods.rawToJson(responce);
		
		String id = js.get("ID");
		System.out.println(id);
		
		// Delete Book Api in real time used
	
	
	}
	
	@DataProvider(name="BooksData")
	public Object [][] getData() 
	{
		// array it is collection of Elements
		// Multiple Dimensional array--> Collection of array
	return	new Object [][] {{"dsft","9934"},{"podags","8139"},{"oeodw","309043"},{"dsojd","39543"}};
		
	}

}
