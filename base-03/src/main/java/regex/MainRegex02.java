package regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * project - 正则表达式
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/16 时间:17:05
 * @JDK 1.8
 * @Description 功能模块：Pattern、Matcher
 */
public class MainRegex02 {
    public static void main(String[] args) {
        // 匹配规则（Pattern是编译好的模式，用起来快点）
        Pattern pattern = Pattern.compile("[a-z]*");
        // 匹配某个字符串（Matcher是这个模式匹配后产生的结果集）
        Matcher matcher1 = pattern.matcher("");
        Matcher matcher2 = pattern.matcher("abc");
        // 打印匹配结果
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
    }
}
