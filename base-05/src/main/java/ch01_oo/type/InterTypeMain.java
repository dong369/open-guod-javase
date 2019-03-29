package ch01_oo.type;

import ch07_proxy.base02.Moveable;

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
    private Moveable moveable;

    @Override
    public void set(Moveable moveable) {
        this.moveable = moveable;
    }

    public void go() throws InterruptedException {
        moveable.move();
    }
}

interface Person {
    void set(Moveable moveable);
}
