package ch06_proxy.staticproxy;

/**
 * 继承方式实现代理
 *
 * @author guod
 * @version 1.0
 */
public class Taken01 extends Taken {
    @Override
    public void move() throws InterruptedException {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
