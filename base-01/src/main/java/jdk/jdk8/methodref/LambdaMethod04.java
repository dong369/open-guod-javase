package jdk.jdk8.methodref;

import java.util.Arrays;
import java.util.function.Function;

/**
 * 构造器引用：和方法引用类似，函数式接口的抽象方法的形参列表和构造器的形参列表一致，抽象方法返回的类型即为构造器类的类型。
 * 数组引用：把数组当作一个特殊的类，则写法和构造引用一致。
 * 语法格式：类 :: new
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class LambdaMethod04 {
    public static void main(String[] args) {
        Method04<Book01> msg = Book01::new;
        Book01 book = msg.compare("java", 2.5);
        System.out.println(book);

        Function<Integer, String[]> arr = String[]::new;
        String[] apply = arr.apply(5);
        System.out.println(Arrays.toString(apply));

    }
}

/**
 * @param <C>引用方法的返回类型
 */
interface Method04<C> {
    C compare(String title, double price);
}

class Book01 {
    private String title;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book01(String title, double price) {
        super();
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [书名=" + title + ", 价格=" + price + "]";
    }
}