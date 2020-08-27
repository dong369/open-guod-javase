package ch08_strategy.pay;


import ch08_strategy.pay.fact.PayFactory;
import ch08_strategy.pay.pay.Pay;

public class Main {

    public static void main(String[] args) {
        oldCode();

        System.out.println("--------------");

        newCode();
    }


    private static void newCode() {
        String bankCode = "02008";
        Pay bank = PayFactory.getBank(bankCode);
        // bank.pay(String.format("%07d", 2));
        assert bank != null;
        bank.pay(bankCode);
    }

    private static void oldCode() {
        String bankCode = "02001";
        String payType = "pay";
        if (bankCode != null && bankCode.equals("02001")) {
            if (payType.equals("pay")) {
                System.out.println("我要支付了");
            } else if (payType.equals("充正")) {
                System.out.println("我要充正了");
            } else if (payType.equals("退款")) {
                System.out.println("我要退款了");
            } else {
                System.out.println("不支持");
            }
            // 方法太多，懒得写

        } else if (bankCode != null && bankCode.equals("02002")) {
            if (payType.equals("pay")) {
                System.out.println("我要支付了");
            } else if (payType.equals("充正")) {
                System.out.println("我要充正了");
            } else if (payType.equals("退款")) {
                System.out.println("我要退款了");
            } else {
                System.out.println("不支持");
            }
            // 方法太多，懒得写

        } else if (bankCode != null && bankCode.equals("02003")) {
            if (payType.equals("pay")) {
                System.out.println("我要支付了");
            } else {
                System.out.println("不支持");
            }
            // 方法太多，懒得写
        }

    }
}
