package ch06_io.io_bio;

import java.io.*;
import java.util.Date;

/**
 * 打印流是输出信息最方便的类，注意包含字节打印流：PrintStream和字符打印流：PrintWriter。
 * 打印流提供了非常方便的打印功能，可以打印任何类型的数据信息，例如：小数，整数，字符串。
 * PrintStream和PrintWriter的输出不会抛出IOException异常。
 * PrintStream和PrintWriter有自动flush功能。
 * PrintStream 打印的所有字符都使用平台的默认字符编码转换为字节。 在需要写入字符而不是写入字节的情况下，应该使用 PrintWriter 类。
 * System.out返回的是PrintStream的实例。
 *
 * @author guodd
 * @version 3.0
 * @since 1.8
 */
public class PrintWriter01 {
    public static void main(String[] args) {
        // 一个管道放在标准输入上（键盘上，等待输入）
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileWriter fw = new FileWriter(System.getProperty("user.dir")
                                           + "/base-01/src/main/java/ch06_io/io_bio/use.txt", true);
            PrintWriter log = new PrintWriter(fw);
            while ((s = br.readLine()) != null) {
                if (s.equals("exit")) {
                    break;
                }
                log.println("-----------------------");
                log.println(s);
                log.flush();
            }
            log.println(new Date());
            log.flush();
            log.close();
            fw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
