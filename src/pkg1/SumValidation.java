package pkg1;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import file.BodyPaylode;
import io.restassured.path.json.JsonPath;

  public class SumValidation {

	@Test
	public void Validation() 
	{
		  //  Verify if Sum of all Course prices matches with Purchase Amount
		
		  JsonPath js = new JsonPath(BodyPaylode.courcePrize());
		   int count = js.getInt("courses.size()");
		   int sum = 0;
		  for(int i=0; i<count; i++) 
          {
         	int Prices = js.get("courses["+i+"].price");
         	int Cpoies = js.get("courses["+i+"].copies");
         	int Amount = Prices * Cpoies;
              sum = sum + Amount;  
          }
		  System.out.println(sum);
          int purchessAmount = js.getInt("dashboard.purchaseAmount");
		  
		  Assert.assertEquals(purchessAmount, sum);
	}
 }
