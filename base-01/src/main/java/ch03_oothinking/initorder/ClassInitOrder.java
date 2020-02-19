package ch03_oothinking.initorder;

/**
 * 静态变量 > 静态初始块 > 成员变量 > 非静态初始块 > 构造器
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/7 时间:14:27
 * @since 1.8
 */
public class ClassInitOrder {
    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("游离块");
    }

    private ClassInitOrder() {
        System.out.println("构造块");
    }

    public static void main(String[] args) {
        new ClassInitOrder();
        new ClassInitOrder();
    }
}