package Restttapii.APII;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetPathParam {
  @Test
  public void Pathparam() {
	  
	  
	  RestAssured.baseURI="https://reference.rightscale.com//optima_front//#//BillConnects//BillConnects_index";  
	  RequestSpecification request =RestAssured.given();
	  
	  Response response=request.get("/api/onboarding/orgs/404/bill_connects");
	  String responsebody=response.getBody().asString();
	  System.out.println(responsebody);
  }
}
