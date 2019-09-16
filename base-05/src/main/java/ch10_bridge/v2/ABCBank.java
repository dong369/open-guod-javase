package ch10_bridge.v2;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/9/5 时间:21:02
 * @JDK 1.8
 * @Description 功能模块：
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行");
        // 委托
        account.openAccount();
        return account;
    }
}
