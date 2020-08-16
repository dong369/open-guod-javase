package ch05_factory.beanfactory;

import java.util.Properties;

/**
 * @author guodd
 * @version 1.0
 */
public class MainTest01 {
    public static void main(String[] args) throws Exception {
        // 获取配置文件
        Properties properties = new Properties();
        properties.load(MainTest01.class.getClassLoader().getResourceAsStream("./spring.properties"));
        String vehicleType = properties.getProperty("vehicleType");
        // 通过反射获取对象
        Object o = Class.forName(vehicleType).getDeclaredConstructor().newInstance();
        Movable car = (Movable) o;
        car.move();
    }
}
