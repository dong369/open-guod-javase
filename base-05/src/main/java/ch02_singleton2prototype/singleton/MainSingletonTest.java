package ch02_singleton2prototype.singleton;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/2 时间:12:59
 * @JDK 1.8
 * @Description 功能模块：老张只拥有一辆车
 */
public class MainSingletonTest {
    public static void main(String[] args) {
        System.out.println(CarOne.getInstance() == CarOne.getInstance());
        System.out.println(CarTwo.getInstance() == CarTwo.getInstance());
    }
}
