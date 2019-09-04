package ch06_decorator.v1;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/2 时间:21:55
 * @JDK 1.8
 * @Description 功能模块：
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
