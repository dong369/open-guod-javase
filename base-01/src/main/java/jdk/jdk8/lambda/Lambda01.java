package jdk.jdk8.lambda;

import org.junit.Test;

/**
 * project - lambda表达式的本质是作为函数式接口的实例！！！
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:12
 * @JDK 1.8
 * @Description 功能模块：学习lambda表示式，先要熟悉匿名内部类。
 * lambda表达式又称闭包或匿名函数。
 * 如果想把“一块代码”赋给一个Java变量。
 */
public class Lambda01 {
    public static void main(String[] args) {
        Lambda01.fun01(new Movable01() {
            @Override
            public void move() {
                System.out.println("熟悉匿名内部类");
            }
        });
    }

    private static void fun01(Movable01 movable01) {
        movable01.move();
    }

    @Test
    public void runnable1() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(this.getClass());
            }
        };
        r.run();
    }

    @Test
    public void runnable2() {
        Runnable r = () -> System.out.println(this.getClass());
        r.run();
    }
}

interface Movable01 {
    void move();
}
