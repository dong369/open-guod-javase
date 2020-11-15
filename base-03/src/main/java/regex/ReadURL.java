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
 */
public class ReadURL {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.jianshu.com/p/e2c9cb70fb70");
        InputStream inputStream = url.openStream();
        InputStreamReader is = new InputStreamReader(inputStream);
        BufferedReader bf = new BufferedReader(is);
        String lin;
        while ((lin = bf.readLine()) != null) {
            parse(lin);
        }
    }

    private static void parse(String lin) {
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(com|net|org|edu)");
        Matcher matcher = pattern.matcher(lin);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
