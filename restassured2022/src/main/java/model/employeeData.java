package model;


public class employeeData {

    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean depositpaid;
    private bookingDates bookingDates;
    private String additionalneeds;

    

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return this.totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean isDepositpaid() {
        return this.depositpaid;
    }

    public Boolean getDepositpaid() {
        return this.depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public bookingDates getBookingDates() {
        return this.bookingDates;
    }

    public void setBookingDates(bookingDates bookingDates) {
        this.bookingDates = bookingDates;
    }

    public String getAdditionalneeds() {
        return this.additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }
    
}
