package for_training;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GOT {
    @BeforeClass
    public static void setUp(){
        RestAssured.baseURI =  "http://api.got.show/api";

    }
    @Test
    public void getSityName(){
     given().pathParam("name" ,"King's Landing").
             when().
             get("/cities/{name}").prettyPrint();

    }
    @Test
    public void getName(){
       given().pathParam("name", "Jon").
               when().get("/characters/{name}").
               prettyPrint();

    }
    @Test
    public void getById(){
        given().pathParam("id", "56ffc5bf04324408193858aa").
                when().get("/characters/byId/{id}").
                prettyPrint();

    }
}
