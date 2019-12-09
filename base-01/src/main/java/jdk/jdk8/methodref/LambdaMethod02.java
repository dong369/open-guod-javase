package jdk.jdk8.methodref;

/**
 * project - lambda表达式
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:35
 * @JDK 1.8
 * @Description 功能模块：特定对象的实例方法引用
 * 语法格式：实例化对象::普通方法（x->x.toString()）
 */
public class LambdaMethod02 {
    public static void main(String[] args) {
        Method02<String> runnable = () -> "hello".toUpperCase();
        String upper = runnable.upper();
        System.out.println(upper);
        // String类的toUpperCase()定义：

        Method02<String> msg = "hello"::toUpperCase;
        String s = msg.upper();
        System.out.println(s);
    }
}

/**
 * @param <R>引用方法的返回类型
 */
interface Method02<R> {
    R upper();
}
