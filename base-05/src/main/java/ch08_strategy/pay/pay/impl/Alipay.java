package ch08_strategy.pay.pay.impl;

import ch08_strategy.pay.pay.Pay;

import java.time.LocalDate;


public class Alipay implements Pay {

    private static final String bankName = "支付宝:";

    @Override
    public void pay(String orderId) {
        System.out.println(bankName + "调用支付接口" + orderId);
    }

    @Override
    public void payNofity(String orderId) {
        System.out.println(bankName + "收到回调，校验合法性，确认状态，如果是未支付，改为已支付，如果是其他状态，忽略");
    }

    @Override
    public void paySync(String orderId) {
        System.out.println(bankName + "接收到同步回调，流程如上");
    }

    @Override
    public void refound(String orderId) {
        System.out.println(bankName + "钱原封不动退回原帐户");
    }

    @Override
    public void tuikuan(String orderId, int money) {
        System.out.println(bankName + "我靠，多收钱了，给你退个菜品");
    }

    @Override
    public void statusValid(String orderId) {
        System.out.println(bankName + "去看看最新状态是什么，同步更新");
    }

    @Override
    public void duizhang(LocalDate day) {
        System.out.println(bankName + "去看看前一天的帐，T+1对帐");
    }

}
