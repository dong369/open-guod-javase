package ch05_proxy.staticproxy;

import java.util.Random;

/**
 * project - 代理模式
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/11 时间:7:57
 * @JDK 1.8
 * @Description 功能模块：被代理的对象
 */
public class Taken implements Movable {
    @Override
    public void move() throws InterruptedException {
        Thread.sleep(new Random().nextInt(10000));
    }
}
