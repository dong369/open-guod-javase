package jdk.jdk8.optional;

import java.util.Optional;

/**
 * 创建Optional对象的创建
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/7 时间:21:02
 * @since 1.8
 */
public class OptionalMain01 {
    public static void main(String[] args) {
        // 1、创建一个包装对象值为空的Optional对象
        Optional<Object> empty = Optional.empty();
        // 2、创建包装对象值非空的Optional对象
        Optional<Object> o = Optional.of("optional");
        // 3、创建包装对象值允许为空的Optional对象
        Optional<Object> o1 = Optional.ofNullable(null);
    }
}
