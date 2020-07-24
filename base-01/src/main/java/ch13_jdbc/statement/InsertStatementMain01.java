package ch13_jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Statement操作数据库
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class InsertStatementMain01 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test", "root", "123456");
        Statement statement = connection.createStatement();
        int len = statement.executeUpdate("insert  into test.user(name,age) values ('郭冬冬',36)");
        System.out.println("更新数目：" + len);
        statement.close();
        connection.close();
    }
}
