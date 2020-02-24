package ch06_proxy.jdk;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/8/17 时间:17:18
 * @since 1.8
 */
public class ConcreteSubject implements ISubject {

    @Override
    public void action() {
        System.out.println("ConcreteSubject");
    }
}
