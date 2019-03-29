package ch01_oo.oothinking;

/**
 * project - 面向对象思想
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/9/23 时间:13:06
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Bus extends Traffic {
    @Override
    public void go(Address address) {
        System.out.println("乘公交");
    }
}
