package ch01_time;

import java.sql.*;

/**
 * @author guodd
 * @version 3.0
 */
public class GetDateMain {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "passw0rd");
        Statement sta = con.createStatement();
        ResultSet resultSet = sta.executeQuery("select * from test.boy");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("hid"));
        }
    }
}
