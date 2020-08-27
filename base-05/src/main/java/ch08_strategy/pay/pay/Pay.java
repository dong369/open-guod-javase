package ch08_strategy.pay.pay;

import java.time.LocalDate;

public interface Pay {
    String ERROR_MSG = "此支付机构不支付该操作";

    /**
     * 支付
     */
    default void pay(String orderId) {
        uoe();
    }

    /**
     * 异步回调
     */
    default void payNofity(String orderId) {
        uoe();
    }

    /**
     * 同步回调
     */
    default void paySync(String orderId) {
        uoe();
    }

    /**
     * 充正
     */
    default void refound(String orderId) {
        uoe();
    }

    /**
     * 退款
     */
    default void tuikuan(String orderId, int money) {
        uoe();
    }

    /**
     * 状态
     */
    default void statusValid(String orderId) {
        uoe();
    }

    /**
     * 对帐
     */
    default void duizhang(LocalDate day) {
        uoe();
    }

    private void uoe() {
        uoe(ERROR_MSG);
    }

    private void uoe(String s) {
        throw new UnsupportedOperationException(s);
    }

}
