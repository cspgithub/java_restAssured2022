package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import model.getData;

public class POST extends BaseTest {

    @Test
    public void PostPayload() {
        RestAssured
                .given()
                .spec(reqspec)
                .body(getData.getEmployeeData())
                .post();

    }

}
