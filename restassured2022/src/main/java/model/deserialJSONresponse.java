package model;

import java.io.IOException;

import io.restassured.RestAssured;

public class deserialJSONresponse {

    private static final String url1 = "https://run.mocky.io/v3/f8d0c78c-d7a3-496c-8245-6df6a5327eb1";
    // private static final String jsonString =
    // "E:/automation/Practice/2022/java_restAssured2022/restassured2022/targetFileForString.json";
    // private static final String RESOURCE_PATH =
    // System.getProperty("user.dir")+"/restAssured2022/targetFileForString.json";

    public static void main(String[] args) throws IOException {

        employeeData obj = RestAssured.get(url1).as(employeeData.class);
        System.out.println(obj.getBookingid());

        Booking bobj = obj.getBooking();
        System.out.println(bobj.getFirstname());

        Bookingdates bkngdates = bobj.getBookingdates();
        System.out.println(bkngdates.getCheckin());

    }

}
