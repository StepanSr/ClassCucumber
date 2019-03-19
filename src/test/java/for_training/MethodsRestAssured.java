package for_training;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class MethodsRestAssured {
    @Test
    public void logginTest(){
        //log provides login options
        //LOG REQUEST
       given(). log().all().
               when().get("https://uinames.com/api/");

       //LOG RESPONSE
        Response response = RestAssured.get("https://uinames.com/api/");
        response.then().log().all();

    }
}
