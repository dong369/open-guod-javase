package ch01_time;

import java.sql.*;

/**
 * project - 
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/16 时间:7:18
 * @JDK 1.8
 * @Description 功能模块：
 */
public class GetDateMain {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
        Statement sta = con.createStatement();
        ResultSet resultSet = sta.executeQuery("select * from boy");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("hid"));
        }
    }
}
