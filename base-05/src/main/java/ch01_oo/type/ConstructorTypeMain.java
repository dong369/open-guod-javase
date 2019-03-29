package ch01_oo.type;

import ch01_oo.type.inter.Movable;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:14:50
 * @JDK 1.8
 * @Description 功能模块：构造函数注入
 */
public class ConstructorTypeMain {
    public static void main(String[] args) {
    }
}

class Person01 {
    private Movable movable;

    public Person01(Movable movable) {
        this.movable = movable;
    }

    public void go() {
        movable.move();
    }
}