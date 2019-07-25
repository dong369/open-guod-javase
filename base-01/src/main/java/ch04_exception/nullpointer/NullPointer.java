package ch04_exception.nullpointer;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/22 时间:16:24
 * @JDK 1.8
 * @Description 功能模块：
 */
public class NullPointer {
    public static void main(String[] args) {
        String s = null;
        assert s == null;
        System.out.println("assert");
    }
}
