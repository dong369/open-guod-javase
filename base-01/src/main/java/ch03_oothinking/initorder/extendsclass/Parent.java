package ch03_oothinking.initorder.extendsclass;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class Parent {
    public Parent() {
        System.out.println("Parent 构造快");
    }

    static {
        System.out.println("Parent 静态块");
    }

    {
        System.out.println("Parent 游离块");
    }
}
