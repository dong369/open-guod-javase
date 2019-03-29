package ch02_data.string;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/2 时间:8:57
 * @JDK 1.8
 * @Description 功能模块：
 */
public class StringTest01 {
    public static void main(String[] args) {
        String str = "41011637230102099080";
        // 从0开始截取3位
        System.out.println(str.substring(0, 3));
        // 从0开始截取后两位
        System.out.println(str.substring(0, str.length() - 2));
        // 字符串是否包含
        int i = str.indexOf(2);
        char c = str.charAt(9);
        System.out.println(c);
        System.out.println(i);
        System.out.println(str.contains("41011637220"));
        // 拼接字符串
        System.out.println(str.concat("java"));
        // 用于字符串中子串的查找
        Integer integer = Integer.valueOf("123456");
        System.out.println(integer);
        // 从内部池获取
        String a = "aaa";
        String intern = a.intern();
        System.out.println(a.equals(intern));

    }
}