package ch02_oo.oothinking;

/**
 * 面向对象思想-要求的地方
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
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
