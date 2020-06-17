package PlacesAPI;

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

	
}
