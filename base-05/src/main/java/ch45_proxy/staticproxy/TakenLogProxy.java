package ch45_proxy.staticproxy;

/**
 * 日志记录
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/11 时间:8:03
 * @since 1.8
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
