package Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
    *
    *
    |   employee_id | first_name | last_name  | salary |
    |           100 | Steven     | King       | 24000  |
    |           101 | Neen       | Kochhar    | 17000  |
    |           102 | Lex        | De Haan    | 17000  |
    *
    * */

public class JDBCExample {
    public static void main(String[] args) throws SQLException {
        //System.out.println(manualTable());
        //System.out.println(dbTable().size());
        //dbTable();
        String dbURL = "jdbc:oracle:thin:@ec2-18-221-139-83.us-east-2.compute.amazonaws.com:1521:xe";
        Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@ec2-18-221-139-83.us-east-2.compute.amazonaws.com:1521:xe","hr","hr");
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet resultSet = statement.executeQuery("select FIRST_NAME,LAST_NAME,EMPLOYEE_ID from employees");
resultSet.next();
        System.out.println("sho za fignya");
        System.out.println(resultSet.getObject("FIRST_NAME"));
        resultSet.close();

        statement.close();
        connection.close();

    }

    public static List<Map<String, Object>> manualTable (){
        List<Map<String,Object>> table = new ArrayList<>();
        Map<String,Object> map1 = new HashMap<>();
        map1.put("employee_id", 100);
        map1.put("first_name","Steven");
        map1.put("last_name", "King");
        map1.put("salary", 24000);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("employee_id", 101);
        map2.put("first_name", "Neen");
        map2.put("last_name", "Kochhar");
        map2.put("salary", 17000);


        Map<String, Object> map3 = new HashMap<>();
        map3.put("employee_id", 102);
        map3.put("first_name", "Lex");
        map3.put("last_name", "De Haan");
        map3.put("salary", 17000);

        table.add(map1);
        table.add(map2);
        table.add(map3);

        return table;
    }
    //
    //        FROM ORACLE SQL DEVELOPER
    //
    //
//    public static void dbTable () throws SQLException {
//    //public static List<Map<String, Object>> dbTable () throws SQLException {
//        String dbURL = "jdbc:oracle:thin:@ec2-18-221-139-83.us-east-2.compute.amazonaws.com:1521:xe";
//        Connection connection =DriverManager.getConnection(dbURL,"hr","hr");
//        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//        ResultSet resultSet = statement.executeQuery("select employee_id,first_name, last_name from employees");
//
//        System.out.println(resultSet.getObject("FIRST_NAME"));
//        connection.close();
//        statement.close();
//        resultSet.close();
////return nul
//    }
}
