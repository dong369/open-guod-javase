package jdk.jdk8.optional;

import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.Optional;

/**
 * project - 使用Optional类可以避免显式的null值判断，避免null导致的NPE（NullPointerException）
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class OptionalMain02 {

    public User getUser(Integer type) {
        if (type == 0) {
            return new User("guo");
        }
        if (type == 1) {
            return new User("guo", 22);
        }
        return null;
    }

    /**
     * 功能描述：传统写法
     */
    @Test
    public void getUserName() {
        if (StringUtils.isEmpty(getUser(-1))) {
            System.out.println("属性null错误！");
            return;
        }
        System.out.println(getUser(0).getName());
    }

    /**
     * 功能描述：java8写法，不优雅
     */
    @Test
    public void getName() {
        Optional<User> user = Optional.ofNullable(getUser(1));
        // isPresent判断包装对象的值是否非空
        // 这种用法不但没有减少null的防御性检查，而且增加了Optional包装的过程，违背了Optional设计的初衷，因此开发中要避免这种糟糕的使用
        // isPresent & isEmpty
        if (user.isEmpty()) {
            System.out.println("属性null错误！");
            return;
        }
        System.out.println(user.get().getName());
    }


    /**
     * filter()方法接受参数为Predicate对象，用于对Optional对象进行过滤，如果符合Predicate的条件，返回Optional对象本身，否则返回一个空的Optional对象。
     */
    @Test
    public void getFilterUser() {
        Optional.ofNullable(getUser(0)).filter(e -> e.getAge() > 0);
        Optional.ofNullable(getUser(0)).filter(e -> e.getAge() > 0).ifPresent(e -> System.out.println(e.getName()));
    }

    /**
     * 功能描述：java8写法，链式调用
     * map()方法的参数为Function（函数式接口）对象，map()方法将Optional中的包装对象用Function函数进行运算，并包装成新的Optional对象（包装对象的类型可能改变）。
     */
    @Test
    public void getUserNameOptional() {
        // ifPresent()方法接受一个Consumer对象（消费函数），如果包装对象的值非空，运行Consumer对象的accept()方法
        // ifPresent()方法内部做了null值检查，调用前无需担心NPE问题。
        Optional.ofNullable(getUser(-1)).ifPresent(e -> System.out.println("The student name is : " + e.getName()));
        String s = Optional.ofNullable(getUser(1))
                // .map(user -> user.getName())
                .map(User::getName)
                .orElse("属性null错误！");
        // flatMap()能将一个二维的Optional对象映射成一个一维的对象。
        Optional<Integer> integer = Optional.ofNullable(getUser(1)).flatMap(u -> Optional.ofNullable(u.getAge()));
        System.out.println(integer);
    }

    /**
     * 功能描述：直接返回對象
     * orElse()方法功能比较简单，即如果包装对象值非空，返回包装对象值，否则返回入参other的值（默认值）
     */
    @Test
    public void getUserOptional() {
        User user = Optional.ofNullable(getUser(-1)).orElse(getUser(1));
        System.out.println(user);
    }
}