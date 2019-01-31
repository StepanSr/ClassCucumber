package Test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
    String dbURL= "jdbc:oracle:thin:@ec2-18-221-139-83.us-east-2.compute.amazonaws.com.1521:xe";
    String dd   = "jdbc:oracle:thin:@ec2-18-221-139-83.us-east-2.compute.amazonaws.com:1521:xe";
    String dbUserName = "hr";
    String dbPasword = "hr";

    @Test
    public void oracleJDBC() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@ec2-18-221-139-83.us-east-2.compute.amazonaws.com.1521:xe",dbUserName,dbPasword);

   connection.close();
    }

}
