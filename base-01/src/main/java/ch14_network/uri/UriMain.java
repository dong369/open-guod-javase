package ch14_network.uri;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

/**
 * URI：统一资源标识符，能够独一无二的表示一个资源，包含了访问的方式和位置还有该资源。类似于人的身份证号。
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019年1月6日 时间:上午11:58:21
 * @since 1.8
 */
public class UriMain {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("https://www.jianshu.com/p/5bfa03256d66");
        URL url = uri.toURL();
        InputStream in = url.openStream();
        InputStreamReader is = new InputStreamReader(in);
        BufferedReader bf = new BufferedReader(is);
        String line;
        while ((line = bf.readLine()) != null) {
            System.out.println(line);
        }
    }
}
