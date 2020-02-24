package ch06_proxy.dynamicproxy;

/**
 * project - 代理模式
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:19:27
 * @JDK 1.8
 * @Description 功能模块：代理模式
 */
public class ClientMain {
    public static void main(String[] args) throws Exception {
        Movable m = (Movable) Proxy.newProxyInstance(Movable.class);
        assert m != null;
        m.move();
    }
}