package ch05_factory.beanfactory;

/**
 * @author guodd
 * @version 1.0
 */
public class Car implements Movable {

    @Override
    public void move() {
        System.out.println("Car open");
    }
}
