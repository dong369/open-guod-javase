package regexbase;

/**
 * project - 正则表达式
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/16 时间:17:49
 * @JDK 1.8
 * @Description 功能模块：正则表达式的范围：
 */
public class MainRegex04 {
    public static void main(String[] args) {
        System.out.println(" \n\t\r".matches("\\s{4}"));
        System.out.println("1111".matches("\\d{4}"));
        System.out.println("\\".matches("\\\\"));
    }
}
