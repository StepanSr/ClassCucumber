package api_tests;

import apiModules.Instructor;
import apiModules.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import utilities.APIRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PostAPI {
    public PostAPI() throws IOException {
    }

    @Test
    public void postInstructor() {
        Instructor instructor = new Instructor();
        instructor.setFirstName("don");
        instructor.setLastName("huan");

        Response response = RestAssured.given().contentType
                (ContentType.JSON).
                body(instructor).
                when().
                post("http://cybertekchicago.com/instructor/create");
        System.out.println(response.statusCode());
    }

    @Test
    public void customSingleStudent() throws IOException {
        Response response = RestAssured.get("http://cybertekchicago.com/student/87");
        ObjectMapper mapper = new ObjectMapper();
        CustomResponse cr = mapper
                .readValue(response.asString(),
                        CustomResponse.class);
        System.out.println(cr.getFirstName());
        System.out.println(cr.getContact().getEmailAddress());

    }

    @Test
    public void listInstructor() throws IOException {


    Response response = RestAssured.get("http://cybertekchicago.com/instructor/all");
    ObjectMapper mapper = new ObjectMapper();
    CustomResponse cr = mapper.readValue(response.asString(), CustomResponse.class);
        System.out.println(cr.getInstructors().get(0). getSubject());
        int i = 1;
        for(Instructor instructor:cr.getInstructors()){
        if(instructor.getSubject()==null){
            //Vector<String>po = new Vector<>();
            System.out.println(i++ + " "+instructor.getFirstName()+instructor.getLastName());
        }
    }


}
@Test
    public void studentLocation() throws IOException {
        Response response = RestAssured.get("http://cybertekchicago.com/student/all");
        ObjectMapper mapper = new ObjectMapper();
        CustomResponse cr = mapper.readValue(response.asString(), CustomResponse.class );
    System.out.println();
    List<Student> chicagoStudent = new ArrayList<>();
        for(Student st : cr.getStudents()){
            if(st.getCompany().getAddress().getCity().equalsIgnoreCase("Chicago")){
                chicagoStudent.add(st);
            }
        }
    System.out.println(chicagoStudent.size());

}
@Test
    public void utilTest(){
    APIRunner.runGET("http://cybertekchicago.com/student/88");
    String compLocation = APIRunner.getResponse().getCompany().getAddress().getCity();
    System.out.println(compLocation);

}
@Test
    public void studentsB7(){
    APIRunner.runGET("http://cybertekchicago.com/student/all");
    List<Student> stlist = APIRunner.getResponse().getStudents();
    List<Student> st7 = new ArrayList<>();
    for(Student st : stlist) {
        if (st.getBatch() == 7) {
            st7.add(st);
        }
        if(st.getCompany().getCompanyName().equalsIgnoreCase("spaceX")){
            System.out.println(st.getFirstName());
        }
    }
        System.out.println(st7.size());

    for(Student s : st7){
        System.out.print(stlist.indexOf(s)+" ");

    }




}
}
