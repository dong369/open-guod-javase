package datastructure.ch15_hash_table.ch01_hash_base.ch01;


/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/17 时间:9:24
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainHashTableTest {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.insert(new Info(12, "test java"));
        System.out.println(hashTable.search(12).getName());
    }
}
