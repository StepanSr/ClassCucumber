package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.APIRunner;
import utilities.Driver;


public class Hooks {
    @Before
    public void setUp(Scenario scenario) {
        System.out.println("this is run before each scenario");

    }
   // TODO: REMEMBER
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()&&Driver.getDriverReference()!=null) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            Driver.closeDriver();
        }
        if(scenario.isFailed()&& APIRunner.getCR()!=null){

            scenario.write(APIRunner.getResponse().getResponseJson());
        }


    }
}
