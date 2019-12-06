package com.jjbeto.echo;

import static io.restassured.RestAssured.given;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class EchoResourceTest {

    @Test
    public void testEmptyEndpoint() {
        given()
                .when().get("/")
                .then()
                .statusCode(200)
                .body(is("Nothing to say =("));
    }

    @Test
    public void testEmptyEndpointWithWait() {
        given()
                .when().get("/?wait=1000")
                .then()
                .time(greaterThanOrEqualTo(1000L), MILLISECONDS)
                .statusCode(200)
                .body(is("Nothing to say =("));
    }

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("hello"));
    }

    @Test
    public void testHelloEndpointWithWait() {
        given()
                .when().get("/hello?wait=1000")
                .then()
                .time(greaterThanOrEqualTo(1000L), MILLISECONDS)
                .statusCode(200)
                .body(is("hello"));
    }

}
