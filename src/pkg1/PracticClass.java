package pkg1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import file.BodyPaylode;

public class PracticClass {

	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(BodyPaylode.courcePrize());
		
		//  Print No of courses returned by API
		
		int count= js.getInt("courses.size()"); // size is method of array class
		System.out.println(count);
	
	   //2. Print Purchase Amount
		
		int totalamount =js.getInt("dashboard.purchaseAmount");
		System.out.println(totalamount);
		
		//3. Print Title of the first course
		String title = js.getString("courses[1].title");
		System.out.println(title);
		
		//
		
		
	}

}
