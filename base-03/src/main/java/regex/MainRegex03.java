package regex;

/**
 * project - 正则表达式
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/16 时间:17:29
 * @JDK 1.8
 * @Description 功能模块：初步认识.、*、+、？、[]只匹配一个字符
 */
public class MainRegex03 {
    public static void main(String[] args) {
        // 匹配一个字符
        print("a".matches("."));
        print("aa".matches("aa"));
        print("".matches("[a]*"));
        print("aaa".matches("[a]*"));
        print("aaa".matches("[a]+"));
        // 当该字符紧跟在任何一个其他限制符（*，+，{n}，{n,}，{n,m}）后面时，匹配模式是非贪婪的。
        print("aaa".matches("[a]?"));
        print("".matches("0?(13|14|15|17|18)[0-9]{9}"));
        print("3425432543535345".matches("\\d{3,66}"));
        print("192.168.1.a".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
        print("192".matches("[0-1][0-9][0-2]"));
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
