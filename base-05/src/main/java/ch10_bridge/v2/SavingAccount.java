package ch10_bridge.v2;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/5 时间:20:54
 * @JDK 1.8
 * @Description 功能模块：
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccount() {
        System.out.println("这是活期账号");
    }
}
