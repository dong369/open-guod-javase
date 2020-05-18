package ch14_network.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * {@link URL}统一资源定位符，能够准确的定位资源的位置，包含了访问互联网上的资源（文件、目录）的方式和位置。
 * 类似于人的家庭地址。同样，他也可以标示出一个独一无二的资源。
 * https://www.elastic.co/guide/en/elasticsearch/hadoop/current/hive.html?
 * 协议://hostname:port/
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class UrlMainTest {
    public static void main(String[] args) throws IOException {
        // 方法一
        URL url = new URL("http://www.sina.com.cn");
        URLConnection urlCon1 = url.openConnection();
        urlCon1.setRequestProperty("Range", "byte=0-2");
        System.out.println(urlCon1.getContentLength());
        System.out.println(urlCon1.getContentType());
        System.out.println(urlCon1.getHeaderFields());
        InputStream is1 = urlCon1.getInputStream();

        // 方法二
        URL url2 = new URL("http://www.yhfund.com.cn");
        HttpURLConnection urlCon2 = (HttpURLConnection) url2.openConnection();
        InputStream is2 = urlCon2.getInputStream();

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
