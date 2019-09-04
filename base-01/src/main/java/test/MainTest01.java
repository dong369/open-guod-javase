package test;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/12/17 时间:13:48
 * @JDK 1.8
 * @Description 功能模块：测试方法测试
 */
public class MainTest01 {
    public static void main(String[] args) {
        int i = 0;
        i = i++ + ++i;
        System.out.println(i);
    }

    public static <T> T test(T t) {
        return t;
    }

}
