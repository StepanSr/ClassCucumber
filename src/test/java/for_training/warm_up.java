package for_training;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class warm_up {

   // Response response = RestAssured
@BeforeClass
    public static void setUp(){
    RestAssured.baseURI= "http://api.got.show/api";

}
@Test
    public void continentsTest(){
    Response response = RestAssured.get("/continents");
    Assert.assertEquals(200,response.getStatusCode());
    System.out.println(response.statusCode());
    Assert.assertTrue(response.asString().contains("Westeros"));


}
}
