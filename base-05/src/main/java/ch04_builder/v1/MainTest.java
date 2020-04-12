package ch04_builder.v1;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.makeProduct("Java", "视频", 23.0);
        System.out.println(product);
    }
}
