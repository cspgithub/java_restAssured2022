package tests;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class BaseTest {

  // RequestSpecification reqspec;

  @BeforeTest
  public void setUpRequest() {

    RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    RestAssured.basePath = "/booking";
    RestAssured.requestSpecification = RestAssured.given().log().all();
    RestAssured.responseSpecification = RestAssured.expect().statusCode(200).statusLine("HTTP/1.1 200 OK");

    /*
     * reqspec = RestAssured
     * .given()
     * .log()
     * .all()
     * .baseUri("https://restful-booker.herokuapp.com")
     * .basePath("/booking")
     * .contentType(ContentType.JSON);
     */

  }
}
