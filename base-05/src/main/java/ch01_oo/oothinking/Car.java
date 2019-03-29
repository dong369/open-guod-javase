package ch01_oo.oothinking;

/**
 * project - 面向对象思想
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:12:34
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Car extends Traffic {
    @Override
    public void go(Address address) {
        System.out.println("开车去" + address.getName());
    }
}
