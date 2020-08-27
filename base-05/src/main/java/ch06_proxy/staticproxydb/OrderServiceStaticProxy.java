package ch06_proxy.staticproxydb;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class OrderServiceStaticProxy implements OrderServiceI {
    OrderServiceI orderServiceI;

    @Override
    public int saveOrder(Order order) {
        beforeMethod();
        orderServiceI = new OrderServiceImpl();
        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】库处理");

        // TODO
        DataSourceContextHolder.setDbType("db" + dbRouter);

        afterMethod();
        return orderServiceI.saveOrder(order);
    }

    public void beforeMethod() {
        System.out.println("静态代理before...");
    }

    public void afterMethod() {
        System.out.println("静态代理after...");
    }

}
