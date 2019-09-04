package ch07_adapter.lifeexample;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/4 时间:8:20
 * @JDK 1.8
 * @Description 功能模块：适配器
 */
public class PowerAdapter implements DC5V {
    private AC220V ac220V = new AC220V();

    @Override
    public int outputDC5V() {
        int outputAC220V = ac220V.outputAC220V();
        // 变压器
        int adapterOutput = outputAC220V / 44;
        System.out.println("使用PowerAdapter输入的AC：" + outputAC220V + ",使用PowerAdapter输出的DC：" + adapterOutput);
        return adapterOutput;
    }
}
