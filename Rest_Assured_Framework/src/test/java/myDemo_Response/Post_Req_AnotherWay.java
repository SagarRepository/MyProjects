package myDemo_Response;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Post_Req_AnotherWay {

	@Test
	public void postAuto() {
		RestAssured.baseURI = "https://reqres.in/api/users";

		String json = "{\r\n" + "    \"name\": \"TWJ Automation\",\r\n" + "    \"job\": \"Test Analyst\"\r\n" + "}";

		RestAssured.given().body(json).post().then().log().all().assertThat().statusCode(201);
	}
}
