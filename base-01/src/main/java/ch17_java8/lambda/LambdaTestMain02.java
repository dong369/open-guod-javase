package ch17_java8.lambda;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:13:54
 * @JDK 1.8
 * @Description 功能模块：取代匿名内部类的方式lambda表达式
 */
public class LambdaTestMain02 {
    public static void main(String[] args) {
        LambdaTestMain02.fun(() -> System.out.println("lambda表达式"));
    }

    public static void fun(Movable02 movable02) {
        movable02.move();
    }
}

interface Movable02 {
    void move();
}