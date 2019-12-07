package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/17 时间:9:53
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainRegex12 {
    public static void main(String[] args) {
        // 要验证的字符串
        String str = "18838177689@163.com";
        // 邮箱验证规则
        String regEx = "([\\w[-.]]+)@(\\w+)\\.(\\w+)";
        // 用户名：^[A-Za-z][A-Za-z1-9_-]+$
        // 手机号码：^1[3|4|5|8][0-9]\d{8}$
        // 邮政编码：^[1-9]\d{5}$
        // QQ号码：^[1-9]\d{4,10}$
        // 18位身份证号：^(\d{6})(18|19|20)?(\d{2})([01]\d)([0123]\d)(\d{3})(\d|X|x)?$
        // URL：^((http|https)://)?([\w-]+.)+[\w-]+([\w-.?%&=]*)?$

        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
        // 字符串是否与正则表达式相匹配
        boolean rs = matcher.matches();
        System.out.println(rs);
    }
}
