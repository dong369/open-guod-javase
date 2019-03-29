package ch08_networks.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * project - 网络编程
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/15 时间:16:22
 * @JDK 1.8
 * @Description 功能模块：URI的作用像身份证号一样，URL的作用像家庭住址一样
 */
public class UrlMainTest {
    public static void main(String[] args) throws IOException {
        // 获取输入流
        InputStream inputStream = new URL("http://www.baidu.com").openStream();
        // 转换流
        InputStreamReader isr = new InputStreamReader(inputStream, "UTF-8");
        // 缓冲流
        BufferedReader bufferedReader = new BufferedReader(isr);
        String n;
        while (null != (n = bufferedReader.readLine())) {
            System.out.print(n);
        }
        bufferedReader.close();
    }
}
