package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.BTNPage;
import utilities.Driver;

public class BTN {
    BTNPage btnp = new BTNPage();

    @Given("go to {string}")
    public void go_to(String ur) {
        Driver.getDriver().get(ur);
    }

    @Given("verify title {string}")
    public void verify_title(String title) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle +" IS TITLE ",actualTitle.contains(title));
    }

    @Then("verify that Football is selected by default")
    public void werify_that_Football_is_selected_by_default() {
        System.out.println(btnp.sportList.size());
        for(WebElement el : btnp.sportList) {
           // System.out.println(el.getAttribute("id"));
            if(el.getAttribute("id").contains("Football")) {
                Assert.assertTrue(el.getAttribute("id"),el.isSelected());
                System.out.println(el.getAttribute("id")+" yes selected <______");
            }
        }
    }

    @Then("all others are not selected")
    public void all_others_are_not_selected() {
        for (WebElement el : btnp.sportList){
            Assert.assertTrue("fignya",!el.isSelected()|| (el.getAttribute("id").contains("Football")));

        }
    }

    @Then("Select a random sport")
    public void select_a_random_sport() {
        btnp.sportList.get(9).click();
        Assert.assertTrue(btnp.sportList.get(9).isSelected());


        }

    @Then("verify that all other options are not selected")
    public void verify_that_all_other_options_are_not_selected() {
        for (WebElement el : btnp.sportList) {
            Assert.assertTrue("fignya", !el.isSelected() || (btnp.sportList.get(9).isSelected()));
        }
    }

    @Given("open browser go to {string}")
    public void open_browser_go_to(String ur) {
        Driver.getDriver().get(ur);
    }

    @Then("Randomly select days of the week.")
    public void randomly_select_days_of_the_week() throws InterruptedException {
        int i = 0;

       for(WebElement el : btnp.days){
           if(el.isEnabled()){
               el.click();
               System.out.println(btnp.daysLabel.get(i++).getText());
               el.click();
           }
       }
       for(int z = 0; z<btnp.daysLabel.size()-1;z++){
           WebElement e = btnp.daysLabel.get(z);
           WebElement e1= btnp.daysLabel.get(z+1);
          // Assert.assertTrue(e.getText()+ " ---- "+e1.getText(),e.getText().compareToIgnoreCase(e1.getText())<1);

       }

    }

    @Then("print the name of the day and uncheck immediately.")
    public void print_the_name_of_the_day_and_uncheck_immediately() {
        for(WebElement el :  btnp.days)
        Assert.assertFalse(el.isSelected());

    }








}
