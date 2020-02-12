package jdk.jdk8.methodref;

/**
 * 特定对象的实例方法引用
 * 语法格式：对象 :: 非静态方法
 * <p>
 * R upper();
 * String toUpperCase() {};
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:35
 * @since 1.8
 */
public class LambdaMethod02 {
    public static void main(String[] args) {
        String str = "Hello world";
        Method02<String> runnable = () -> str.toUpperCase();
        String upper = runnable.upper();
        System.out.println(upper);
        // String类的toUpperCase()定义：

        Method02<String> msg = str::toUpperCase;
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
