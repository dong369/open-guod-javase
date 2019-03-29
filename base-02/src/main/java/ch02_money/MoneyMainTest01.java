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
public class MoneyMainTest01 {
    public static void main(String[] args) {
        // 整数
        BigInteger bigInteger = new BigInteger("1");
        System.out.println(bigInteger.add(new BigInteger("12")));

        double aa = 0.001;

        // BigDecimal(double val)构造，但是这个构造不太靠谱；推荐使用静态方法valueOf(double)，这个方法跟new Decimal(Double.toString(double))效果
        System.out.println(new BigDecimal(aa));
        System.out.println(BigDecimal.valueOf(aa));

        // 浮点数
        BigDecimal bigDecimal = new BigDecimal("12.369");
        System.out.println(bigDecimal.add(BigDecimal.valueOf(aa)));
        BigDecimal bigDecimalCompare = new BigDecimal("12.36");

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
        // 方式03
        double f = 111231.5585;
        BigDecimal b = new BigDecimal(f);
        double f1 = b.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}