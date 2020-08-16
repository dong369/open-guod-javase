package ch05_factory.beanfactory;

import java.util.ResourceBundle;

/**
 * @author guodd
 * @version 1.0
 */
public class MainTest02 {
    public static void main(String[] args) {
        ResourceBundle message = ResourceBundle.getBundle("./spring.properties");
        String test = message.getString("vehicleType");
        System.out.println(test);
    }
}