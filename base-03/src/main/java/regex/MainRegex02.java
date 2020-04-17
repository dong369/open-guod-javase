package regex;


import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 模式匹配正则表达式
 *
 * @author guodd
 * @version 3.0
 */
public class MainRegex02 {
    @Test
    public void regex01() {
        // 匹配规则（Pattern是编译好的模式，用起来快点）
        Pattern pattern = Pattern.compile("[a-z]*");
        // 匹配某个字符串（Matcher是这个模式匹配后产生的结果集）
        Matcher matcher1 = pattern.matcher("");
        Matcher matcher2 = pattern.matcher("abc");
        // 打印匹配结果
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
    }

    @Test
    public void regex() {
        Pattern pattern = Pattern.compile(".");
        Matcher matcher = pattern.matcher("1");
        System.out.println(pattern.matcher("/").matches());
    }
}
