package ch09_jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * PreparedStatement操作数据库
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/18 时间:14:10
 * @since 1.8
 */
public class InsertPreparedStatement {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test", "root", "123456");
        PreparedStatement preparedStatement = connection.prepareStatement("insert  into test.user(name,age) values ('郭冬冬',36)");
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        preparedStatement.close();
        connection.close();
    }
}
