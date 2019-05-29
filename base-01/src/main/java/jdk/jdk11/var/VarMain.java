package jdk.jdk11.var;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/5/28 时间:16:26
 * @JDK 1.8
 * @Description 功能模块：
 */
public class VarMain {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("u");
            System.out.println("t");
        }).start();
    }
}
