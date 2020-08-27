package ch06_proxy.staticproxydb;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class MainTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(0);
        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy();
        int i = proxy.saveOrder(order);
    }
}
