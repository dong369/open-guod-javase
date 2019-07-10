package datastructure.ch14_hash_table.ch01_hash_base.ch02;

import java.math.BigInteger;

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
        // 获取关键字
        String key = info.getKey();
        // 关键字所自定义的哈希数
        int hashVal = hashCode04(key);
        // 如果这个索引已经被占用，而且里面是一个未被删除的数据
        while (arr[hashVal] != null && arr[hashVal].getName() != null) {
            // 进行递增
            ++hashVal;
            // 循环
            hashVal %= arr.length;
        }
        arr[hashVal] = info;
    }

    /**
     * 查找数据
     *
     * @param key
     * @return
     */
    public Info search(String key) {
        int hashVal = hashCode04(key);
        while (arr[hashVal] != null) {
            ++hashVal;
            hashVal %= arr.length;
            if (arr[hashVal].getKey().equals(key)) {
                return arr[hashVal];
            }
        }
        return null;
    }

    /**
     * 删除数据
     *
     * @param key
     * @return
     */
    public Info delete(String key) {
        int hashVal = hashCode04(key);
        while (arr[hashVal] != null) {
            ++hashVal;
            hashVal %= arr.length;
            if (arr[hashVal].getKey().equals(key)) {
                Info tmp = arr[hashVal];
                tmp = null;
                return tmp;
            }
            ++hashVal;
            hashVal %= arr.length;
        }
        return null;
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

    /**
     * 扩展存放的值
     *
     * @param key
     * @return
     */
    public int hashCode04(String key) {
        BigInteger hashVal = new BigInteger("0");
        BigInteger pow27 = new BigInteger("1");
        for (int i = key.length() - 1; i >= 0; i--) {
            int letter = key.charAt(i) - 96;
            // hashVal += letter * pow27;
            BigInteger letterB = new BigInteger(String.valueOf(letter));
            hashVal = hashVal.add(letterB.multiply(pow27));
            // pow27 *= 27;
            pow27 = pow27.multiply(new BigInteger("27"));
        }
        // 压缩操作
        return hashVal.mod(new BigInteger(String.valueOf(arr.length))).intValue();
    }


}
