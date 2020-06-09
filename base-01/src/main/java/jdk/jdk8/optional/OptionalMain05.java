package jdk.jdk8.optional;

import java.util.Optional;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class OptionalMain05 {
    public static void main(String[] args) {
        int[][] aInt = {{1, 2}, {3, 4}};
        Optional<String> s = Optional
                .of(new User("guo", 22))
                .flatMap(user -> Optional.ofNullable(user.getName()));
        Optional<Integer> integer = Optional.of(aInt).flatMap(ints -> Optional.of(ints.length));
        System.out.println(integer.get());
        s.ifPresent(System.out::println);

    }
}
