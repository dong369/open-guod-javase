package ch13_jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Statement操作数据库
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/18 时间:14:10
 * @since 1.8
 */
public class SelectStatementMain01 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test", "root", "123456");
        Statement statement = connection.createStatement();
        // 所有的SQL语句的查询之中不允许再出现“SELECT *…”，必须明确的写出要显示字段名称
        ResultSet resultSet = statement.executeQuery(" select uid,name,age from test.user ");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(3));
        }
        statement.close();
        connection.close();
    }
}
