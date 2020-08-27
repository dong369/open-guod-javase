package ch12_adapter.classadapter;

/**
 * @author guodd
 * @version 1.0
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("目标方法");
    }
}
