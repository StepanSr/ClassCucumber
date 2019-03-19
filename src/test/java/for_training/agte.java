package for_training;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class agte {
    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "https://uinames.com/api/";
    }
    @Test
    public void testOK(){
        // prep request
        given().
                //sibmit request
                when().get().
                //verify response.
                then().statusCode(200);
    }
    @Test
    public void notFound(){
        given().
                when().get("k").then().statusCode(404);
    }
    @Test
    public void headerTest(){
        given().
                when().get().
                then().log().headers().header("Content-Type", "application/json; charset=utf-8");
    }
    @Test
    public void testBody(){
        given().
                when().get().
                then().assertThat().body("name", notNullValue() );
    }
}