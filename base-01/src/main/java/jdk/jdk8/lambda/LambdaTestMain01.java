package jdk.jdk8.lambda;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:12
 * @JDK 1.8
 * @Description 功能模块：学习lambda表示式，先要熟悉匿名内部类
 */
public class LambdaTestMain01 {
    public static void main(String[] args) {
        LambdaTestMain01.fun01(new Movable01() {
            @Override
            public void move() {
                System.out.println("熟悉匿名内部类");
            }
        });
    }

    public static void fun01(Movable01 movable01) {
        movable01.move();
    }
}

interface Movable01 {
    void move();
}
