package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * project - 正则表达式
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/16 时间:22:01
 * @JDK 1.8
 * @Description 功能模块：正则分组，分组是小括号构成的
 */
public class MainRegex11 {
    public static void main(String[] args) {
        // 分了几个组：看有几个左大括号
        // Pattern pattern = Pattern.compile("(\\d{3,5}[a-z]{2})");
        Pattern pattern = Pattern.compile("(\\d{3,5})([a-z]{2})");
        String s = "123aa-3654bb-236cc-00";
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
    }
}
