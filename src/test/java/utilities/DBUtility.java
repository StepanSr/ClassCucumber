package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtility {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    private static int rowsCount;
    private static int columnNum;

    public static void establishConnection(DBType dbType) throws SQLException {
        switch (dbType) {
            case ORACLE:
                connection = DriverManager.getConnection(Config.getProperty("oracleURL")
                        , Config.getProperty("oracledb.user"), Config.getProperty("oracledb.password"));
                break;
            case MYSQL:
                break;

        }

    }


    public static List<Map<String, Object>> runSQLQuery(String sql) throws SQLException {
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultSet = statement.executeQuery(sql);
        List<Map<String, Object>> listData = new ArrayList<>();
        ResultSetMetaData resultMD = resultSet.getMetaData();
        int columnCount = resultMD.getColumnCount();
        while (resultSet.next()) {
            Map<String, Object> rowMap = new HashMap<>();
            for (int col = 1; col <= columnCount; col++) {
                rowMap.put(resultMD.getColumnName(col), resultSet.getObject(col));
            }

            listData.add(rowMap);
        }
        return listData;
    }

    public enum DBType {
        ORACLE, MYSQL, MARIADB
    }
    public static void closeConnections(){
       try {
           if (resultSet != null) {
               resultSet.close();
           }
           if (statement != null) {
               statement.close();
           }
           if (connection != null) {
               statement.close();
           }
       }catch(Exception e){
           e.printStackTrace();

       }
    }
    public static int getRowsCount(String sql) throws SQLException {
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultSet = statement.executeQuery(sql);
        resultSet.last();
        rowsCount = resultSet.getRow();
        closeConnections();
        return rowsCount;
    }
    public static int getColumnNum (String sql) throws SQLException {
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultSet = statement.executeQuery(sql);
        ResultSetMetaData resultSetMetaData= resultSet.getMetaData();
        columnNum = resultSetMetaData.getColumnCount();
        closeConnections();
        return columnNum;

    }
}
