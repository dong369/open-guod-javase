package ch03_oothinking.classinitorder.extendsclass;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/7 时间:14:31
 * @JDK 1.8
 * @Description 功能模块：测试类继承的初始化顺序
 */
public class Child extends Parent {
    public Child() {
        System.out.println("Child 构造快");
    }

    {
        System.out.println("Child 游离块");
    }

    static {
        System.out.println("Child 静态块");
    }
}
