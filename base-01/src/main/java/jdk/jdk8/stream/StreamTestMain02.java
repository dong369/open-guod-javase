package jdk.jdk8.stream;

import jdk.jdk8.optional.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/7 时间:20:44
 * @JDK 1.8
 * @Description 功能模块：
 */
public class StreamTestMain02 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("user" + i);
            user.setAge(i);
            users.add(user);
        }
        List<String> collect = users.stream().map(User::getName).collect(Collectors.toList());
        System.out.println(collect);
    }
}
