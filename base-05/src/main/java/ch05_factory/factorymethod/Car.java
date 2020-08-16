package ch05_factory.factorymethod;

/**
 * project - 工厂方法
 *
 * @author guodd
 * @version 1.0
 */
public class Car implements Movable {
    private static final Car car = new Car();

    private Car() {
    }

    public static Car getInstance() {
        return car;
    }

    @Override
    public void run() {
        System.out.println("小汽车");
    }
}
