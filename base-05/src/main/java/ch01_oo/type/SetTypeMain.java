package ch01_oo.type;

import ch04_proxy.dynamicproxy.Movable;

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
    private Movable movable;

    public Movable getMovable() {
        return movable;
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }

    public void go() throws InterruptedException {
        movable.move();
    }
}
