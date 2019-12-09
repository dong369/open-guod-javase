package jdk.jdk8.methodref;

/**
 * project - lambda表达式
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:14:57
 * @JDK 1.8
 * @Description 功能模块：构造器引用
 * 语法格式：类名称::new（()->new ArrayList<>()）
 */
public class LambdaMethod04 {
    public static void main(String[] args) {
        Method04<Book01> msg = Book01::new;
        Book01 book = msg.compare("java", 2.5);
        System.out.println(book);
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