package ch04_proxy.staticproxy;

/**
 * project - 代理模式
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/11 时间:8:03
 * @JDK 1.8
 * @Description 功能模块：日志记录
 */
public class TakenLogProxy implements Movable {
    Movable taken;

    TakenLogProxy(Movable taken) {
        super();
        this.taken = taken;
    }

    @Override
    public void move() throws InterruptedException {
        System.out.println("logger start");
        taken.move();
        System.out.println("logger end");
    }
}
