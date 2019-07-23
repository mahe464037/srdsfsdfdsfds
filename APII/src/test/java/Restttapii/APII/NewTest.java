package Restttapii.APII;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NewTest {
  @Test
  public void Rest() {
	  
	  RestAssured.baseURI="https://reqres.in/";
	  
	  RequestSpecification httpRequest= RestAssured.given();
	  
	  
	  Response response = httpRequest.request(Method.GET, "/api/users?page=2");
	  
	  
	  String responsebody= response.getBody().asString();
	  System.out.println("Response body is ="+ responsebody);
	  
	  
	  
	  
  }
}
