package ch08_strategy.pay.pay.impl;

import ch08_strategy.pay.pay.Pay;

import java.time.LocalDate;


public class IcbcPay implements Pay {

    private static final String bankName = "爱存不存:";

    @Override
    public void pay(String orderId) {
        System.out.println(bankName + "调用支付接口");
    }


    @Override
    public void paySync(String orderId) {
        System.out.println(bankName + "接收到同步回调，流程如上");
    }


    @Override
    public void duizhang(LocalDate day) {
        System.out.println(bankName + "去看看前一天的帐，T+1对帐");
    }

}
