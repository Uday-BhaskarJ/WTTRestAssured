package utiles;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RestAssuredExtension {

    public static RequestSpecification requestSpecification;
    public RestAssuredExtension()
    {
        RequestSpecBuilder requestSpecBuilder= new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("http://localhost:3000");
        requestSpecBuilder.setContentType(ContentType.JSON);
        var requestSpec = requestSpecBuilder.build();
        requestSpecification = RestAssured.given().spec(requestSpec);
    }
}
