package regex;

/**
 * project - 正则表达式
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/16 时间:17:49
 * @JDK 1.8
 * @Description 功能模块：\s、\d、\w、\
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
