package jdk.jdk8.methodref;

/**
 * 类的任意对象的实例方法引用
 * 语法格式：类 :: 非静态方法
 * <p>
 * int compare(P p1, P p2);
 * p1.compareTo(String anotherString) {}
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class LambdaMethod03 {
    /**
     * @param <P>引用方法的返回类型
     */
    interface Method03<P> {
        int compare(P p1, P p2);
    }

    public static void main(String[] args) {
        Method03<Integer> sum = (a, b) -> a + b;
        int compare = sum.compare(1, 2);
        System.out.println(compare);
        Method03<String> msg = String::compareTo;
        System.out.println(msg.compare("A", "B"));
    }
}