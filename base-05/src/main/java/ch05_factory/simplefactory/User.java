package ch05_factory.simplefactory;

/**
 * project - 简单工厂
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/3 时间:8:40
 * @JDK 1.8
 * @Description 功能模块：控制产生对象的过程
 */
public class User {
    private User() {
    }

    private static User user = new User();

    static User getInstance() {
        return user;
    }
}
