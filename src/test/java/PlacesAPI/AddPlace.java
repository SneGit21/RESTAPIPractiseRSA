package PlacesAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;


public class AddPlace {
	
	@Test
	public void addPlace() {
		
		String lat = "73.1630494";
		String lng = "19.2179472" ;
		String accuracy = "50" ;
		String name = "Snehal M";
		String phoneNumber = "234123112";
		String address = "Test@123 AZDNGR, USA, 123456";
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		System.out.println(Payload.addPlace(lat, lng, accuracy, name, phoneNumber, address));
		
		String res = 
		given().queryParams("key","qaclick123").log().all()
		.body(Payload.addPlace(lat, lng, accuracy, name, phoneNumber, address))
		.when()
		.post("/maps/api/place/add/json")
		.then()
		.assertThat()
		.statusCode(200)
		.and()
		.body("status", equalTo("OK"))
		.log().all().extract().response().asString();
		
		System.out.println("RESPONSE from the ADD Place API ---------->"+res);
		
		String placeid = ReusableMethods.rawToJson(res).get("place_id");
		System.out.println("Place ID = "+placeid);
		
		//Setting placeid
		Payload p = new Payload();
		p.setPlaceid(placeid);
		
		System.out.println("Getting palce_id :"+Payload.getPlaceid());
		
	}
}
