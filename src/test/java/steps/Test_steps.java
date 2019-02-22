package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Test_steps {
    @When("user goes to Google application")
    public void user_goes_to_Google_application() {
        System.out.println("selenium is going to google.com");
    }

    @Then("user searches for apple")
    public void user_searches_for_apple() {
        System.out.println("user searching for a word apple");
    }

    @Then("user should see apple related results")
    public void user_should_see_apple_related_results() {
        System.out.println("user see apple related results");
        //Assert.fail("fail and poh");

    }

}
