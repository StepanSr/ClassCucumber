package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WikiPage;
import utilities.Driver;

public class Wiki_steps extends WikiPage {

   // WikiPage wikiobj = new WikiPage();


    @Given("User is on the wicipedia homepage")
    public void user_is_on_the_wicipedia_homepage() {
        Driver.getDriver().get("https://www.wikipedia.org/");

    }

    @When("user enter Stive Jobs to search bar and click enter")
    public void user_enter_Stive_Jobs_to_search_bar_and_click_enter() {
        WikiPage.searchBox.sendKeys("Steve Jobs"+ Keys.ENTER);
    }

    @Then("User sould see the first header is displaing steve jobs")
    public void user_sould_see_the_first_header_is_displaing_steve_jobs() {
        String acctualText = WikiPage.header.getText();
        Assert.assertTrue(acctualText.equalsIgnoreCase("Steve Jobs"));
    }

}
