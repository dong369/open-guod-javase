package ch10_bridge.v2;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/5 时间:20:56
 * @JDK 1.8
 * @Description 功能模块：
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccount() {
        System.out.println("这是定期账号");
    }
}
