package ch02_oo.oothinking;

/**
 * 面向对象思想（事物作为抽象类，事物的【特性】行为作为接口）
 * 定义一个抽象的交通工具类
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:12:36
 * @since 1.8
 */
public abstract class Traffic {
    /**
     * 功能描述：
     *
     * @param address 地址
     */
    public abstract void go(Address address);
}
