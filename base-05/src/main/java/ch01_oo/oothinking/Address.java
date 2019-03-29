package ch01_oo.oothinking;

/**
 * project - 面向对象思想
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:12:34
 * @JDK 1.8
 * @Description 功能模块：要求的地方
 */
public class Address {
    private String name;

    public Address() {
    }

    public Address(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
