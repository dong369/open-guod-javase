package ch01_oo.oothinking;

/**
 * project - 面向对象思想（依赖倒置原则：01上层模块不应该依赖底层模块，它们应该依赖于抽象；02抽象不应该依赖于细节，细节应该依赖于抽象。）
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:12:36
 * @JDK 1.8
 * @Description 功能模块：初步认识面向对象思想（例子：老张开车去东北；按照决策能力高低或者重要性划分，老张属于上层模块，其他属于底层模块。）
 * 依赖倒置是面向对象设计领域的一种软件设计原则。
 */
public class MainTest {
    public static void main(String[] args) {
        // 思想是战略高度的东西；工具是战术高度的东西！
        Driver driver = new Driver();
        driver.setCar(new Car());
        driver.setName("老张");
        // doDriver(Traffic traffic)依赖倒置原则，不依赖具体而是依赖抽象（接口或者抽象类），依赖倒置的实质上是面向抽象接口编程的体现。
        // new Bus()控制反转IOC，就是对于控制权的反转。
        driver.doDriver(new Bus());
    }
}