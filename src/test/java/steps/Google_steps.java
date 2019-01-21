package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
//import pages.GooglePage;
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



}
