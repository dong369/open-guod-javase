package regex;

/**
 * project - 正则表达式
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/16 时间:17:49
 * @JDK 1.8
 * @Description 功能模块：POSIX character classes (US-ASCII only)和边界匹配
 */
public class MainRegex05 {
    public static void main(String[] args) {
        // POSIX character classes
        System.out.println("a".matches("\\p{Lower}"));
        // 以什么开头的
        System.out.println("hello world".matches("^h.*"));
        // 以什么结尾的
        System.out.println("hello world".matches(".*ld$"));
        System.out.println(" ".matches("."));
        //
        System.out.println("hello world".matches("^h[a-z]{1,3}o\\b.*"));
        System.out.println("helloworld".matches("^h[a-z]{1,3}o\\b.*"));
    }
}
