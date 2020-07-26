package jdk.jdk8.lambdaapi;

import jdk.jdk8.lambdaapi.entity.Mask;
import org.junit.Test;

import java.util.function.Consumer;

/**
 * Consumer接口中，有一个默认方法andThen，它的入参还是Consumer接口的实例。
 * 做完上一个Consumer的操作以后，再做当前Consumer的操作，就像工厂的流水线一样
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class ConsumerTest {
    @Test
    public void consumer() {
//        Consumer<Mask> brand = m -> m.setBrand("3M");
//        Consumer<Mask> type = m -> m.setType("N95");
//        Consumer<Mask> price = m -> m.setPrice(19.9);
        // void println(Object x);
        // void accept(T t);
        Consumer<Mask> print = System.out::println;

        /*brand.andThen(type)
                .andThen(price)
                .andThen(print)
                .accept(new Mask());*/
    }
}
