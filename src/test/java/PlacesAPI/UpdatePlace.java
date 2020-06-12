package PlacesAPI;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class UpdatePlace {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		given()
		.queryParam("key", "qaclick123")
		.queryParam("place_id", "f7ae34f2713f973ce610bd44aa6efa12")
		.body("{\r\n" + 
				"\"place_id\":\"f7ae34f2713f973ce610bd44aa6efa12\",\r\n" + 
				"\"address\":\"70 winter walk SNEHAL, USA\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.put("/maps/api/place/update/json")
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();
	}
}
