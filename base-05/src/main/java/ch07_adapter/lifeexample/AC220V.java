package ch07_adapter.lifeexample;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/4 时间:8:16
 * @JDK 1.8
 * @Description 功能模块：待适配类
 */
public class AC220V {
    public int outputAC220V() {
        int output = 220;
        System.out.println("输出的交流电：" + output);
        return output;
    }
}
