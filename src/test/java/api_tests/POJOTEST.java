package api_tests;

import apiModules.Instructor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

public class POJOTEST {
   @Test
           public void pr() throws IOException {
       Instructor in1 = new Instructor();
       Instructor in3 = new Instructor();


       in1.setBatch(10);
       in1.setFirstName("Vova");
       in1.setLastName("Krasava");
       in1.setId(8);
       in1.setSubject("Soccer");


       ObjectMapper mapper = new ObjectMapper();
       String json = mapper.writeValueAsString(in1);//serialization
       System.out.println(json);

       Instructor instr2=  mapper.readValue(json,Instructor.class);//deserialization
       System.out.println(instr2.getFirstName());






   }
}
