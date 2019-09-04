package ch06_decorator.v1;

/**
 * project - 装饰者模式(Decorator Pattern)
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/12/28 时间:9:53
 * @JDK 1.8
 * @Description 功能模块：
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
