package steps;

import apiModules.Student;
import api_tests.CustomResponse;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.APIRunner;

import java.util.List;

public class SingleStudent_Steps {

    @When("user hits single student API with {string}")
    public void user_hits_single_student_API_with(String uri) {

        APIRunner.runGET(uri);
    }

    @Then("user tests for required attributes")
    public void user_tests_for_required_attributes() {
        CustomResponse cr = APIRunner.getResponse();
        System.out.println(cr.getResponseJson());
        Assert.assertTrue("name missing",cr.getFirstName()!=null);
        Assert.assertTrue("last name missing",cr.getLastName()!=null);
        Assert.assertTrue(cr.getContact().getEmailAddress()!=null);
        Assert.assertTrue(cr.getCompany().getAddress().getCity()!=null);
    }

    @When("user hits all student API with {string}")
    public void user_hits_all_student_API_with(String uri) {
        APIRunner.runGET(uri);
    }

    @Then("user tests for required title not empty and more than {int} Char")
    public void user_tests_for_required_title_not_empty_and_more_than_Char(Integer in) {
        CustomResponse cr = APIRunner.getResponse();
        List<Student> st = cr.getStudents();

       int count = 0;

        for(Student a:st){
            count++;
        Assert.assertTrue(count + a.getCompany().getTitle()+"" ,a.getCompany().getTitle().length()<in);
            count++;
        }

    }
    @Then("email should contain dot and at characters")
    public void email_should_contain_dot_and_at_characters() {
        CustomResponse cr = APIRunner.getResponse();
        List<Student> st = cr.getStudents();
        int count = 0;
        for (Student a : st) {

            Assert.assertTrue(count + "--->" + a.getContact().getEmailAddress(), a.getContact().getEmailAddress().contains(".") && a.getContact().getEmailAddress().contains("@"));
            count++;
        }
    }

    }
