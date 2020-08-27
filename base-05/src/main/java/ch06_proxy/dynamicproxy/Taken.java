package ch06_proxy.dynamicproxy;

import java.util.Random;

/**
 * project - 代理模式
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
