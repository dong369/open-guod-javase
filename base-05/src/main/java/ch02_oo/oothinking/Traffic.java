package ch02_oo.oothinking;

/**
 * 面向对象思想（事物作为抽象类，事物的【特性】行为作为接口）
 * 脑子里有确确实实有这个概念，没有具体的东西，一类事物的共同特征，会飞的、会跑的定义为借口。
 * 定义一个抽象的交通工具类
 *
 * @author guodd
 * @version 1.0
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
