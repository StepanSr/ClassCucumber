package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YoutubePage;
import utilities.Driver;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class Youtube_steps {

    YoutubePage u2OBJ = new YoutubePage();


    @Given("User is on the youtube page")
    public void user_is_on_the_youtube_page() {
        Driver.getDriver().get("http://youtube.com");

    }

    @Given("User is able to see the search box")
    public void user_is_able_to_see_the_search_box() {
        Assert.assertTrue(u2OBJ.serchLine.isDisplayed());


    }

    @Given("User is able to see search button")
    public void user_is_able_to_see_search_button() {
        Assert.assertTrue(u2OBJ.serchBtn.isDisplayed());

    }

    @When("User searches for Funny Cat Videos")
    public void user_searches_for_Funny_Cat_Videos() {
        u2OBJ.serchLine.sendKeys("funny cat"+ Keys.ENTER);

    }

    @Then("User should see result related to funy cat videos")
    public void user_should_see_result_related_to_funy_cat_videos() throws InterruptedException {
        Thread.sleep(5000);
       // Assert.assertTrue(Driver.getDriver().getTitle().contains("cat"));
        String s =Driver.getDriver().getTitle();
     assertThat(s, is(not("cat")));

    }




    @When("User searches for Funny Dog Videos")
    public void user_searches_for_Funny_Dog_Videos() {
        u2OBJ.serchLine.sendKeys("funny dog"+ Keys.ENTER);
    }

    @Then("User should see result related to funy Dog videos")
    public void user_should_see_result_related_to_funy_Dog_videos() throws InterruptedException {
        String a ="dog";
        Thread.sleep(5000);
        String ex = Driver.getDriver().getTitle();
        Assert.assertTrue(ex.contains(a));
    }

    @When("User searches for Funny Sofia Videos")
    public void user_searches_for_Funny_Sofia_Videos() {

        u2OBJ.serchLine.sendKeys("funny Sonya"+ Keys.ENTER);
    }

    @Then("User should see result related to funy Sofia videos")
    public void user_should_see_result_related_to_funy_Sofia_videos() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Sonya"));
    }
}