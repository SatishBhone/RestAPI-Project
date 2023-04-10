package file;

public class BodyPaylode {
	
	public static String addPlace() 
	{
		return " {\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Rohada house\",\r\n"
				+ "  \"phone_number\": \"(+91) 7030378457\",\r\n"
				+ "  \"address\": \"At. Po. Rohada Ta. Pudad Dist. Yavatmal\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}";
	}
	
	public static String addInfo() 
	{
		return "{\r\n"
				+ "    \"id\": 7,\r\n"
				+ "    \"email\": \"Satishbhone@gmail.com\",\r\n"
				+ "    \"first_name\": \"Satish\",\r\n"
				+ "    \"last_name\": \"Bhone\",\r\n"
				+ "    \"avatar\": \"https://reqres.in/img/faces/7-image.jpg\",\r\n"
				+ "    \"createdAt\": \"2023-01-25T11:52:50.360Z\"\r\n"
				+ "}";
	}
       public static String courcePrize() 
       {
		return "{\r\n"
				+ "\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"courses\": [\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\r\n"
				+ "\"price\": 50,\r\n"
				+ "\r\n"
				+ "\"copies\": 6\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\r\n"
				+ "\"price\": 40,\r\n"
				+ "\r\n"
				+ "\"copies\": 4\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\r\n"
				+ "\"price\": 45,\r\n"
				+ "\r\n"
				+ "\"copies\": 10\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "]\r\n"
				+ "\r\n"
				+ "}";
		
       
       }
       
       public static String Addbooks(String isbn, String aisle) 
       {
    	   String bookPaylode = "{\r\n"
    	   		+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
    	   		+ "\"isbn\":\""+isbn+"\",\r\n"
    	   		+ "\"aisle\":\""+aisle+"\",\r\n"
    	   		+ "\"author\":\"John foe\"\r\n"
    	   		+ "}";
    	   
    	   return bookPaylode;
       }
}
















