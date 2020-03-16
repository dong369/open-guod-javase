package ch06_io.io_bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 转换流
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/10 时间:15:20
 * @since 1.8
 */
public class TransForm02 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s;
        try {
            s = br.readLine();
            while (s != null) {
                if (s.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println(s.toUpperCase());
                s = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
