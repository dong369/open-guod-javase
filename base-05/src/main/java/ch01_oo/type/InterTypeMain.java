package ch01_oo.type;

import ch05_proxy.dynamicproxy.Movable;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:15:07
 * @JDK 1.8
 * @Description 功能模块：
 */
public class InterTypeMain {
    public static void main(String[] args) {

    }
}

class Person03 implements Person {
    private Movable movable;

    @Override
    public void set(Movable movable) {
        this.movable = movable;
    }

    public void go() throws InterruptedException {
        movable.move();
    }
}

interface Person {
    void set(Movable movable);
}
