package ch11_reflection.entity;

/**
 * project - 反射
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/19 时间:8:06
 * @since 1.8
 */
public class User {
    /**
     * 属性描述：姓名
     */
    private String name;

    /**
     * 属性描述：年龄
     */
    public Integer age;

    public User() {
    }

    private User(String name) {
        this.name = name;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void show() {
        System.out.println("我是中国人");
    }

    private String showNation(String name) {
        System.out.println("guo" + name);
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
