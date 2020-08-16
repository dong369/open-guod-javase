package ch04_builder.v2;

import com.google.common.collect.ImmutableSet;

/**
 * @author guodd
 * @version 1.0
 * @see StringBuilder
 * @see StringBuffer
 * @see com.google.common.collect.ImmutableSet
 * @see com.google.common.cache.CacheBuilder
 * @see org.springframework.beans.factory.support.BeanDefinitionBuilder
 */
public class Test {
    public static void main(String[] args) {
        Product product = new Product.Builder().courseName("课程").coursePrice(2.0).build();
        System.out.println(product);

        ImmutableSet<String> build = ImmutableSet.<String>builder().add("java").add("c").build();
        System.out.println(build);
    }
}
