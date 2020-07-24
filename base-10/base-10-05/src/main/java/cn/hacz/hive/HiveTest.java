package cn.hacz.hive;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class HiveTest {
    @Test
    public void connectionHive() throws Exception {
        Class.forName("org.apache.hive.jdbc.HiveDriver");
        Connection connection = DriverManager.getConnection("jdbc:hive2://211.144.5.80:30286/default", "root", "passw0rd");
        PreparedStatement preparedStatement = connection.prepareStatement("select  * from inp_visit_record_hive limit 10");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("hospital") + "=>" + resultSet.getString("id"));
        }
    }
}