package ch04_builder.v2;

/**
 * @author guodd
 * @version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        Product product = new Product.Builder().courseName("课程").coursePrice(2.0).build();
        System.out.println(product);
    }
}
