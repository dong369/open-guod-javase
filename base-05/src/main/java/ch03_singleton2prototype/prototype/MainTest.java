package ch03_singleton2prototype.prototype;

/**
 * 原型模式
 *
 * @author guodd
 * @version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Emperor.getInstance().say());
        }
    }
}
