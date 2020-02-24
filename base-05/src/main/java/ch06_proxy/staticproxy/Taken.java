package ch06_proxy.staticproxy;

import java.util.Random;

/**
 * 被代理的对象
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/11 时间:7:57
 * @since 1.8
 */
public class Taken implements Movable {
    @Override
    public void move() throws InterruptedException {
        Thread.sleep(new Random().nextInt(10000));
    }
}
