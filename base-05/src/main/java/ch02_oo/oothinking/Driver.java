package ch02_oo.oothinking;

/**
 * project - 面向对象思想
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class Driver {

    private String name;

    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * 功能描述：司机开车操作（司机开车方法doDriver依赖于Traffic接口的抽象，没有限定交通工具的方式，任何交通工具都行）
     *
     * @param traffic 交通工具
     */
    public void doDriver(Traffic traffic) {
        // car.go(new Address("违反了高内聚、低耦合的原则"));
        traffic.go(new Address("东北"));
    }

    public void doDriver(Traffic traffic, Address address) {
        traffic.go(address);
    }
}
