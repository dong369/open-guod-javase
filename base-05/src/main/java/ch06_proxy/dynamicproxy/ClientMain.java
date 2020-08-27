package ch06_proxy.dynamicproxy;

/**
 * project - 代理模式
 *
 * @author guodd
 * @version 1.0
 */
public class ClientMain {
    public static void main(String[] args) throws Exception {
        Movable m = (Movable) Proxy.newProxyInstance(Movable.class);
        assert m != null;
        m.move();
    }
}