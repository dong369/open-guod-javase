package cn.hacz.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class HbaseTest {
    private Connection connection;

    @Before
    public void before() throws IOException {
        // 创建配置对象
        Configuration configuration = HBaseConfiguration.create();
        configuration.set("hbase.zookeeper.property.clientPort", "2181");
        configuration.set("hbase.zookeeper.quorum", "s11,s12");
        // 获取连接对象
        connection = ConnectionFactory.createConnection(configuration);
    }

    @Test
    public void create() throws Exception {
        // 通过连接获取表信息
        Table t1 = connection.getTable(TableName.valueOf("t1"));
        // 设置row no
        Put put = new Put(Bytes.toBytes("row1"));
        // 设置字段
        put.addColumn(Bytes.toBytes("f1"), Bytes.toBytes("NAME"), Bytes.toBytes("45"));
        t1.put(put);
        connection.close();
    }
}
