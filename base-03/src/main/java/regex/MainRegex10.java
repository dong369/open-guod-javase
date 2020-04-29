package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串的替换
 *
 * @author guodd
 * @version 3.0
 */
public class MainRegex10 {
    public static void main(String[] args) {
        // 忽略大小写
        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("java Java JAVA jva JAVA jAVA KVA45475");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        StringBuffer buff = new StringBuffer();
        int i = 0;
        matcher.reset();
        while (matcher.find()) {
            i++;
            if (i % 2 == 0) {
                matcher.appendReplacement(buff, "java");
            } else {
                matcher.appendReplacement(buff, "JAVA");
            }
        }
        // 最后的加上
        matcher.appendTail(buff);
        System.out.println(buff);
    }
}
