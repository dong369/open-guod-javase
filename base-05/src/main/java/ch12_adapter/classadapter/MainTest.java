package ch12_adapter.classadapter;

/**
 * @author guodd
 * @version 1.0
 * 类适配器模式
 */
public class MainTest {
    public static void main(String[] args) {
        Target concreteTargetAdapter = new ConcreteTarget();
        concreteTargetAdapter.request();
        Target adapter = new Adapter();
        adapter.request();
    }
}
