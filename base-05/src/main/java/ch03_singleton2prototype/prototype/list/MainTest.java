package ch03_singleton2prototype.prototype.list;

/**
 * 原型模式
 * 指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
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
