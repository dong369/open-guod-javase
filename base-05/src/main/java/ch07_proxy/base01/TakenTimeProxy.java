package ch07_proxy.base01;

/**
 * project - 代理模式
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/11 时间:8:03
 * @JDK 1.8
 * @Description 功能模块：时间记录
 */
public class TakenTimeProxy implements Movable {
    Movable taken;

    public TakenTimeProxy(Movable taken) {
        super();
        this.taken = taken;
    }

    @Override
    public void move() throws InterruptedException {
        long start = System.currentTimeMillis();
        taken.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
