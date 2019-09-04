package ch06_decorator.v2;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/2 时间:22:25
 * @JDK 1.8
 * @Description 功能模块：
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
