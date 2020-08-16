package ch05_factory.beanfactory;

/**
 * @author guodd
 * @version 1.0
 */
public class MainTest03 {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object v = beanFactory.getBean("V");
        Movable movable = (Movable) v;
        movable.move();
    }
}
