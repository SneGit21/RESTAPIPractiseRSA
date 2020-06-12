package PlacesAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class GetPlace {
 //f7ae34f2713f973ce610bd44aa6efa12
	public static void main(String[] args) {
	RestAssured.baseURI = "https://rahulshettyacademy.com";
	
	given()
	.queryParam("key", "qaclick123")
	.queryParam("place_id", "f7ae34f2713f973ce610bd44aa6efa12")
	.when()
	.post("/maps/api/place/get/json")
	.then()
	.assertThat()
	.statusCode(200)
	.log().all();
}
}