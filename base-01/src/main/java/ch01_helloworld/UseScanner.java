package ch01_helloworld;

import java.util.Scanner;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/4 时间:9:53
 * @JDK 1.8
 * @Description 功能模块：
 */
public class UseScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String i = scanner.next();
        System.out.println(i);
    }
}