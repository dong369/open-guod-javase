package cn.hacz.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CompareOperator;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.filter.*;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The class/interface
 * 表：关系型数据库中的一张张表
 * 行：一个RowKey和多个列族组成
 * 列组：
 * 单元格：
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class HBaseTest {
    Configuration configuration;
    Connection connection;
    Admin admin;

    @Before
    public void before() throws IOException {
        // 创建配置对象
        configuration = HBaseConfiguration.create();
        configuration.set("hbase.zookeeper.property.clientPort", "2181");
        configuration.set("hbase.zookeeper.quorum", "s11,s12");
        // 获取连接对象
        connection = ConnectionFactory.createConnection(configuration);
        admin = connection.getAdmin();
    }

    @Test
    public void delete() throws Exception {
        for (int i = 1; i <= 5; i++) {
            if (admin.tableExists(TableName.valueOf("test" + i))) {
                //初始化表描述
                admin.disableTable(TableName.valueOf("test" + i));
                admin.deleteTable(TableName.valueOf("test" + i));
            }
        }
    }

    /**
     * 创建只有一个列簇的表
     *
     * @throws Exception
     */
    @Test
    public void create() throws Exception {
        if (!admin.tableExists(TableName.valueOf("test1"))) {
            // 表
            TableDescriptorBuilder tableDescriptor = TableDescriptorBuilder.newBuilder(TableName.valueOf("test1"));
            // 列族
            ColumnFamilyDescriptorBuilder column = ColumnFamilyDescriptorBuilder.newBuilder(Bytes.toBytes("user"));
            // 列
            ColumnFamilyDescriptor cfd = column.build();
            //添加列族
            tableDescriptor.setColumnFamily(cfd);
            // 获得表描述器
            TableDescriptor td = tableDescriptor.build();
            //创建表
            admin.createTable(td);
        } else {
            System.out.println("已经存在");
        }
    }

    @Test
    public void insert() throws Exception {
        // 通过连接获取表信息
        Table t1 = connection.getTable(TableName.valueOf("test1"));
        for (int i = 1; i <= 10; i++) {
            // 设置row no
            Put put = new Put(Bytes.toBytes("row" + i));
            // 设置字段：列组、属性字段、值
            put.addColumn(Bytes.toBytes("user"), Bytes.toBytes("name"), Bytes.toBytes("value" + i));
            put.addColumn(Bytes.toBytes("user"), Bytes.toBytes("age"), Bytes.toBytes("value" + i));
            t1.put(put);
        }
        connection.close();
    }

    /**
     * 创建表（包含多个列簇）
     *
     * @throws Exception
     */
    @Test
    public void createColumns() throws Exception {
        if (!admin.tableExists(TableName.valueOf("test2"))) {
            //表
            TableDescriptorBuilder tdb = TableDescriptorBuilder.newBuilder(TableName.valueOf("test2"));
            //列族
            ColumnFamilyDescriptorBuilder cdb;
            //列
            ColumnFamilyDescriptor cfd;
            String[] columns = {"author", "name", "age"};
            for (String columnFamily : columns) {
                cdb = ColumnFamilyDescriptorBuilder.newBuilder(Bytes.toBytes(columnFamily));
                cfd = cdb.build();
                // 添加列族
                tdb.setColumnFamily(cfd);
            }
            //获得表描述器
            TableDescriptor td = tdb.build();
            //创建表
            admin.createTable(td);
        }
    }

    /**
     * 添加数据（多个rowKey，多个列簇，适合由固定结构的数据）
     */
    @Test
    public void insertList() throws Exception {
        List<Map<String, Object>> listMap = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("rowKey", "rowKey");
        map1.put("columnFamily", "author");
        map1.put("columnName", "author");
        map1.put("columnValue", "Java");
        listMap.add(map1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("rowKey", "rowKey");
        map2.put("columnFamily", "name");
        map2.put("columnName", "name");
        map2.put("columnValue", "66");
        listMap.add(map2);

        Map<String, Object> map3 = new HashMap<>();
        map3.put("rowKey", "rowKey");
        map3.put("columnFamily", "age");
        map3.put("columnName", "age");
        map3.put("columnValue", "66");
        listMap.add(map3);

        List<Put> puts = new ArrayList<>();
        Table table = connection.getTable(TableName.valueOf("test2"));
        if (listMap.size() > 0) {
            for (Map<String, Object> map : listMap) {
                Put put = new Put(Bytes.toBytes("rowKey"));
                put.addColumn(
                        Bytes.toBytes(map.get("columnFamily").toString()),
                        Bytes.toBytes(map.get("columnName").toString()),
                        Bytes.toBytes(map.get("columnValue").toString())
                );
                puts.add(put);
            }
        }
        table.put(puts);
        table.close();
    }

    /**
     * 添加数据（多个rowKey，多个列簇）
     *
     * @throws Exception
     */
    @Test
    public void insertMany() throws Exception {
        Table table = connection.getTable(TableName.valueOf("test1"));
        List<Put> puts = new ArrayList<>();
        Put put1 = new Put(Bytes.toBytes("rowKey1"));
        put1.addColumn(Bytes.toBytes("user"), Bytes.toBytes("name"), Bytes.toBytes("wd"));

        Put put2 = new Put(Bytes.toBytes("rowKey2"));
        put2.addColumn(Bytes.toBytes("user"), Bytes.toBytes("age"), Bytes.toBytes("25"));

        Put put3 = new Put(Bytes.toBytes("rowKey3"));
        put3.addColumn(Bytes.toBytes("user"), Bytes.toBytes("weight"), Bytes.toBytes("60kg"));

        Put put4 = new Put(Bytes.toBytes("rowKey4"));
        put4.addColumn(Bytes.toBytes("user"), Bytes.toBytes("sex"), Bytes.toBytes("男"));
        puts.add(put1);
        puts.add(put2);
        puts.add(put3);
        puts.add(put4);
        table.put(puts);
        table.close();
    }

    /**
     * 添加数据（一个rowKey,一个列簇）
     *
     * @throws IOException
     */
    @Test
    public void insertSingle() throws IOException {
        Table table = connection.getTable(TableName.valueOf("test1"));

        Put put1 = new Put(Bytes.toBytes("rowKey5"));

        put1.addColumn(Bytes.toBytes("user"), Bytes.toBytes("name"), Bytes.toBytes("cm"));
        put1.addColumn(Bytes.toBytes("user"), Bytes.toBytes("age"), Bytes.toBytes("22"));
        put1.addColumn(Bytes.toBytes("user"), Bytes.toBytes("weight"), Bytes.toBytes("88kg"));
        put1.addColumn(Bytes.toBytes("user"), Bytes.toBytes("sex"), Bytes.toBytes("男"));

        table.put(put1);
        table.close();
    }

    /**
     * 根据RowKey，列簇，列名修改值
     *
     * @throws IOException
     */
    @Test
    public void updateData() throws IOException {
        Table table = connection.getTable(TableName.valueOf("test1"));
        Put put = new Put(Bytes.toBytes("rowKey1"));
        // 列族、列、值
        put.addColumn(Bytes.toBytes("user"), Bytes.toBytes("name"), Bytes.toBytes("columnValue"));
        table.put(put);
        table.close();
    }

    /**
     * 根据rowKey删除一行数据
     *
     * @throws IOException
     */
    @Test
    public void deleteData() throws IOException {
        Table table = connection.getTable(TableName.valueOf("test1"));
        Delete delete = new Delete(Bytes.toBytes("rowKey1"));
        table.delete(delete);
        table.close();
    }

    /**
     * 删除某一行的某一个列簇内容
     *
     * @throws IOException
     */
    @Test
    public void deleteDataFamily() throws IOException {
        Table table = connection.getTable(TableName.valueOf("test1"));
        Delete delete = new Delete(Bytes.toBytes("rowKey5"));
        // 对应的组名称
        delete.addFamily(Bytes.toBytes("user"));
        table.delete(delete);
        table.close();
    }

    /**
     * 删除某一行某个列簇某列的值
     */
    @Test
    public void deleteColumn() throws Exception {
        Table table = connection.getTable(TableName.valueOf("test1"));
        Delete delete = new Delete(Bytes.toBytes("rowKey4"));
        delete.addColumn(Bytes.toBytes("user"), Bytes.toBytes("sex"));
        table.delete(delete);
        table.close();
    }

    /**
     * 删除某一行某个列簇多个列的值
     */
    @Test
    public void deleteDataColumns() throws IOException {
        Table table = connection.getTable(TableName.valueOf("test1"));
        Delete delete = new Delete(Bytes.toBytes("rowKey1"));
        String[] columnNames = {"name", "age"};
        for (String columnName : columnNames) {
            delete.addColumns(Bytes.toBytes("user"), Bytes.toBytes(columnName));
        }
        table.delete(delete);
        table.close();
    }

    /**
     * 根据rowKey查询数据
     */
    @Test
    public void getResult() throws Exception {
        Table table = connection.getTable(TableName.valueOf("test1"));
        // 获得一行
        Get get = new Get(Bytes.toBytes("rowKey2"));
        Result set = table.get(get);
        Cell[] cells = set.rawCells();
        for (Cell cell : cells) {
            System.out.println(
                    Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell.getQualifierLength()) + "=>" +
                    Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength())
            );
        }
        table.close();
    }

    /**
     * 查询表数据
     *
     * @throws Exception
     */
    @Test
    public void scanTable() throws Exception {
        Table table = connection.getTable(TableName.valueOf("test1"));
        Scan scan = new Scan();
        ResultScanner scanner = table.getScanner(scan);
        for (Result re : scanner) {
            System.out.println(Bytes.toString(re.getRow()));
            Cell[] cells = re.rawCells();
            for (Cell cell : cells) {
                System.out.println(
                        Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell.getQualifierLength()) + "=>" +
                        Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength())
                );
            }
        }
    }

    /**
     * 过滤列族
     */
    @Test
    public void rowKeyFilter() throws Exception {
        Table table = connection.getTable(TableName.valueOf("test1"));
        Scan scan = new Scan();
        // str$ 末尾匹配，相当于sql中的 %str  ^str开头匹配，相当于sql中的str%
        RowFilter filter = new RowFilter(CompareOperator.EQUAL, new RegexStringComparator("^rowKey2"));
        ResultScanner scanner = table.getScanner(scan);
        scan.setFilter(filter);
        for (Result re : scanner) {
            Cell[] cells = re.rawCells();
            for (Cell cell : cells) {
                System.out.println(
                        Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell.getQualifierLength()) + "=>" +
                        Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength())
                );
            }
        }
    }

    /**
     * 列值过滤器
     *
     * @throws Exception
     */
    @Test
    public void ColumnFilter() throws Exception {
        Table table = connection.getTable(TableName.valueOf("test1"));
        Scan scan = new Scan();
        //下列参数分别为，列族，列名，比较符号，值
        SingleColumnValueFilter filter = new SingleColumnValueFilter(
                Bytes.toBytes("author"),
                Bytes.toBytes("name"),
                CompareOperator.EQUAL,
                Bytes.toBytes("spark"));
        scan.setFilter(filter);
        ResultScanner scanner = table.getScanner(scan);
        for (Result rs : scanner) {
            String rowkey = Bytes.toString(rs.getRow());
            System.out.println("row key :" + rowkey);
            Cell[] cells = rs.rawCells();
            for (Cell cell : cells) {
                System.out.println(Bytes.toString(cell.getFamilyArray(), cell.getFamilyOffset(), cell.getFamilyLength()) + "::" + Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell.getQualifierLength()) + "::" +
                                   Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength()));
            }
            System.out.println("-----------------------------------------");
        }
    }

    /**
     * 列名前缀过滤器
     *
     * @throws IOException
     */
    @Test
    public void columnPrefixFilter() throws IOException {
        Table table = connection.getTable(TableName.valueOf("test1"));
        Scan scan = new Scan();
        ColumnPrefixFilter filter = new ColumnPrefixFilter(Bytes.toBytes("age"));
        scan.setFilter(filter);
        ResultScanner scanner = table.getScanner(scan);
        for (Result rs : scanner) {
            String rowkey = Bytes.toString(rs.getRow());
            System.out.println("row key :" + rowkey);
            Cell[] cells = rs.rawCells();
            for (Cell cell : cells) {
                System.out.println(Bytes.toString(cell.getFamilyArray(), cell.getFamilyOffset(), cell.getFamilyLength()) + "::" + Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell.getQualifierLength()) + "::" +
                                   Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength()));
            }
            System.out.println("-----------------------------------------");
        }
    }

    /**
     * 过滤器集合
     *
     * @throws IOException
     */
    @Test
    public void filterSet() throws IOException {
        Table table = connection.getTable(TableName.valueOf("test1"));
        Scan scan = new Scan();
        FilterList list = new FilterList(FilterList.Operator.MUST_PASS_ALL);
        SingleColumnValueFilter filter1 = new SingleColumnValueFilter(Bytes.toBytes("author"), Bytes.toBytes("name"),
                CompareOperator.EQUAL, Bytes.toBytes("spark"));
        ColumnPrefixFilter filter2 = new ColumnPrefixFilter(Bytes.toBytes("name"));
        list.addFilter(filter1);
        list.addFilter(filter2);

        scan.setFilter(list);
        ResultScanner scanner = table.getScanner(scan);
        for (Result rs : scanner) {
            String rowkey = Bytes.toString(rs.getRow());
            System.out.println("row key :" + rowkey);
            Cell[] cells = rs.rawCells();
            for (Cell cell : cells) {
                System.out.println(Bytes.toString(cell.getFamilyArray(), cell.getFamilyOffset(), cell.getFamilyLength()) + "::" + Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell.getQualifierLength()) + "::" +
                                   Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength()));
            }
            System.out.println("-----------------------------------------");
        }

    }
}