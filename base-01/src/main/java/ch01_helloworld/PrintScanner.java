package ch01_helloworld;

import cn.hutool.crypto.SecureUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 2020/2/25
 * @since 1.8
 */
public class PrintScanner {
    public static void main(String[] args) throws Exception {
        // 方式一
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());
        // 方法2：通过BufferedReader
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(input.readLine());
        System.out.println(SecureUtil.md5("java"));
    }
}
