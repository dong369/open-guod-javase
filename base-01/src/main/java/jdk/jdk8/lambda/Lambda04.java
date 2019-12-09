package jdk.jdk8.lambda;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:21
 * @JDK 1.8
 * @Description 功能模块：数据类型可以省略，可以由编译器推动得出。
 */
public class Lambda04 {
    public static void main(String[] args) {
        int i = Lambda04.fun04((a, b) -> {
            b++;
            return a + b;
        }, 1, 3);
        System.out.println(i);
    }

    private static int fun04(Movable04 movable04, int a, int b) {
        return movable04.move(a, b);
    }
}

interface Movable04 {
    int move(int a, int b);
}
