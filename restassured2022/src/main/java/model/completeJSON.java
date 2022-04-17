package model;

import com.github.javafaker.Faker;

public class completeJSON {

    public static Booking getData() {

       // employeeData edata = new employeeData();
        Booking bkngdata = new Booking();
        Bookingdates bkngdatesdata = new Bookingdates();
        Faker fakerdata = new Faker();
        bkngdata.setFirstname(fakerdata.name().firstName());
        bkngdata.setLastname(fakerdata.name().lastName());
        bkngdata.setTotalprice(fakerdata.number().randomDigit());
        bkngdata.setDepositpaid(true);
        //edata.setBooking(bkngdata);
        bkngdatesdata.setCheckin("2018-01-01");
        bkngdatesdata.setCheckout("2018-01-01");
        bkngdata.setBookingdates(bkngdatesdata);
        bkngdata.setAdditionalneeds("breakfast");
        return bkngdata;

    }

}
