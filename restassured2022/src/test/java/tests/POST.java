package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import model.Booking;
import model.Bookingdates;
import model.completeJSON;
import model.employeeData;

public class POST extends BaseTest {

  private static final String jsonMockURL = "https://run.mocky.io/v3/f8d0c78c-d7a3-496c-8245-6df6a5327eb1";
    @Test
    public void createBooking() {
        String response =RestAssured
                .given() // caaled from basetest
                // .spec(reqspec)

                .contentType(ContentType.JSON)
              .body(completeJSON.getData())//serialize java object to json

                .when()
                .post()

                // validate response
                .then().extract().toString();
                /* .log()
                .all(); */

                System.out.println(response);

    }
    @Test
    public void verifyBooking() {
        
      //TO-DO :instead of jsonMOCKURL we can pass created response saved in json file
      employeeData obj = RestAssured.get(jsonMockURL).as(employeeData.class);
      System.out.println(obj.getBookingid());

      Booking bobj = obj.getBooking();
      System.out.println(bobj.getFirstname());

      Bookingdates bkngdates = bobj.getBookingdates();
      System.out.println(bkngdates.getCheckin());

    }

}
