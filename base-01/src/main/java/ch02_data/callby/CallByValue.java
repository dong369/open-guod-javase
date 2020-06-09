package ch02_data.callby;

/**
 * Java中的按值调用
 * 1）value被初始化为x值的一个拷贝（也就是10）
 * 2）value被乘以3后等于30，但注意此时x的值仍为10！
 * 3）这个方法结束后，参数变量value不再使用，被回收。
 * <p>
 * 结论：当传递方法参数类型为基本数据类型（数字以及布尔值）时，一个方法是不可能修改一个基本数据类型的参数。
 */
public class CallByValue {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("调用前x的值：" + x);
        add(x);
        System.out.println("调用后x的值：" + x);
    }

    public static void add(int value) {
        value = value * 3;
        System.out.println(value);
    }
}
