package datastructure.ch14_hash_table.ch13;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/17 时间:10:03
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainHashTableTest {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.insert(new Info("java", "java"));
        System.out.println(hashTable.search("java").getName());
    }
}
