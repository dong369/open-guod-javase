package jdk.jdk8.optional;

import org.springframework.util.Assert;

import java.util.Optional;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class OptionalMain04 {
    public static void main(String[] args) {
        User user = new User("guo", 12);
        Optional.of(user).ifPresent(u -> {
            System.out.println(u.getName());
        });

        Assert.notNull(user, "111");
        Optional.ofNullable(user).ifPresent(u -> {
            System.out.println(u.getName());
        });
    }
}
