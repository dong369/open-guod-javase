package ch03_oothinking.initorder;

/**
 * 静态变量 > 静态初始块 > 成员变量 > 非静态初始块 > 构造器
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class ClassInitOrder {
    /**
     * 属性描述：address
     */
    private static final String address = "河南";

    /**
     * 属性描述：name
     */
    private String name;

    static {
        System.out.println(address);
        System.out.println("静态代码块");
    }

    {
        System.out.println(address);
        System.out.println("游离块");
    }

    private ClassInitOrder() {
        System.out.println("构造块");
    }

    public static void main(String[] args) {
        System.out.println("====第一次创建对象====");
        new ClassInitOrder();
        System.out.println("====第二次创建对象====");
        new ClassInitOrder();
        System.out.println("====第三次创建对象====");
        new ClassInitOrder();
    }
}
