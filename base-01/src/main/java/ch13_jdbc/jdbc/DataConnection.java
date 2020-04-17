package ch13_jdbc.jdbc;

import java.sql.*;

public class DataConnection {
    private static final String USER = "root";
    private static final String PASSWORD = "passw0rd";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql:///test";
    private Connection conn = null;

    /**
     * 功能：构造器主要目的是进行数据库连接
     */
    public DataConnection() {
        try {
            // 第一步：加载数据库驱动程序
            Class.forName(DRIVER);
            // 第二步：通过DriverManager类根据指定的属性内容连接数据库
            this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能：取得一个数据库连接对象，这个对象在构造方法中取得
     *
     * @return Connection接口对象
     */
    public Connection getConnection() {
        return this.conn;
    }

    public void close() {
        // 第四步：判断是否取得了连接，关闭数据库连接。
        if (this.conn != null) {
            try {
                this.conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        DataConnection dataBaseConnection = new DataConnection();
        Connection connection = dataBaseConnection.getConnection();
        // 第三步：进行数据表的CRUD操作，执行SQL
        // 增加的SQL语法：INSERT INTO 表名称 (字段,字段,..) VALUES (值,值,…)；
        // 修改的SQL语法：UPDATE 表名称 SET 字段=值,字段=值,.. [WHERE 更新条件(s)]；
        // 删除的SQL语法：DELETE FROM 表名称 WHERE 删除条件 ;
        Statement statement = connection.createStatement();
        ResultSet resultSet01 = statement.executeQuery(" select * from user ");
        while (resultSet01.next()) {
            System.out.println(resultSet01.getInt("uid"));
        }
        PreparedStatement preparedStatement = connection.prepareStatement(" select * from user ");
        ResultSet resultSet02 = preparedStatement.executeQuery();
        while (resultSet02.next()) {
            System.out.println(resultSet02.getInt("uid"));
        }
    }
}
