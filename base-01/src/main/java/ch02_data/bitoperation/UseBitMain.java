package ch02_data.bitoperation;

import javax.xml.bind.DatatypeConverter;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/7 时间:12:52
 * @JDK 1.8
 * @Description 功能模块：在Java语言中，二进制数使用补码表示，最高位为符号位，正数的符号位为0，负数为1。
 */
public class UseBitMain {
    public static void main(String[] args) {
        // 左移运算符，num << 1,相当于num乘以2
        System.out.println(2 << 3);
        // 右移运算符，num >> 1,相当于num除以2
        System.out.println(8 >> 2);
        // 无符号右移，忽略符号位，空位都以0补齐
        System.out.println(8 >>> 2);
        // 打印字节数组
        byte[] bytes = new byte[12];
        System.out.println(DatatypeConverter.printHexBinary(bytes));
    }
}
