package jdk.jdk8.lambda;

import org.junit.Test;

import java.util.Comparator;

/**
 * 学习lambda表示式，先要熟悉匿名内部类。
 * lambda表达式又称闭包或匿名函数，如果想把一块代码赋给一个Java变量。
 * 1、举例：Comparator<Integer> a = (c1, c2) -> Integer.compare(c1, c2);
 * 2、格式：lambda操作符或箭头符号；左边时lambda形参列表（抽象方法参数列表）；右边是lambda体（抽象方法体）
 * 3、lambda表达式的本质：是作为[函数式接口]的实例！！！
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class Lambda01 {
    private static void fun01(Movable01 movable01) {
        movable01.move();
    }

    interface Movable01 {
        void move();
    }

    @Test
    public void lambda() {
        // 接口是不能直接new对象的
        Lambda01.fun01(new Movable01() {
            @Override
            public void move() {
                System.out.println("熟悉匿名内部类...");
            }
        });
        // lambda表达式
        Movable01 movable01 = () -> System.out.println("");
    }

    @Test
    public void runnable1() {
        // 接口的new其实是具体对象的实例化
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Runnable runnable = () -> System.out.println("java");
    }

    @Test
    public void runnable2() {
        Thread thread = new Thread(() -> System.out.println(this.getClass()));
        thread.start();
    }

    @Test
    public void comparable01() {
        Comparator<Integer> a = (c1, c2) -> {
            return Integer.compare(c1, c2);
        };
        System.out.println(a.compare(1, 2));
    }

    @Test
    public void comparable02() {
        Comparator<Integer> a = Integer::compare;
        System.out.println(a.compare(1, 2));
    }
}