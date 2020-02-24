package ch01_design_principles.singleresponsibility.classsingle;

/**
 * project - 单一职责原则
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/1 时间:21:03
 * @JDK 1.8
 * @Description 功能模块：Single Responsibility Principle，单一职责原则
 */
public class MainTest {
    public static void main(String[] args) {
        FlyMove bird = new FlyMove();
        bird.move("大雁");
        WalkMove walkMove = new WalkMove();
        walkMove.move("狗");
    }
}
