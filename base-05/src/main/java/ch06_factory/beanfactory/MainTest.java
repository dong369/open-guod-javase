package ch06_factory.beanfactory;

import org.apache.logging.log4j.util.PropertiesUtil;

import java.util.Properties;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/3 时间:10:54
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        // 获取配置文件
        Properties properties = new Properties();
        properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream("ch06_factory/beanfactory/spring.properties"));
        String vehicleType = properties.getProperty("vehicleType");
        // 通过反射获取对象
        Object o = Class.forName(vehicleType).newInstance();
        Movable car = (Movable) o;
        car.move();
    }
}
