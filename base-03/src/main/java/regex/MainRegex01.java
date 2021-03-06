package regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 认识转义字符和正则表达式regex
 *
 * @author guodd
 * @version 1.0
 * 1、转义字符有什么用？（01避免一个字符表示两个意思；02表示键盘上的特殊按键）
 * 2、转义字符是什么？（01类型-属于一种字符；02模型-贴标签）
 * 3、正则表达式是什么？（定义一个搜索模式的字符串，由元字符或转义字符+元字符组成）
 * <p>
 * 用途：字符串匹配（字符匹配）；字符串查找；字符串替换
 * {@link java.util.regex.Pattern}，要符合的模式
 * {@link java.util.regex.Matcher}，用这个模式匹配产生的结果
 * <p>
 * \：将下一个字符标记为一个特殊字符、或一个原义字符、或一个后向引用、或一个八进制转义符。
 */
public class MainRegex01 {
    @Test
    public void initRegex() {
        Pattern compile = Pattern.compile("\\d{2,3}");
        Matcher matcher = compile.matcher("2333331");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println(matcher.matches());
    }

    @Test
    public void main() {
        // 01、Java中字符串本身就有转义
        System.out.println(".");
        System.out.println("\\.");
        System.out.println("\"");
        System.out.println("\\");
        System.out.println("\\\\");
        System.out.println("\n");
        System.out.println("\\a");
        System.out.println("==========简单认识正则表达===========");

        // 02、简单认识正则表达
        System.out.println("a".matches("."));
        System.out.println(".".matches("\\."));
        System.out.println("hello 6!".replaceAll("\\d", "java"));

        // 3出现0次或1次
        print("22".matches("223?"));
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}