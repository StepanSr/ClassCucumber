package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
//import pages.GooglePage;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class Google_steps {

    GooglePage ggobj = new GooglePage();




    @Given("User is on the google homepage")
    public void user_is_on_the_google_homepage() {
        Driver.getDriver().get("http://google.com");

    }

    @Given("user enters flovers")
    public void user_enters_flovers() {
        ggobj.searchBox.sendKeys("flowers");
    }

    @Given("user click search button")
    public void user_click_search_button() {
        ggobj.searchButton.click();


    }

    @Then("user should see result related to flower")
    public void user_should_see_result_related_to_flower() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("Keyword flover not in the title",actualTitle.contains("flower"));

    }
  ////-----//////----///

    @Given("User is on the homepage of google")
    public void user_is_on_the_homepage_of_google() {

        Driver.getDriver().get("https://google.com");

    }

    @When("User enters {string}")
    public void user_enters(String string) {

        ggobj.searchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String string) {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = string + " - Google Search";

        Assert.assertEquals("Titles are not matching", expectedTitle, actualTitle);


    }


}
