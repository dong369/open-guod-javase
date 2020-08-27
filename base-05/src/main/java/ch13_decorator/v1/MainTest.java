package ch13_decorator.v1;

/**
 * project - 装饰者模式(Decorator Pattern)
 *
 * @author guodd
 * @version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        Pancake pancake = new Pancake();
        System.out.println(pancake.description() + pancake.price());

        EggPancake eggPancake = new EggPancake();
        System.out.println(eggPancake.description() + eggPancake.price());


        EggSausagePancake eggSausagePancake = new EggSausagePancake();
        System.out.println(eggSausagePancake.description() + eggSausagePancake.price());

    }
}
