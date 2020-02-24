package ch12_adapter.classadapter;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/18 时间:11:05
 * @JDK 1.8
 * @Description 功能模块：类适配器模式
 */
public class MainTest {
    public static void main(String[] args) {
        Target concreteTargetAdapter = new ConcreteTarget();
        concreteTargetAdapter.request();
        Target adapter = new Adapter();
        adapter.request();
    }
}
