package ch11_reflection.method;

/**
 * project - 反射
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/19 时间:8:06
 * @JDK 1.8
 * @Description 功能模块：
 */
public class User {
    /**
     * 属性描述：id
     */
    private String id;

    /**
     * 属性描述：姓名
     */
    private String name;

    public User() {
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
