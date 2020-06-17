package PlacesAPI;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class GetPlace {
	
	@Test
	public void getPlace() {
	RestAssured.baseURI = "https://rahulshettyacademy.com";

	String lat = "73.1630494";
	String lng = "19.2179472" ;
	String accuracy = "50" ;
	String name = "Snehal M";
	String phoneNumber = "234123112";
	String address = "Test@123 AZDNGR, USA, 123456";;
	
	String res = 
	given().log().all()
	.queryParam("key", "qaclick123")
	.queryParam("place_id",Payload.getPlaceid())
	.when()
	.post("/maps/api/place/get/json")
	.then()
	.assertThat()
	.statusCode(200)
	.and()
	.body("name", equalTo(name))
	.and()
	.body("address", equalTo(address))
	.log().all().extract().response().asString();
	
	System.out.println("RESPONSE from the GET Place API ---------->"+res);
}
}