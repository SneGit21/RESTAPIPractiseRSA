package PlacesAPI;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeletePlace {
	
	@Test
	public void deletePlace() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String res =
		given().log().all()
		.queryParam("key", "qaclick123")
		.queryParam("place_id", Payload.getPlaceid())
		.body("{\r\n" + 
				"    \"place_id\":\""+Payload.getPlaceid()+"\" \r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("/maps/api/place/delete/json")
		.then()
		.assertThat()
		.body("status", equalTo("OK"))
		.log().all().extract().response().asString();
		
		System.out.println("RESPONSE from the DELETE Place API ---------->"+res);
	}
}
