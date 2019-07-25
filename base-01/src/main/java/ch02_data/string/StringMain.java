package ch02_data.string;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/2 时间:8:57
 * @JDK 1.8
 * @Description 功能模块：String、StringBuffer、StringBuilder
 */
public class StringMain {
    public static void main(String[] args) {
        String s = new String("45678");
        String str = "41011637230102099080";
        // 从0开始截取3位
        System.out.println(str.substring(0, 3));
        // 从0开始截取后两位
        System.out.println(str.substring(0, str.length() - 2));
        // 字符串是否包含
        int i = str.indexOf("163");
        System.out.println("indexOf：" + i);
        char c = str.charAt(9);
        System.out.println("charAt：" + c);
        System.out.println("contains：" + str.contains("0102"));
        // 拼接字符串
        System.out.println(str.concat("java"));
        // 用于字符串中子串的查找
        Integer integer = Integer.valueOf("123456");
        System.out.println(integer);
        // 从内部池获取
        String a = "aaa";
        String intern = a.intern();
        System.out.println(a.equals(intern));
        System.out.println('a' - 'B');

        strBuffer("0");
        strBuider("0");
    }

    /**
     * 区别1：线程安全
     * 区别2：缓冲区
     * 区别3：性能
     */
    private static void strBuffer(String s) {
        StringBuffer sb = new StringBuffer("123");
        System.out.println(sb.append(456).toString());
    }

    private static void strBuider(String s) {
        StringBuilder sb = new StringBuilder("123");
        System.out.println(sb.append("456"));
    }
}