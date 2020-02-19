package ch03_oothinking.initorder.extendsclass;

/**
 * 测试类继承的初始化顺序
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/7 时间:14:31
 * @since 1.8
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
