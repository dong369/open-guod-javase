package ch01_design_principles.singleresponsibility.classsingle;

/**
 * Single Responsibility Principle，单一职责原则
 *
 * @author guodd
 * @version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        FlyMove bird = new FlyMove();
        bird.move("大雁");
        WalkMove walkMove = new WalkMove();
        walkMove.move("狗");
    }
}
