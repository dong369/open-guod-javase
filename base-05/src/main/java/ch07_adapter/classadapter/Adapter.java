package ch07_adapter.classadapter;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/3 时间:22:46
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
