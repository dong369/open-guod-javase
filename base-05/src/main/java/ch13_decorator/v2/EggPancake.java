package ch13_decorator.v2;

/**
 * @author guodd
 * @version 1.0
 */
public class EggPancake extends AbstractDecorator {
    @Override
    public void doSomething() {
        System.out.println("做鸡蛋特有的...");
    }

    public EggPancake(AbstractPancake abstractPancake) {
        super(abstractPancake);
    }

    @Override
    public String description() {
        return super.description() + "加个鸡蛋";
    }

    @Override
    public Integer price() {
        return super.price() + 1;
    }

}
