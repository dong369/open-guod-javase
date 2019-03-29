package ch01_oo.oothinking;

/**
 * project - 面向对象思想（事物作为抽象类，事物的【特性】行为作为接口）
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:12:36
 * @JDK 1.8
 * @Description 功能模块：定义一个抽象的交通工具类
 */
public abstract class Traffic {
    /**
     * 功能描述：
     *
     * @param address
     */
    public abstract void go(Address address);
}
