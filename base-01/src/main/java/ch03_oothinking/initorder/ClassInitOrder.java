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
    private static String address;

    static {
        System.out.println("静态代码块");
    }

    /**
     * 属性描述：name
     */
    private String name;

    {
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