package ch11_reflection.entity;

import java.io.Serializable;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:14:50
 * @since JDK1.8
 */
public class People<T> implements Serializable {
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

    /**
     * 属性描述：id
     */
    private Integer id;

    private void breath() {
        System.out.println("呼气...");
    }

    public void eat() {
        System.out.println("吃东西...");
    }
}
