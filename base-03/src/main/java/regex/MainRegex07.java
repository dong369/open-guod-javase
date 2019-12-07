package regex;

/**
 * project - 正则表达式
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/16 时间:21:08
 * @JDK 1.8
 * @Description 功能模块：匹配email
 */
public class MainRegex07 {
    public static void main(String[] args) {
        System.out.println("10079fsdfsd16121@qq.com".matches("[\\w0-9]+@qq\\.com"));
        System.out.println("188@162.com".matches("[\\w[-.]]+@[\\w[-.]]+\\.[\\w]+"));
    }
}
