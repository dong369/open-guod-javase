package regex;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/23 时间:17:54
 * @JDK 1.8
 * @Description 功能模块：
 */
public class ReadURL {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://blog.csdn.net/zzxian/article/details/6776548");
        InputStream inputStream = url.openStream();
        InputStreamReader is = new InputStreamReader(inputStream);
        BufferedReader bf = new BufferedReader(is);
        String lin;
        while ((lin = bf.readLine()) != null) {
            parse(lin);
        }
    }

    private static void parse(String lin) {
        Pattern pattern = Pattern.compile("^(https:\\/\\/)*\\w*");
        Matcher matcher = pattern.matcher(lin);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
