package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * project - 正则表达式
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/16 时间:21:45
 * @JDK 1.8
 * @Description 功能模块：字符串的替换
 */
public class MainRegex10 {
    public static void main(String[] args) {
        // 忽略大小写
        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("javaJAVA Java jva JAVA jAVA KVA45475");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        StringBuffer buff = new StringBuffer();
        int i = 0;
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
