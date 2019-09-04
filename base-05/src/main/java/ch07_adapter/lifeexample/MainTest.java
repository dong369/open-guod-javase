package ch07_adapter.lifeexample;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/4 时间:8:24
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainTest {
    public static void main(String[] args) {
        DC5V dc5V = new PowerAdapter();
        dc5V.outputDC5V();
    }
}
