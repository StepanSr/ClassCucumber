package for_training;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class postRequest {
    String accessToken;
    @BeforeClass
    public static void setUp(){
        RestAssured.baseURI = "https://cybertek-reservation-api-qa.herokuapp.com";


    }

    public String createTocken(){
        Response response = given().log().all().
                param("email","teacherva5@gmail.com").
                param("password","maxpayne").
                get("/sign");
        response.then().log().all().
                assertThat().statusCode(200);

        accessToken = response.jsonPath().get("accessToken");
        return accessToken;

    }
    @Test
    public void postRequest(){
        String tckn = createTocken();
        //make post request
        RestAssured.given().
                header("Authorization",tckn).
                queryParam("campus-location","VA").
                queryParam("batch-number", "8").
                queryParam("team-name","ZH").
                post("/api/teams/team").then().log().all().statusCode(201).
        body(containsString("added"));

    }
}
