package api_tests;

import apiModules.Company;
import apiModules.Contact;
import apiModules.Instructor;
import apiModules.Student;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class CustomResponse {
    private String firstName;
    private String lastName;
    private Contact contact;
    private List<Instructor> instructors;
    private List<Student> students;
    Company company;
    String responseJson;

    public String getResponseJson() {
        return responseJson;
    }

    public void setResponseJson(String response) {
        this.responseJson = response;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructor(List<Instructor> instructors) {
        this.instructors = instructors;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
