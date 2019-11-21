package ch01_helloworld;

import cn.hutool.crypto.SecureUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/4 时间:9:53
 * @JDK 1.8
 * @Description 功能模块：常用的两种键盘输入
 */
public class UseScanner {
    public static void main(String[] args) throws IOException {
        // 方法1：通过 Scanner
        Scanner scanner = new Scanner(System.in);
        String i = scanner.next();
        System.out.println(i);
        // 方法2：通过 BufferedReader
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(input.readLine());
        System.out.println(SecureUtil.md5("java"));
    }
}