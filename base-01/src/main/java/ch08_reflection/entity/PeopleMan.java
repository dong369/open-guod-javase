package ch08_reflection.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @since JDK1.8
 */
@EqualsAndHashCode(callSuper = true)
@Data
@MyAnnotation(value = "hi")
public class PeopleMan extends People<String> implements MyInterface, Comparable<String> {
    /**
     * 属性描述：姓名
     */
    @MyAnnotation("manName")
    @MyAnnotation("name")
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

    @MyAnnotation("manName")
    @MyAnnotation("name")
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
