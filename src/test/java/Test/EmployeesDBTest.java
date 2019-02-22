package Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertTrue;
import static utilities.DBUtility.*;
import static utilities.DBUtility.DBType.ORACLE;

public class EmployeesDBTest {
    @BeforeClass
    public void setUp() throws SQLException {
        establishConnection(ORACLE);

    }
    @AfterClass
    public void closeAll(){
        closeConnections();
    }
    @Test
    public void countTest() throws SQLException {

        String sql = "select * from employees where job_id ='IT_PROG'";
        // runSQLQuery(sql);
        System.out.println(getRowsCount(sql));
        assertTrue(getRowsCount(sql) > 0, "Olya, ne byde s tebe testera");
        getRowsCount(sql);
        //closeConnections();


    }

    @Test
    public void nameTestByID() throws SQLException {
        //establishConnection(ORACLE);
        String sql = "select FIRST_NAME||' '|| LAST_NAME from employees where EMPLOYEE_ID =105 ";
        String sql1 = "select FIRST_NAME, LAST_NAME from employees where EMPLOYEE_ID =105";
        List<Map<String, Object>> empData = runSQLQuery(sql1);
        String result = empData.get(0).get("FIRST_NAME").toString() + " " + empData.get(0).get("LAST_NAME").toString();
        System.out.println(result);
       Assert.assertEquals(result,"David Austin");


    }
}
