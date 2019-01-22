package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.DatatablePage;
import utilities.Driver;

public class Datatable_steps {
    Faker fk = new Faker();
    String lastName = fk.name().lastName();

    DatatablePage dttblOBJ = new DatatablePage();

    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @Given("User clicks to New Button")
    public void user_clicks_to_New_Button() throws InterruptedException {
        Thread.sleep(3000);

        dttblOBJ.newBTN.click();
    }

    @Then("User should see Create New Entry Box")
    public void user_should_see_Create_New_Entry_Box() throws InterruptedException {
        //String a = "";
        Thread.sleep(3000);
        Assert.assertTrue(dttblOBJ.tbl.isDisplayed());
    }

    @Then("User should enter firstname")
    public void user_should_enter_firstname() {

        dttblOBJ.firstName.sendKeys(fk.name().firstName());
    }

    @Then("User should enter lastname")
    public void user_should_enter_lastname() {
        dttblOBJ.lastName.sendKeys(lastName);
    }

    @Then("User should enter position")
    public void user_should_enter_position() {
        dttblOBJ.position.sendKeys(fk.job().position());
    }

    @Then("User should enter office")
    public void user_should_enter_office() {
        dttblOBJ.office.sendKeys(fk.company().name());

    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {
        dttblOBJ.extention.sendKeys("654");


    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {
        dttblOBJ.startDate.sendKeys("2019-08-08");

    }

    @Then("User should enter salary")
    public void user_should_enter_salary() {
        dttblOBJ.salary.sendKeys("6548");
    }

    @Then("User should click to create button")
    public void user_should_click_to_create_button() {
        dttblOBJ.createBTN.click();
    }

    @Then("User enters first name to search box")
    public void user_enters_first_name_to_search_box() {
        dttblOBJ.searchfild.sendKeys(lastName + Keys.ENTER);

    }

    @Then("User should see first name is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table() {
        String expected = lastName;
        String actual = dttblOBJ.firstResult.getText();

        Assert.assertTrue("Name was not found!", actual.contains(expected));

    }


    @Then("User should enter firstname {string}")
    public void user_should_enter_firstname(String firstName) {
        dttblOBJ.firstName.sendKeys(firstName);
    }

    @Then("User should enter lastname {string}")
    public void user_should_enter_lastname(String lastN) {
        dttblOBJ.lastName.sendKeys(lastN);
    }


    @Then("User should enter position {string}")
    public void user_should_enter_position(String position) {
        dttblOBJ.position.sendKeys(position);
    }

    @Then("User should enter office {string}")
    public void user_should_enter_office(String office) {
        dttblOBJ.office.sendKeys(office);
    }

    @Then("User should enter extension {string}")
    public void user_should_enter_extension(String extension) {
        dttblOBJ.extention.sendKeys(extension);
    }

    @Then("User should enter start date {string}")
    public void user_should_enter_start_date(String date) {
        dttblOBJ.startDate.sendKeys(date);
    }

    @Then("User should enter salary {string}")
    public void user_should_enter_salary(String salary) {
        dttblOBJ.salary.sendKeys(salary);
    }


    @Then("User enters first name {string} to search box")
    public void user_enters_first_name_to_search_box(String firstName) {
        dttblOBJ.searchfild.sendKeys(firstName + Keys.ENTER);

    }


    @Then("User should see first name is inserted in the table {string}")
    public void user_should_see_first_name_is_inserted_in_the_table(String firstName) {
        String expected = firstName;
        String actual = dttblOBJ.firstResult.getText();
        Assert.assertTrue(false);
        Assert.assertTrue("Name was not found!", actual.contains(expected));

    }

}
