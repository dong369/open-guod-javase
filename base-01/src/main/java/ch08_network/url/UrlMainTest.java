package ch08_network.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * project - 网络编程
 * 统一资源定位符，能够准确的定位资源的位置，包含了访问的方式和位置。
 * 类似于人的家庭地址。同样，他也可以标示出一个独一无二的资源。
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/15 时间:16:22
 * @since 1.8
 */
public class UrlMainTest {
    public static void main(String[] args) throws IOException {
        // 方法一
        URL url = new URL("http://www.sina.com.cn");
        URLConnection urlcon1 = url.openConnection();
        InputStream is1 = urlcon1.getInputStream();

        // 方法二
        URL url2 = new URL("http://www.yhfund.com.cn");
        HttpURLConnection urlcon2 = (HttpURLConnection) url2.openConnection();
        InputStream is2 = urlcon2.getInputStream();

        //方法三
        URL url3 = new URL("http://www.yhfund.com.cn");
        InputStream is3 = url.openStream();


        // 获取输入流
        InputStream inputStream = new URL("http://www.baidu.com").openStream();
        // 转换流
        InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        // 缓冲流
        BufferedReader bufferedReader = new BufferedReader(isr);
        String n;
        while (null != (n = bufferedReader.readLine())) {
            System.out.print(n);
        }
        bufferedReader.close();
    }
}
