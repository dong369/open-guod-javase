package ch13_decorator.v2;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/2 时间:22:27
 * @JDK 1.8
 * @Description 功能模块：
 */
public class AbstractDecorator extends AbstractPancake {
    private AbstractPancake abstractPancake;

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
