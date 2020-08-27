package ch06_proxy.staticproxydb;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class OrderDaoImpl implements OrderDaoI{
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功...");
        return 1;
    }
}
