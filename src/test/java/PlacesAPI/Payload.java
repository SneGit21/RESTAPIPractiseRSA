package PlacesAPI;

import org.json.simple.parser.JSONParser;

public class Payload {
	private static String placeid;
	
	
	public void setPlaceid(String placeid) {
		this.placeid = placeid;
	}

	public static String addPlace(String lat, String lng,String accuracy,String name,String phoneNumber,
			String address)
	{
		String addPlaceBody = "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -"+lat+",\r\n" + 
				"    \"lng\": "+lng+"\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": "+accuracy+",\r\n" + 
				"  \"name\": \""+name+"\",\r\n" + 
				"  \"phone_number\": \"(+91) "+phoneNumber+"\",\r\n" + 
				"  \"address\": \""+address+"\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://google.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				"";
		return addPlaceBody;
	}

	
	public static String getPlaceid() {
		return placeid;
	}
	
	public static String CoursePrice()
	{
		
		return "{\r\n" + 
				"  \"dashboard\": {\r\n" + 
				"    \"purchaseAmount\": 1162,\r\n" + 
				"    \"website\": \"rahulshettyacademy.com\"\r\n" + 
				"  },\r\n" + 
				"  \"courses\": [\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Selenium Python\",\r\n" + 
				"      \"price\": 50,\r\n" + 
				"      \"copies\": 6\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Cypress\",\r\n" + 
				"      \"price\": 40,\r\n" + 
				"      \"copies\": 4\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"RPA\",\r\n" + 
				"      \"price\": 45,\r\n" + 
				"      \"copies\": 10\r\n" + 
				"    },\r\n" + 
				"     {\r\n" + 
				"      \"title\": \"Appium\",\r\n" + 
				"      \"price\": 36,\r\n" + 
				"      \"copies\": 7\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"  ]\r\n" + 
				"}\r\n" + 
				"";
		
}
	
}
