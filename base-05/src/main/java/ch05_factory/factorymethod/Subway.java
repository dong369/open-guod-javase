package ch05_factory.factorymethod;

/**
 * project - 工厂方法
 *
 * @author guodd
 * @version 1.0
 */
public class Subway implements Movable {
    @Override
    public void run() {
        System.out.println("地铁");
    }
}
