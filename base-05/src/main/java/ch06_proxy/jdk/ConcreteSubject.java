package ch06_proxy.jdk;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class ConcreteSubject implements ISubject {

    @Override
    public void action() {
        System.out.println("ConcreteSubject");
    }
}
