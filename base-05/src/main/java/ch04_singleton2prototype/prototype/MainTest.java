package ch04_singleton2prototype.prototype;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:19:27
 * @JDK 1.8
 * @Description 功能模块：原型模式
 */
public class MainTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Emperor.getInstance().say());
        }
    }
}
