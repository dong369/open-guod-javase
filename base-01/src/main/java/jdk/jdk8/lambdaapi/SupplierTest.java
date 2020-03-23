package jdk.jdk8.lambdaapi;

import jdk.jdk8.lambdaapi.entity.Mask;
import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Project -
 *
 * @author guodd
 * @version 1.0
 * @date 2020/3/23
 * @since 1.8
 */
public class SupplierTest {
    @Test
    public void supplier() {
        Supplier<Mask> a = Mask::new;
        Supplier<Random> randomSupplier = Random::new;
        System.out.println(randomSupplier.get().nextInt());
    }
}
