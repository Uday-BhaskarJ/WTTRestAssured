package com.method;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

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
                then().
                         statusCode(200);
    }
    public static void performPathParameter()
    {
        given().
                contentType(ContentType.JSON).
        with().
                pathParam("post",1).
        when().
                get("http://localhost:3000/Student/{post}").
        then().
                body("name",containsString("Shruti Goyal"));
    }
    public static void performQueryParam()
    {
        given().
                contentType(ContentType.JSON).
        with().
               queryParam("id", 1).
        when().
                get("http://localhost:3000/Student/").
        then().
                body("name",hasItem("Shruti Goyal"));
    }
    public static void performPostPojoClass()
    {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setId(6);
        studentInfo.setName("shweta Goyal");
        studentInfo.setAddress("Agra");
        studentInfo.setPhone_No("7417787658");

        Response response = given().contentType(ContentType.JSON).body(studentInfo).
                post("http://localhost:3000/Student");
        response.prettyPrint();

    }
    public static void performDeleteOperationForOneStudent()
    {
        Response response = given().
                contentType(ContentType.JSON).
                when().
                delete("http://localhost:3000/Student/6");
    }
}
