package regex;

import org.junit.Test;

/**
 * 初步认识.、*、+、？、[]只匹配一个字符
 * 当该字符紧跟在任何一个其他限制符 (*, +, ?, {n}, {n,}, {n,m}) 后面时，匹配模式是非贪婪的。
 *
 * @author guodd
 * @version 1.0
 */
public class MainRegex03 {
    /**
     * .：匹配一个字符
     * *：匹配0个或多个
     * +：匹配1个或多个
     * ？：匹配0个或1个（当该字符紧跟在任何一个其他限制符 (*, +, ?, {n}, {n,}, {n,m}) 后面时，匹配模式是非贪婪的）
     * 非贪婪模式尽可能少的匹配所搜索的字符串，而默认的贪婪模式则尽可能多的匹配所搜索的字符串。例如，对于字符串 "oooo"，'o+?' 将匹配单个 "o"，而 ‘o+' 将匹配所有 ‘o'。
     * {n,m}：匹配确定的次数
     */
    @Test
    public void main() {
        print("a".matches(".")); // true，一个字符
        print("aa".matches("aa")); // true，正常字符
        print("".matches("[a]*")); // true，0个或多个
        print("aaa".matches("[a]*")); // true
        print("aaa".matches("[a]+")); // true，1个或多个

        System.out.println("==五个都为true==");

        // 当该字符紧跟在任何一个其他限制符（*，+，{n}，{n,}，{n,m}）后面时，匹配模式是非贪婪的。
        print("aaa".matches("[a]?")); // 1个或0个
        print("".matches("0?(13|14|15|17|18)[0-9]{9}"));
        print("3425432543535345".matches("\\d{3,66}"));
        print("192.168.1.a".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
        print("192".matches("[0-1][0-9][0-2]"));
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
