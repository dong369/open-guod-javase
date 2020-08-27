package ch13_decorator.v2;

/**
 * @author guodd
 * @version 1.0
 */
public abstract class AbstractDecorator extends AbstractPancake {
    AbstractPancake abstractPancake;

    public abstract void doSomething();

    public AbstractDecorator(AbstractPancake abstractPancake) {
        this.abstractPancake = abstractPancake;
    }

    @Override
    public String description() {
        return this.abstractPancake.description();
    }

    @Override
    public Integer price() {
        return this.abstractPancake.price();
    }
}
