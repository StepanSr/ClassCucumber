package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AmazonPage;
import pages.AmazonPage;
import pages.WikiPage;
import utilities.Driver;

public class Amazon_steps {

    AmazonPage amazonOBJ = new AmazonPage();


    @When("user goes to Amazon application")
    public void user_goes_to_Amazon_application() {
        Driver.getDriver().get("http://amazon.com");

    }

    @Then("user should see Amazon title")
    public void user_should_see_title() {
        String title = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(Driver.getDriver().getTitle(), title);
        Driver.closeDriver();


    }

    @Then("user should validate url")
    public void user_should_validate_url() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("amazon.com"));
        Driver.closeDriver();
    }
///     CLASS
    @Given("User is on the amazon page")
    public void user_is_on_the_amazon_page() {
        Driver.getDriver().get("http://amazon.com");

    }

    @When("User enters headphones keyword")
    public void user_enters_headphones_keyword() {
        amazonOBJ.searchBox.sendKeys("headphones");
    }

    @When("user click to search btn")
    public void user_click_to_search_btn() {
        amazonOBJ.searchBTN.click();

    }

    @Then("User should see headphones in result")
    public void user_should_see_headphones_in_result() {
//        String result1 = amazonOBJ.result.getText();
//        System.out.println(result1);
       // Assert.assertTrue("message if fail",result1.contains("headphoneswww"));
        System.out.println(amazonOBJ.a());
    }

}
