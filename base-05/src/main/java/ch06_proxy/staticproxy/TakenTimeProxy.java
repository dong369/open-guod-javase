package ch06_proxy.staticproxy;

/**
 * 时间记录
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/11 时间:8:03
 * @since 1.8
 */
public class TakenTimeProxy implements Movable {
    Movable taken;

    TakenTimeProxy(Movable taken) {
        super();
        this.taken = taken;
    }

    @Override
    public void move() throws InterruptedException {
        long start = System.currentTimeMillis();
        taken.move();
        long end = System.currentTimeMillis();
        System.out.println("run time：" + (end - start));
    }
}
