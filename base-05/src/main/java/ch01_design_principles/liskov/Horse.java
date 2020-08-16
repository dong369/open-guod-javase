package ch01_design_principles.liskov;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class Horse extends Animal{
    @Override
    public void move() {
        System.out.println("马儿跑...");
    }
}
