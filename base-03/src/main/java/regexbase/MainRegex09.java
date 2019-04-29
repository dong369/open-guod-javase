package regexbase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * project - 正则表达式
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/16 时间:21:26
 * @JDK 1.8
 * @Description 功能模块：输出查找到子串的开始和结束位置
 */
public class MainRegex09 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{3,5}");
        String s = "123-34345-234-00";
        Matcher matcher = pattern.matcher(s);
        // matches永远匹配的是整个字符串（前面匹配将不会被下面识别）
        System.out.println(matcher.matches());
        // 重新从头开始匹配
        matcher.reset();
        // find找到一个子串
        System.out.println(matcher.find());
        System.out.println(matcher.start() + "-" + matcher.end());
        System.out.println(matcher.find());
        System.out.println(matcher.start() + "-" + matcher.end());
        System.out.println(matcher.find());
        System.out.println(matcher.start() + "-" + matcher.end());
        System.out.println(matcher.find());
        // lookingAt每次都从头部开始找
        System.out.println(matcher.lookingAt());
        System.out.println(matcher.lookingAt());
        System.out.println(matcher.lookingAt());
        System.out.println(matcher.lookingAt());
    }
}
