package ch04_proxy.staticproxy;

/**
 * project - 代理模式
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/11 时间:8:00
 * @JDK 1.8
 * @Description 功能模块：继承方式实现代理
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
