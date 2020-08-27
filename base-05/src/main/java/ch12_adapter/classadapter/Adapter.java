package ch12_adapter.classadapter;

/**
 * @author guodd
 * @version 1.0
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
