package datastructure.ch14_hash_table.ch12;


/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/17 时间:9:17
 * @JDK 1.8
 * @Description 功能模块：
 */
public class HashTable {
    private Info[] arr;

    /**
     * 默认构造方法
     */
    public HashTable() {
        arr = new Info[100];
    }

    /**
     * 指定初始化大小
     *
     * @param maxSize
     */
    public HashTable(int maxSize) {
        arr = new Info[maxSize];
    }

    /**
     * 插入数据
     *
     * @param info
     */
    public void insert(Info info) {
        arr[info.getKey()] = info;
    }

    /**
     * 查找数据
     *
     * @param key
     * @return
     */
    public Info search(int key) {
        return arr[key];
    }


    /**
     * hashcode实现：将字母转成ASCII
     *
     * @param key
     * @return
     */
    public int hashCode01(String key) {
        int hashVal = 0;
        for (int i = key.length() - 1; i >= 0; i--) {
            int letter = key.charAt(i) - 96;
            hashVal += letter;
        }
        return hashVal;
    }

    /**
     * hashcode实现：幂的连乘
     *
     * @param key
     * @return
     */
    public int hashCode02(String key) {
        int hashVal = 0;
        int pow27 = 1;
        for (int i = key.length() - 1; i >= 0; i--) {
            int letter = key.charAt(i) - 96;
            hashVal += letter * pow27;
            pow27 *= 27;
        }
        return hashVal;
    }

    /**
     * hashcode实现：压缩可选值
     *
     * @param key
     * @return
     */
    public int hashCode03(String key) {
        int hashVal = 0;
        int pow27 = 1;
        for (int i = key.length() - 1; i >= 0; i--) {
            int letter = key.charAt(i) - 96;
            hashVal += letter * pow27;
            pow27 *= 27;
        }
        // 压缩操作
        return hashVal % arr.length;
    }


}
