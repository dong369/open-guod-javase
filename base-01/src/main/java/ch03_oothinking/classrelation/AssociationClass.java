package ch03_oothinking.classrelation;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/12/28 时间:9:08
 * @JDK 1.8
 * @Description 功能模块：关联(Association)
 * 举例：客户知道订单信息。通常含有“知道”,“了解”的含义，关联可以是双向的，也可以是单向的。
 * 体现：在Java和C++中,关联关系是通过[成员变量]来实现的
 * UML：实线 + 箭头（Person—>Boat）
 * 箭头方向：箭头指向被关联的类的对象;
 */
public class AssociationClass {
    public static void main(String[] args) {
        Client client = new Client(new Order());
        client.look();
    }
}

class Client {
    private Order order;

    public Client(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void look() {
        order.info();
    }
}

class Order {
    public static void info() {
        System.out.println("订单信息");
    }
}
