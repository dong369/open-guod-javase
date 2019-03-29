package ch17_java8.optional;

import java.util.Optional;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/7 时间:21:12
 * @JDK 1.8
 * @Description 功能模块：flatMap()能将一个二维的Optional对象映射成一个一维的对象
 */
public class OptionalTestMain05 {
    public static void main(String[] args) {
        int[][] aInt = {{1, 2}, {3, 4}};
        Optional<String> s = Optional.of(new User("guod", 22)).flatMap(user -> Optional.ofNullable(user.getName()));
        Optional<Integer> integer = Optional.of(aInt).flatMap(ints -> Optional.of(ints.length));
        System.out.println(integer.get());
        System.out.println(s.get());
    }
}
