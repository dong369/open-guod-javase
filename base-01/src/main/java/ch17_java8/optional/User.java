package ch17_java8.optional;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/6 时间:9:45
 * @JDK 1.8
 * @Description 功能模块：
 */
public class User {
    /**
     * 属性描述：姓名
     */
    private String name;
    /**
     * 功能描述：年龄
     */
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}