package jdk.jdk8.lambda;

import org.junit.Test;

/**
 * 取代匿名内部类的方式lambda表达式，无参，无返回值。
 * lambda表达式的本质是作为函数式接口的实例！！！
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class Lambda02 {
    private static void fun(Movable02 movable02) {
        movable02.move();
    }
    
    @Test
    public void main() {
        Lambda02.fun(
                () -> {
                    System.out.println("lambda表达式");
                }
        );
    }
}

@FunctionalInterface
interface Movable02 {
    void move();
}