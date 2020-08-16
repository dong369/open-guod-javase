package ch06_proxy.staticproxy;

/**
 * 聚合方式实现代理
 *
 * @author guod
 * @version 1.0
 */
public class Taken02 implements Movable {
    Taken taken;

    public Taken02(Taken taken) {
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
