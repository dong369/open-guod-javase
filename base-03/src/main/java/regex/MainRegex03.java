package regex;

/**
 * 初步认识.、*、+、？、[]只匹配一个字符
 * 当该字符紧跟在任何一个其他限制符 (*, +, ?, {n}, {n,}, {n,m}) 后面时，匹配模式是非贪婪的。
 *
 * @author guodd
 * @version 3.0
 */
public class MainRegex03 {
    public static void main(String[] args) {
        // 匹配一个字符
        print("a".matches(".")); // true
        print("aa".matches("aa")); // true
        print("".matches("[a]*")); // true
        print("aaa".matches("[a]*")); // true
        print("aaa".matches("[a]+")); // true

        System.out.println("==五个都为true==");

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
