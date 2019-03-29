package ch02_data.number;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/24 时间:11:25
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Process {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static String test() {
        if (true)
            return "省略";
        return "返回";
    }
}