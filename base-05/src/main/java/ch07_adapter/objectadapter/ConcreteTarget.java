package ch07_adapter.objectadapter;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/3 时间:22:47
 * @JDK 1.8
 * @Description 功能模块：
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("目标方法");
    }
}
