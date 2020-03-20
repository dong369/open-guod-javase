package ch02_data.enums;

/**
 * 枚举类型，用法一：常量
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/14 时间:13:11
 * @JDK 1.8
 */
public enum EnumMain01 {
    RED,
    GREEN,
    BLANK,
    YELLOW;

    public static void main(String[] args) {
        System.out.println(EnumMain01.RED);
    }
}