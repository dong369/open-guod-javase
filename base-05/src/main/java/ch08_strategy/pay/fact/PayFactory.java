package ch08_strategy.pay.fact;


import ch08_strategy.pay.pay.Pay;
import ch08_strategy.pay.pay.impl.Alipay;
import ch08_strategy.pay.pay.impl.IcbcPay;
import ch08_strategy.pay.pay.impl.WechatPay;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PayFactory {

    private static final Map<String, Pay> map = new HashMap<>();

    static {
        postConstruct();
    }

    // bean初始化
    private static void postConstruct() {
        register("02001", new Alipay());
        register("02002", new WechatPay());
        register("02003", new IcbcPay());
    }

    // 注册
    public static void register(String bankCode, Pay pay) {
        map.put(bankCode, pay);
    }

    // 获取实例
    public static Pay getBank(String bankCode) {
        if (Objects.isNull(bankCode)) {
            return null;
        }
        return map.get(bankCode);
    }

}
