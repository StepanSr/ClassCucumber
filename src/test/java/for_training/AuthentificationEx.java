package for_training;

import io.restassured.RestAssured;
import org.junit.Test;

public class AuthentificationEx {
    @Test
    public void usingApiKey(){
        RestAssured.given().
                queryParam("t", "Kung fury").
                queryParam("apikey","d04211bb").
                when().get("http://www.omdbapi.com").
                then().assertThat().statusCode(200);
    }
    @Test
    public void adminAdmin(){
        RestAssured.given().auth().basic("admin","admin").

                when().get("https://the-internet.herokuapp.com/basic_auth").
                then().statusCode(200);
    }
}
