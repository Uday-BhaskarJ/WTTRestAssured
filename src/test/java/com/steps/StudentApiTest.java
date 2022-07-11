package com.steps;

import com.method.BDDStyleMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class StudentApiTest {
    @Given("perform GET operation for {string}")
    public void performGETOperationFor(String url) {
        given().contentType(ContentType.JSON);
    }

    @And("perform GET for id = {int}")
    public void performGETForId(int id) {
        BDDStyleMethod.simpleGetPostMethod(id);
    }

    @Then("Should see the student name as {string}")
    public void shouldSeeTheStudentNameAs(String name) {
                when().get(String.format("http://localhost:3000/Student/1")).
                then().body("name",is(name));
    }

    @Given("perform GET operation for all the student {string}")
    public void performGETOperationForAllTheStudent(String url) {
        given().contentType(ContentType.JSON);
    }
    @Then("Should see the all student name")
    public void shouldSeeTheAllStudentName() {

        BDDStyleMethod.performContainCollection();
    }

    @Then("Should get status code {string}")
    public void shouldGetStatusCode(String statusCode) {
        given().contentType(ContentType.JSON).
                when().get(String.format("http://localhost:3000/Student/")).
                then()/*.body("name",containsInAnyOrder("Shruti Goyal","Shantanu Sharma","Manmohan Singh","Kashish","Aniket"))*/.
                statusCode(Integer.parseInt(statusCode));
    }
    @Then("Should see the Get parameter")
    public void should_see_the_get_parameter() {
        BDDStyleMethod.performPathParameter();
    }


    @Then("Should see the query param")
    public void shouldSeeTheQueryParam() {
        BDDStyleMethod.performQueryParam();
    }

    @Given("perform POST operation for {string}")
    public void performPOSTOperationFor(String url) {
        given().contentType(ContentType.JSON);
    }

    @Then("Should post one student details")
    public void shouldPostOneStudentDetails() {
        BDDStyleMethod.performPostPojoClass();
    }

    @Given("perform delete operation for {string}")
    public void performDeleteOperationFor(String url) {
        given().contentType(ContentType.JSON);
    }

    @Then("Should delete one student details")
    public void shouldDeleteOneStudentDetails() {
        BDDStyleMethod.performDeleteOperationForOneStudent();
    }
}
