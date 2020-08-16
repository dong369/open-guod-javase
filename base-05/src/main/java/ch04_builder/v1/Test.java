package ch04_builder.v1;

/**
 * project - 构造者模式-创建型
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 * @author guodd
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.makeProduct("Java", "视频", 23.0);
        System.out.println(product);
    }
}
