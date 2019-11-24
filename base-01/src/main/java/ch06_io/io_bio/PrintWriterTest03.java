package ch06_io.io_bio;

import java.io.*;
import java.util.Date;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/10 时间:15:48
 * @JDK 1.8
 * @Description 功能模块：打印流
 */
public class PrintWriterTest03 {
    public static void main(String[] args) {
        // 一个管道放在标准输入上（键盘上，等待输入）
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileWriter fw = new FileWriter(System.getProperty("user.dir") + "/base-01/src/main/java/ch06_io/io_bio/use.txt", true);
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
