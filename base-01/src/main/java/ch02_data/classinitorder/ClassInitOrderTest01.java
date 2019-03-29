package ch02_data.classinitorder;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/7 时间:14:27
 * @JDK 1.8
 * @Description 功能模块：测试单类的初始化顺序（静态变量 > 静态初始块 > 成员变量 > 非静态初始块 > 构造器）
 */
public class ClassInitOrderTest01 {
    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("游离块");
    }

    private ClassInitOrderTest01() {
        System.out.println("构造器");
    }

    public static void main(String[] args) {
        new ClassInitOrderTest01();
    }
}