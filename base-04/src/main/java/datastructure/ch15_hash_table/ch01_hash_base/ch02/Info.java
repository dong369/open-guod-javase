package datastructure.ch15_hash_table.ch01_hash_base.ch02;

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
    private String key;
    private String name;

    public Info() {
    }

    public Info(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
