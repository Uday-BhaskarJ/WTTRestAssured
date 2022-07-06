package com.method;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

public class BDDStyleMethod {
    public static void simpleGetPostMethod(int id)
    {
        given().contentType(ContentType.JSON).
                when().get(String.format("http://localhost:3000/Student/%s",id)).
                then().body("name",is("Shruti Goyal"));
    }
    public static void performContainCollection()
    {
                given().
                        contentType(ContentType.JSON).
                when().
                        get(String.format("http://localhost:3000/Student/")).
                then()
                        .body("name",containsInAnyOrder("Shruti Goyal","Shantanu Sharma","Manmohan Singh")).
                         statusCode(200);
    }
}
