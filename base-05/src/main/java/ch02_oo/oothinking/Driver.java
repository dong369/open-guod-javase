package ch02_oo.oothinking;

/**
 * project - 面向对象思想
 * 考虑类：名称（反例：People）
 * 属性：不可脱离具体的应用环境（反例：sex）
 * 方法：站在Driver角度考虑，开车动词
 * 类之间关系：司机要有一个车
 * 隐藏封装：降低耦合度，迪米特法则
 * 站在使用者的角度考虑问题，修改不如添加
 * 继承：继承的耦合度很高
 * 多态：继承/实现、重写、父类引用指向子类对象
 * 核心：可扩展性好，extensibility
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
     * 功能描述：司机开车操作
     * 司机开车方法doDriver依赖于Traffic接口的抽象，没有限定交通工具的方式，任何交通工具都行
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
