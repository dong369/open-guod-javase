package ch13_decorator.v1;

/**
 * @author guodd
 * @version 1.0
 * 鸡蛋
 */
public class EggPancake extends Pancake {
    @Override
    public String description() {
        return super.description() + "加一个鸡蛋";
    }

    @Override
    public Integer price() {
        return super.price() + 1;
    }
}
