package regex;

/**
 * project - 正则表达式
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/16 时间:15:21
 * @JDK 1.8
 * @Description 功能模块：
 */
public class MainRegex01 {
    public static void main(String[] args) {
        // Java中字符串本身就有转义
        System.out.println("\n");
        System.out.println("\\a");
        System.out.println("\\");
        // 简单认识正则表达
        System.out.println("111a".matches("...."));
        System.out.println("a258s4r".replaceAll("\\d", "a"));
    }
}