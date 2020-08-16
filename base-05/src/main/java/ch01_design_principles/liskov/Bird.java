package ch01_design_principles.liskov;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("鸟儿飞...");
    }
    public void eat(){
        System.out.println("吃虫子...");
    }
}
