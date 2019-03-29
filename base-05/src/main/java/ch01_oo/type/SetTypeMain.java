package ch01_oo.type;

import ch07_proxy.base02.Moveable;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/3 时间:14:50
 * @JDK 1.8
 * @Description 功能模块：setter 方式注入
 */
public class SetTypeMain {
    public static void main(String[] args) {
    }
}

class Person02 {
    private Moveable movable;

    public Moveable getMovable() {
        return movable;
    }

    public void setMovable(Moveable movable) {
        this.movable = movable;
    }

    public void go() throws InterruptedException {
        movable.move();
    }
}
