package PlacesAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdatePlace {
	
	@Test
	public void updatePlace() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String res = 
		given().log().all()
		.queryParam("key", "qaclick123")
		.queryParam("place_id", Payload.getPlaceid())
		.body("{\r\n" + 
				"\"place_id\":\""+Payload.getPlaceid()+"\",\r\n" + 
				"\"address\":\"70 winter walk SNEHAL, USA\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.put("/maps/api/place/update/json")
		.then()
		.assertThat()
		.statusCode(200)
		.and()
		.body("msg", equalTo("Address successfully updated"))
		.log().all().extract().response().asString();
		
		
		System.out.println("RESPONSE from the UPDATE Place API ---------->"+res);
	}
}
