package for_training;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AccesTocens {
    @BeforeClass
    public static void setUp(){
        RestAssured.baseURI ="https://cybertek-reservation-api-qa.herokuapp.com/";

    }
    @Test
    public void getTockens(){
        given().log().all().
                param("email","teacherva5@gmail.com").
                param("password", "maxpayne").
                get("sign").
                then().log().all().assertThat().statusCode(200);

    }
    @Test
    public void useTockens() {

    }

}
