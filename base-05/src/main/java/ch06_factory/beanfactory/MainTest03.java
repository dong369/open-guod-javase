package ch06_factory.beanfactory;

import java.util.ResourceBundle;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/12 时间:12:38
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest03 {
    public static void main(String[] args) {
        ResourceBundle message = ResourceBundle.getBundle("ch06_factory/beanfactory/spring.properties");
        String test = message.getString("vehicleType");
        System.out.println(test);
    }
}