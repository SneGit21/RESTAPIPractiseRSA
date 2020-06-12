package PlacesAPI;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class DeletePlace {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		given()
		.queryParam("key", "qaclick123")
		.queryParam("place_id", "f7ae34f2713f973ce610bd44aa6efa12")
		.body("{\r\n" + 
				"    \"place_id\":\"928b51f64aed18713b0d164d9be8d67f\" \r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("/maps/api/place/delete/json")
		.then()
		//.assertThat()
		//.statusCode(200)
		.log().all();
	}
}
