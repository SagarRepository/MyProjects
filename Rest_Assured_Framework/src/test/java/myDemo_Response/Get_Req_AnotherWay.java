package myDemo_Response;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Req_AnotherWay {
	@Test
	public void getRes(){
		
       RestAssured.baseURI = "https://reqres.in/api/users";
		
		Response response = RestAssured.given().param("page", "2").when().get();
		
		System.out.println("Get status code:"+response.getStatusCode());
		System.out.println("content type:"+response.contentType());
		System.out.println("Time is:"+ response.getTime());
		System.out.println("cookies:"+ response.getCookies());
		
		// to get look good and printed in json format
		System.out.println(response.prettyPrint());
		
		
		
		
	}
	
		
	

}
