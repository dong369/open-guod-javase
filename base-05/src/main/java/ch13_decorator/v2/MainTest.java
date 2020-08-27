package ch13_decorator.v2;

/**
 * @author guodd
 * @version 1.0
 * @see java.io.BufferedReader
 * @see java.io.BufferedInputStream
 * @see java.io.FileInputStream
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractDecorator aa;
        aa = new EggPancake(new Pancake());
        aa.doSomething();
        System.out.println(aa.price());
        AbstractPancake pancake;
        pancake = new Pancake();
        pancake = new EggPancake(pancake);
        pancake = new EggPancake(pancake);
        pancake = new SausagePancake(pancake);
        System.out.println(pancake.description() + pancake.price());
    }
}
