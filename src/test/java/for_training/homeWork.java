package for_training;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class homeWork {
    @BeforeClass
    public static void setUp(){
        RestAssured.baseURI = "https://api.github.com";

    }
    @Test
    public void getSingleUser(){
        given().pathParam("username","StepanSr").
                when().get("/users/{username}").prettyPrint();
    }
    @Test
    public void listUsersRepo(){
        given().pathParam("username","StepanSr").queryParam("sort","pushed").
                when().get("/users/{username}/repos").prettyPrint();
    }
}
