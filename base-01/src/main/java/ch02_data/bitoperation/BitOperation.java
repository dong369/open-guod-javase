package ch02_data.bitoperation;

import org.junit.Test;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class BitOperation {
    // 原码、反码、补码
    // 正数：原码、反码、补码都一样，皆为该数的二进制表示法(同无符号数差不多)
    // 负数：原码加符号位；反码除符号位取反；补码是反码加一
    @Test
    public void convert() {
        //
        System.out.println(4 >> 2);
    }

    // 按 位 与 &
    @Test
    public void test() {
        int a = 4; // 000 0100
        int b = 5; // 0000 0101
        int c = -4;// 1000 0100获取补码进行运算
        // 0000 0100
        System.out.println(a & b);
    }
}
