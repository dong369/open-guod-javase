package ch03_factory.beanfactory;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/11 时间:16:45
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest03 {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object v = beanFactory.getBean("V");
        Movable movable = (Movable) v;
        movable.move();
    }
}
