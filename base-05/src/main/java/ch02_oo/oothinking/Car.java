package ch02_oo.oothinking;

/**
 * 面向对象思想-具体的实现
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:12:34
 * @since 1.8
 */
public class Car extends Traffic {
    @Override
    public void go(Address address) {
        System.out.println("开车去" + address.getName());
    }
}
