package ch03_builder.v1;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:9:16
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.makeProduct("Java", "视频", 23.0);
        System.out.println(product);
    }
}
