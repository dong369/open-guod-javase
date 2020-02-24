package ch13_decorator.v2;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/2 时间:22:30
 * @JDK 1.8
 * @Description 功能模块：
 */
public class SausagePancake extends AbstractDecorator {
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
