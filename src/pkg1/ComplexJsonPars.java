package pkg1;

import static org.testng.Assert.assertEquals;

import file.BodyPaylode;
import io.restassured.path.json.JsonPath;

public class ComplexJsonPars {

	public static void main(String[] args) {
		
               JsonPath js = new JsonPath(BodyPaylode.courcePrize());
               
              // Number of courses return by api
              int count = js.getInt("courses.size()");
              
              System.out.println(count);
              
             // Print Purchase Amount
              
             int purchessAmount = js.getInt("dashboard.purchaseAmount");
             System.out.println(purchessAmount);
            
             // Print Title of the first course
              String titleOf1stCource =  js.get("courses[0].title");
              System.out.println(titleOf1stCource);
               
            // Print price of the first course
               int priceOf1stCource =  js.get("courses[0].price");
               System.out.println("price of the first course: "+priceOf1stCource);
               
            // Print Title of the Second course
               String titleOf2ndCource =  js.get("courses[1].title");
               System.out.println(titleOf2ndCource);
                
             // Print price of the Second course
                int priceOf2ndCource =  js.get("courses[1].price");
                System.out.println("price of the Second course: "+priceOf2ndCource);
                
             // Print Title of the Third course
                String titleOf3rdCource = js.get("courses[2].title");
                System.out.println(titleOf1stCource);
                 
              // Print price of the Third course
                
                 int priceOf3rdCource =  js.get("courses[2].price");
                 System.out.println("price of the Third course: "+priceOf3rdCource);
               
              // Print no of copies sold by RPA Cours e
                 
             int copies = js.get("courses[2].copies");
             System.out.println("copies sold by RPA Course: "+ copies);
             
             // soft code --> dynamically 
             for(int i=0; i<count; i++) 
             {
            	String courceTitle = js.get("courses["+i+"].title");
            	System.out.println(courceTitle);
                System.out.println(js.getInt("courses["+i+"].price"));	
             
             }
           System.out.println("Number of copy sold by ");  
           
           for(int i=0; i<count; i++) 
           { 
        	 String  courceT =  js.get("courses["+i+"].title");
        	 if(courceT.equalsIgnoreCase("cypress")) 
        	 {
        		int copy = js.get("courses["+i+"].copies");
        		System.out.println(courceT +" :"+copy);
        		break;
        	 }
        	  
           }
           int PurchesAmt = js.get("dashboard.purchaseAmount");
             
           //  Verify if Sum of all Course prices matches with Purchase Amount
             
             int sumOfallcources = priceOf1stCource + priceOf2ndCource + priceOf3rdCource;
             
            if(purchessAmount == sumOfallcources) 
            {
            	System.out.println("purchessAmount is equal to sum Of all cources");
            }
            else 
            {
            	System.out.println("Not Equal");
            }
              int sum =0;
             for(int i=0; i<count; i++) 
             {
            	int Prices = js.get("courses["+i+"].price");
            	int Cpoies = js.get("courses["+i+"].copies");
            	int Amount = Prices * Cpoies;
                 sum = sum + Amount;  
             }
             
             if(PurchesAmt == sum) 
             {
            	System.out.println("purchessAmount is equal to sum Of all cources"); 
             }
             else 
             {
            	 System.out.println("purchessAmount is NOt equal to sum Of all cources");
             }
	}

}
