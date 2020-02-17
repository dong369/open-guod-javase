package ch11_reflection.entity;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:14:50
 * @since JDK1.8
 */
@MyAnnotation("hi")
public class PeopleMan extends People<String> implements MyInterface, Comparable<String> {
    /**
     * 属性描述：姓名
     */
    public String manName;

    /**
     * 属性描述：年龄
     */
    protected Integer manAge;

    /**
     * 属性描述：性别
     */
    String manSex;

    /**
     * 属性描述：id
     */
    private Integer ManId;

    public PeopleMan() {
    }

    private PeopleMan(String manName) {
        this.manName = manName;
    }

    PeopleMan(String manName, Integer manAge) {
        this.manName = manName;
        this.manAge = manAge;
    }

    private void show() {
        System.out.println("show...");
    }

    public String showNative(String name) {
        System.out.println(name);
        return name;
    }

    public static void showStatic() {
        System.out.println("static method invoke...");
    }

    @Override
    public void info() {
        System.out.println("我是男人...");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
