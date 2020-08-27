package ch13_decorator.v1;

/**
 * @author guodd
 * @version 1.0
 */
public class EggSausagePancake extends EggPancake {
    @Override
    public String description() {
        return super.description() + "加一个香肠";
    }

    @Override
    public Integer price() {
        return super.price() + 2;
    }
}
