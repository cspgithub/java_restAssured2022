package tests;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseTest {

  RequestSpecification reqspec;

  @BeforeClass
  public void setUpRequest() {

    reqspec = RestAssured
        .given()
        .log()
        .all()
        .baseUri("https://restful-booker.herokuapp.com")
        .basePath("/booking")
        .contentType(ContentType.ANY);

  }
}
