package jdk.jdk8.optional;

import java.util.Optional;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/5 时间:21:27
 * @JDK 1.8
 * @Description 功能模块：调用 isPresent() 方法时
 */
public class OptionalTestMain03 {
    public static void main(String[] args) {
        Optional.of(new User("java", 15)).filter(e -> e.getName().equals("java")).ifPresent(u ->
        {
            System.out.println(u.getName().toUpperCase());
            System.out.println("java");
        });
    }
}