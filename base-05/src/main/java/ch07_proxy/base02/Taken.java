package ch07_proxy.base02;

import java.util.Random;

/**
 * project - 代理模式
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/9/11 时间:7:57
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Taken implements Moveable {
    @Override
    public void move() throws InterruptedException {
        Thread.sleep(new Random().nextInt(10000));
    }
}
