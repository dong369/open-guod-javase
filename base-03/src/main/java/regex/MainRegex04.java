package regex;

/**
 * \：将下一个字符标记为一个特殊字符、或一个原义字符、或一个 向后引用、或一个八进制转义符。
 * \s：匹配任何空白字符，包括空格、制表符、换页符等等。等价于[ \f\n\r\t\v]
 * \S：匹配任何非空白字符。等价于[^ \f\n\r\t\v]
 * \d：匹配一个数字字符。等价于[0-9]
 * \D：匹配一个非数字字符。等价于[^0-9]
 * \w：匹配字母、数字、下划线。等价于[A-Za-z0-9_]
 * \W：匹配非字母、数字、下划线。等价于[^A-Za-z0-9_]
 *
 * @author guodd
 * @version 3.0
 */
public class MainRegex04 {
    public static void main(String[] args) {
        //
        System.out.println(" \n\t\r".matches("\\s{4}"));
        System.out.println("1111".matches("\\d{4}"));
        System.out.println("aaa".matches("\\w*"));
        System.out.println("\\".matches("\\\\"));

        System.out.println("==范围==");
        // 范围
        System.out.println("a".matches("[abc]"));
        System.out.println("b".matches("[^abc]"));
        System.out.println("c".matches("[a-z]"));
        System.out.println("d".matches("[a-zA-Z]"));
        System.out.println("D".matches("[a-z]|[A-Z]]"));
        System.out.println("dD".matches("[a-z][A-Z]]"));

        // 并交差
        System.out.println("e".matches("[a-z[A-Z]]"));
        System.out.println("f".matches("[a-z&&[efg]]"));
        System.out.println("g".matches("[a-f&&[^bc]]"));
    }
}
