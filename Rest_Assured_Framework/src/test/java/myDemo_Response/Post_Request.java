package myDemo_Response;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Post_Request {
	
	@Test
	public void postAutomate()
	{
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		// create new id 
		RestAssured.given().body("{\r\n"
				+ "    \"name\": \"TWJ Automation\",\r\n"
				+ "    \"job\": \"Test Analyst\"\r\n"
				+ "}").post().then().log().all().assertThat().statusCode(201);
		
		
	}

}
