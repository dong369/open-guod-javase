package ch02_data.bitoperation;

import org.junit.Test;

import javax.xml.bind.DatatypeConverter;

/**
 * [二进制]、八进制、十进制、十六进制
 * 在Java语言中，二进制数使用补码表示，最高位为符号位，正数的符号位为0，负数为1。
 * 原码：原码就是符号位加上真值的绝对值, 即用第一位表示符号, 其余位表示值. 比如如果是8位二进制。
 * 反码：正数的反码是其本身，负数的反码是在其原码的基础上, 符号位不变，其余各个位取反。
 * 补码：正数的补码就是其本身，负数的补码是在其原码的基础上, 符号位不变, 其余各位取反, 最后+1. (即在反码的基础上+1)
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class BinaryUse {
    // 二进制、八进制
    @Test
    public void binary() {
        // 左移运算符，num << 1，相当于num乘以2
        System.out.println(2 << 3);
        // 右移运算符，num >> 1，相当于num除以2
        System.out.println(8 >> 2);
        // 无符号右移，忽略符号位，空位都以0补齐
        System.out.println(8 >>> 2);
        // 打印字节数组
        byte[] bytes = new byte[1];
        System.out.println(DatatypeConverter.printHexBinary(bytes));
        Long i = 1111111111111111111L;
        System.out.println("1".toCharArray().length);
    }
}
