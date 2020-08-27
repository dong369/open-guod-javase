package ch13_decorator.v2;

/**
 * @author guodd
 * @version 1.0
 */
public class Pancake extends AbstractPancake {
    @Override
    public String description() {
        return "煎饼";
    }

    @Override
    public Integer price() {
        return 5;
    }
}
