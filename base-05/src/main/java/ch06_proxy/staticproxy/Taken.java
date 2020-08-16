package ch06_proxy.staticproxy;

import java.util.Random;

/**
 * 被代理的对象
 *
 * @author guod
 * @version 1.0
 */
public class Taken implements Movable {
    @Override
    public void move() throws InterruptedException {
        Thread.sleep(new Random().nextInt(10000));
    }
}
