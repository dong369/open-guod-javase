package regex;

/**
 * POSIX character classes (US-ASCII only)和边界匹配
 *
 * @author guodd
 * @version 3.0
 */
public class MainRegex05 {
    public static void main(String[] args) {
        // POSIX character classes，时Unix标准
        System.out.println("a".matches("\\p{Lower}"));
        // 以什么开头的
        System.out.println("hello world".matches("^h.*"));
        // 以什么结尾的
        System.out.println("hello world".matches(".*ld$"));
        System.out.println(" ".matches("."));
        // \\b单词的边界
        System.out.println("hello world".matches("^h[a-z]{1,3}o\\b.*"));
        System.out.println("helloworld".matches("^h[a-z]{1,3}o\\b.*"));
    }
}
