package jdk.jdk8.lambdaapi;

import org.junit.Test;

/**
 * Predicate接口一共有3个默认方法：negate、and和or，用它们可以创建更加复杂的Predicate接口实例。
 *
 * @author guodd
 * @version 1.0
 * @date 2020/3/23
 * @since 1.8
 */
public class PredicateTest {
    // negate方法就是做非运算
    @Test
    public void test() {
//        Mask mask = new Mask("Honeywell", "N95", 19.5);
//        Predicate<Mask> isN95 = m -> "N95".equals(m.getType());
        // 判断口罩类型是N95
//        System.out.println(isN95.test(mask));
        // 判断口罩类型不是N95
//        System.out.println(isN95.negate().test(mask));
    }
}
