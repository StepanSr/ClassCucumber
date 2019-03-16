package for_training;

import io.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestDemo {
    //library provide matches (assertion)
    //RestAssured use hamcrest assertions works with junit and testng
    @Test
    public void test(){
        //RestAssured.baseURI =;
        assertThat(1, equalTo(1));
        String str1="Max";
        String str2 = "Maxx";
        assertThat(str1, is("Maxx"));
        assertThat(str1, is("Max"));




    }
}
