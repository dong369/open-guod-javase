package ch06_factory.factorymeth;

/**
 * project - 工厂方法
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/3 时间:8:39
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println(User.getInstance() == User.getInstance());
    }
}
