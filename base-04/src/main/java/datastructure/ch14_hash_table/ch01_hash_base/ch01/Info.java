package datastructure.ch14_hash_table.ch01_hash_base.ch01;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/17 时间:9:16
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Info {
    private int key;
    private String name;

    public Info() {
    }

    public Info(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
