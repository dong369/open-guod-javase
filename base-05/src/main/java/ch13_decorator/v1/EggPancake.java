package ch13_decorator.v1;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/2 时间:21:53
 * @JDK 1.8
 * @Description 功能模块：鸡蛋
 */
public class EggPancake extends Pancake {
    @Override
    public String description() {
        return super.description() + "加一个鸡蛋";
    }

    @Override
    public Integer price() {
        return super.price() + 1;
    }
}
