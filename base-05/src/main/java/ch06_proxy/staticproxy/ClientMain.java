package ch06_proxy.staticproxy;

/**
 * project - 代理模式
 *
 * @author guodd
 * @version 1.0
 * 功能模块：代理模式
 */
public class ClientMain {
    public static void main(String[] args) throws InterruptedException {
        Taken taken = new Taken();
        TakenTimeProxy ttp = new TakenTimeProxy(taken);
        Movable m;
        m = new TakenLogProxy(ttp);
        m.move();
    }
}