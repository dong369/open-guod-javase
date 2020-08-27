package ch06_proxy.staticproxydb;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class OrderServiceImpl implements OrderServiceI {
    OrderDaoI orderDaoI;

    @Override
    public int saveOrder(Order order) {
        // 如果使用spring框架，直接进行注入即可
        orderDaoI = new OrderDaoImpl();
        System.out.println("Service层调用Dao层的Order...");
        return orderDaoI.insert(order);
    }
}
