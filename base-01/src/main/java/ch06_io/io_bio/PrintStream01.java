package ch06_io.io_bio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

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
 * @date 日期:2018/6/10 时间:15:48
 * @since 1.8
 */
public class PrintStream01 {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(
                    System.getProperty("user.dir") + "/base-01/src/main/java/ch06_io/io_bio/usePrint.txt");
            ps = new PrintStream(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (ps != null) {
            System.setOut(ps);
        }
        int b = 0;
        for (char c = 0; c <= 60000; c++) {
            System.out.print(c + " ");
            if (b++ >= 100) {
                System.out.println();
                b = 0;
            }
        }
    }
}
