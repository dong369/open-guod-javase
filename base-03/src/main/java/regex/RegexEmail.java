package regex;

/**
 * 匹配email
 *
 * @author guodd
 * @version 3.0
 */
public class RegexEmail {
    public static void main(String[] args) {
        System.out.println("10079fsdfsd16121@qq.com".matches("[\\w0-9]+@qq\\.com"));
        System.out.println("188@162.com".matches("[\\w[-.]]+@[\\w[-.]]+\\.[\\w]+"));
    }
}
