package ch02_data.classinitorder.extendsclass;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/7 时间:14:31
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Parent {
    public Parent() {
        System.out.println("Parent 构造快");
    }

    {
        System.out.println("Parent 游离块");
    }

    static {
        System.out.println("Parent 静态块");
    }
}
