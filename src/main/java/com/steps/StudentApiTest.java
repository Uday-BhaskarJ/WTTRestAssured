package com.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class StudentApiTest {
    @Given(": perform GET operation for {string}")
    public void performGETOperationFor(String url) {
        given().contentType(ContentType.JSON);
    }

    @And(": perform GET for id = {int}")
    public void performGETForId(int id) {
       /* when().get(String.format("http://localhost:3000/Student/%s",id)).
                then().body("name",is("Shruti Goyal"));*/
        BDDStyleMethod.simpleGetPostMethod(id);
    }

    @Then(": Should see the student name as {string}")
    public void shouldSeeTheStudentNameAs(String name) {
    }

    @Given(": perform GET operation for all the student {string}")
    public void performGETOperationForAllTheStudent(String arg0) {
    }
    @Then(": Should see the all student name")
    public void shouldSeeTheAllStudentName() {
        BDDStyleMethod.performContainCollection();
    }

    @Then(": Should get status code {string}")
    public void shouldGetStatusCode(String statusCode) {
        given().contentType(ContentType.JSON).
                when().get(String.format("http://localhost:3000/Student/")).
                then().body("name",containsInAnyOrder("Shruti Goyal","Shantanu Sharma","Manmohan Singh")).
                statusCode(Integer.parseInt(statusCode));
    }
}
