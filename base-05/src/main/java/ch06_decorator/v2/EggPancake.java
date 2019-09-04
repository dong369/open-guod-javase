package ch06_decorator.v2;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/2 时间:22:29
 * @JDK 1.8
 * @Description 功能模块：
 */
public class EggPancake extends AbstractDecorator {
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
