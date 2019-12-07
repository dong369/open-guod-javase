package ch02_money;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/17 时间:11:06
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MoneyMain01 {
    public static void main(String[] args) {
        // 01、BigInteger整数处理
        BigInteger bigInteger01 = new BigInteger("99");
        BigInteger bigInteger02 = BigInteger.valueOf(2);
        System.out.println(bigInteger01.add(bigInteger02));
        System.out.println(bigInteger01.subtract(bigInteger02));
        System.out.println(bigInteger01.multiply(bigInteger02));
        System.out.println(bigInteger01.divide(bigInteger02));

        // 02、BigDecimal
        BigDecimal bigDecimal01 = BigDecimal.valueOf(0.1);
        BigDecimal bigDecimal02 = BigDecimal.valueOf(0.03);
        System.out.println(bigDecimal01.add(bigDecimal02));
        System.out.println(bigDecimal01.subtract(bigDecimal02));
        System.out.println(bigDecimal01.multiply(bigDecimal02));
        System.out.println(bigDecimal01.divide(bigDecimal02, BigDecimal.ROUND_HALF_UP));

        // 03、BigDecimal小数精度
        double aa = 0.001;
        // BigDecimal(double val)构造，但是这个构造不太靠谱；
        // 推荐使用静态方法valueOf(double)，这个方法跟new Decimal(Double.toString(double))效果
        System.out.println("BigDecimal(double val)构造会出现精度丢失问题：" + new BigDecimal(aa));
        System.out.println("BigDecimal.valueOf推荐使用：" + BigDecimal.valueOf(aa));

        // 浮点数
        BigDecimal bigDecimal = new BigDecimal("12.369");
        BigDecimal bigDecimalCompare = new BigDecimal("12.36");
        System.out.println(bigDecimal.add(BigDecimal.valueOf(aa)));

        // 大小比较
        if (bigDecimal.compareTo(bigDecimalCompare) >= 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }

        // 数据格式（保留小数）
        double goodPriceDetail = (130 / (1 + 16 / 100.00));
        System.out.println(goodPriceDetail);
        // 方式01
        System.out.println(Double.valueOf(String.format("%.4f", goodPriceDetail)));
        // 方式02
        DecimalFormat decimalFormat = new DecimalFormat("#.0000");
        System.out.println(decimalFormat.format(goodPriceDetail));
        // 方式03（推荐使用）
        double f = 111231.5585;
        BigDecimal b = new BigDecimal(f);
        double f1 = b.setScale(4, RoundingMode.HALF_UP).doubleValue();
        System.out.println(f1);

        // 数据库中的金钱使用Long类型存储，并且单位是分，
        long a = 100;
        BigDecimal bigDecimalFen = new BigDecimal(a);
        BigDecimal divide = bigDecimalFen.multiply(new BigDecimal("100.969"));
        System.out.println(divide);
        System.out.println(divide.longValue());
        long intValue = divide.longValue();
        long intValuePay = divide.longValue();
        // 进行客户的扣款（宁愿多扣，不能少扣）
        if (divide.compareTo(new BigDecimal(intValue)) > 0) {
            intValue++;
        }
        // 进行客户的支付（人不为己，天诛地灭）
        if (divide.compareTo(new BigDecimal(intValue)) > 0) {
            intValuePay--;
        }
        System.out.println("实际扣款的钱数：" + intValue);
        System.out.println("实际支付的钱数：" + intValuePay);
    }
}