package ch13_decorator.v2;

/**
 * @author guodd
 * @version 1.0
 */
public class SausagePancake extends AbstractDecorator {
    @Override
    public void doSomething() {

    }

    public SausagePancake(AbstractPancake abstractPancake) {
        super(abstractPancake);
    }

    @Override
    public String description() {
        return super.description() + "加香肠";
    }

    @Override
    public Integer price() {
        return super.price() + 2;
    }
}
