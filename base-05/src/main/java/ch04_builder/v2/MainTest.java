package ch04_builder.v2;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:9:44
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
    public static void main(String[] args) {
        Product product = new Product.Builder().courseName("课程").coursePrice(2.0).build();
        System.out.println(product);
    }
}
