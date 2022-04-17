package model;

public class getData {

    public static employeeData getEmployeeData() {
        employeeData emp = new employeeData();
        emp.setFirstname("chandra");
        emp.setLastname("pandey");
        emp.setTotalprice(789);
        emp.setDepositpaid(true);

        bookingDates bkngdate = new bookingDates();
        bkngdate.setCheckin("2018-01-01");
        bkngdate.setCheckout("2018-01-01");

        emp.setBookingDates(bkngdate);
        emp.setAdditionalneeds("breakfast");
        return emp;

    }

}
