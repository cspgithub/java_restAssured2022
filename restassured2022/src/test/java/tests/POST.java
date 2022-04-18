package tests;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import model.completeJSON;
import model.employeeData;

public class POST extends BaseTest {

  // private static final String jsonMockURL =
  // "https://run.mocky.io/v3/f8d0c78c-d7a3-496c-8245-6df6a5327eb1";
  // private static employeeData obj;

  @Test(enabled = false)
  public void createBooking() throws JsonMappingException, JsonProcessingException {

    ObjectMapper mapper = new ObjectMapper();

    String jsonsObject = mapper.writeValueAsString(RestAssured
        .given() // called from basetest
        // .spec(reqspec)

        .contentType(ContentType.JSON)
        .body(completeJSON.getData())// serialize java object to json

        .when()
        .post().as(employeeData.class));

    System.out.println(jsonsObject);

    // .then()
    /*
     * .log()
     * .all();
     */

    // validate response
    // .then();

  }

  @Test(priority = 2)
  public void createAndVerifyBooking() throws JsonMappingException, JsonProcessingException {

    ObjectMapper mapper = null;
    final String path = System.getProperty("user.dir") + "/src/test/java/resources/booking.json";
    employeeData jsonsObject = RestAssured
        .given() // called from basetest
        // .spec(reqspec)

        .contentType(ContentType.JSON)
        .body(completeJSON.getData())// serialize java object to json

        .when()
        .post().as(employeeData.class);

    // write object to file

    try {
      mapper = new ObjectMapper();

      mapper.writeValue(new File(path), jsonsObject);

    } catch (Exception e) {
      e.printStackTrace();
    }

    // read value from jsonfile-mapped with POJO
    try {
      employeeData empdata = mapper.readValue(new File(path), employeeData.class);
      System.out.println(empdata.getBookingid());
      System.out.println(empdata.getBooking().getFirstname());
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
