package jdk.jdk8.lambda;

/**
 * project - lambda表达式
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:56
 * @JDK 1.8
 * @Description 功能模块：类的任意对象的实例方法引用
 * 语法格式：特定类::普通方法（()->x.toString()）
 */
public class LambdaMethodTestMain03 {
    public static void main(String[] args) {
        Method03<Integer> sum = (a, b) -> a + b;
        int compare = sum.compare(1, 2);
        System.out.println(compare);
        Method03<String> msg = String::compareTo;
        System.out.println(msg.compare("A", "B"));
    }
}

/**
 * @param <P>引用方法的返回类型
 */
interface Method03<P> {
    int compare(P p1, P p2);
}