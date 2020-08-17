package ch08_reflection.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @since JDK1.8
 */
@Data
public class People<T> implements Serializable {
    /**
     * 属性描述：id
     */
    private Integer id;

    /**
     * 属性描述：姓名
     */
    public String name;

    /**
     * 属性描述：年龄
     */
    protected Integer age;

    /**
     * 属性描述：性别
     */
    String sex;

    public People() {
    }

    public People(Integer id, String name, Integer age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private void breath() {
        System.out.println("呼气...");
    }

    public void eat() {
        System.out.println("吃东西...");
    }
}
