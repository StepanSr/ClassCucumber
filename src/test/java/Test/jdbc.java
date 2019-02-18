//package Test;
//
//
//
//import org.testng.annotations.Test;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class jdbc {
//    String dbURL = "jdbc:oracle:thin:@ec2-18-221-139-83.us-east-2.compute.amazonaws.com.1521:xe";
//    String dd = "jdbc:oracle:thin:@ec2-18-221-139-83.us-east-2.compute.amazonaws.com:1521:xe";
//    String dbUserName = "hr";
//    String dbPasword = "hr";
//
//    @Test
//    public void oracleJDBC() throws SQLException {
//        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@ec2-18-221-139-83.us-east-2.compute.amazonaws.com:1521:xe", "hr", "hr");
//        // Statement statement=connection.createStatement();
//        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//        ResultSet resultSet = statement.executeQuery("select*from countries");
////     while(resultSet.next()) {
////         System.out.println(resultSet.getString("country_name"));
////         System.out.println(resultSet.getString(1));
////     }
////        resultSet.next();
////        System.out.println(resultSet.getRow());
////
////        resultSet.previous();
////        System.out.println(resultSet.getRow());
////
////        resultSet.last();
////        System.out.println(resultSet.getRow());
//        resultSet.last();
//        int rowNums = resultSet.getRow();
//        System.out.println(rowNums + "<----rows muns");
//
//
//        resultSet.close();
//        statement.close();
//        connection.close();
//    }
//
//    @Test
//    public void metadata() throws SQLException {
//        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@ec2-18-221-139-83.us-east-2.compute.amazonaws.com:1521:xe", "hr", "hr");
//        // Statement statement=connection.createStatement();
//
//        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//        String sql = "select * from employees";
//        ResultSet resultSet = statement.executeQuery(sql);
//
//        DatabaseMetaData dbMetadata = connection.getMetaData();
//        System.out.println("User : "+ dbMetadata.getUserName());
//        System.out.println("Database type ___>: "+ dbMetadata.getDatabaseProductName());
////
//
//        // resultSet Metadata
//
//        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
//        int coumnNum = resultSetMetaData.getColumnCount();
//        System.out.println(coumnNum);
//        int a = 0;
//        while (a<coumnNum){
//            a++;
//            System.out.println(resultSetMetaData.getColumnName(a)+ "line 69");
//        }
//
//        //throw resultSet into a list of maps
//        List<Map<String,Object>> listData = new ArrayList<>();
//        ResultSetMetaData resultMD = resultSet.getMetaData();
//int columnCount = resultMD.getColumnCount();
//while (resultSet.next()){
//    Map<String,Object> rowMap = new HashMap<>();
//    for(int col = 1;col<=columnCount;col++){
//        rowMap.put(resultMD.getColumnName(col),resultSet.getObject(col));
//    }
//
//listData.add(rowMap);
//}
//for( Map<String,Object> aa : listData){
//    System.out.println(aa.get("EMPLOYEE_ID"));
//}
//       System.out.println(listData.get(1).toString());
//
//
//
//        resultSet.close();
//        statement.close();
//        connection.close();
//    }
//
//}
