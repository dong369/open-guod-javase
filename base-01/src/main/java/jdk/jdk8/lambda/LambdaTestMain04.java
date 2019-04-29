package jdk.jdk8.lambda;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:21
 * @JDK 1.8
 * @Description 功能模块：简单的计算表达式
 */
public class LambdaTestMain04 {
    public static void main(String[] args) {

        int i = LambdaTestMain04.fun04((a, b) -> {
            b++;
            int c = a + b;
            return c;
        }, 1, 3);
        System.out.println(i);
    }

    public static int fun04(Movable04 movable04, int a, int b) {
        int move = movable04.move(a, b);
        return move;
    }
}

interface Movable04 {
    int move(int a, int b);
}
