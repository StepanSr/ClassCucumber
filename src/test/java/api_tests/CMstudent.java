package api_tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CMstudent {
    @Test
    public void stList(){
        Response response = RestAssured.get("http://cybertekchicago.com/instructor/all");
        System.out.println(response.statusCode());
        Assert.assertEquals(response.statusCode(), 200);
        System.out.println(response.asString());

    }
    @Test
    public void student (){
        Response response = RestAssured.get("http://cybertekchicago.com/student/2");
        System.out.println(response.statusCode());
        System.out.println(response.asString());

        JsonPath jp = response.jsonPath();
        System.out.println(jp.toString());

        System.out.println(jp.get("batch"));

        System.out.println(jp.get("company.address.street"));



    }
    @Test
    public void allInstr(){
        Response response = RestAssured.get("http://cybertekchicago.com/instructor/all");
        System.out.println(response.statusCode());
        JsonPath jp = response.jsonPath();
        List<String> subj = jp.get("subject");
        System.out.println(subj);



    }
}
