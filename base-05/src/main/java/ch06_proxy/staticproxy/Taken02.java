package ch06_proxy.staticproxy;

/**
 * 聚合方式实现代理
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/11 时间:8:01
 * @since 1.8
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
