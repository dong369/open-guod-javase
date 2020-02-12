package jdk.jdk8.methodref;

/**
 * 场景：当要传递给lambda体的操作，已经有实现的方法了，可以使用方法引用！！！
 * 方法引用的本质是lambda表达式，二lambda表达式作为函数式接口的实例，所以方法引用，也是函数式接口的实例！！！
 * 静态方法引用语法格式：类 :: 静态方法
 * <p>
 * R convert(P p);
 * static String valueOf(Object obj) {}
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:28
 * @since 1.8
 */
public class LambdaMethod01 {
    public static void main(String[] args) {
        // 即：将String.valueOf()方法转换成了Method01接口里面的convert方法
        Method01<Integer, String> msg01 = e -> String.valueOf(e);
        Method01<Integer, String> msg02 = String::valueOf;
        System.out.println(msg01.convert(1000).replaceAll("0", "9"));
        System.out.println(msg02.convert(1000).replaceAll("0", "9"));
    }
}

/**
 * @param <P>引用方法的参数类型
 * @param <R>引用方法的返回类型
 */
@FunctionalInterface
interface Method01<P, R> {
    R convert(P p);
}
