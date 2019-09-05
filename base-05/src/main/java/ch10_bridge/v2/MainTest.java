package ch10_bridge.v2;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/18 时间:10:41
 * @JDK 1.8
 * @Description 功能模块：桥接模式，两个维度的排列组合（组合代替继承）
 */
public class MainTest {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account account = icbcBank.openAccount();
        account.showAccount();
    }
}
