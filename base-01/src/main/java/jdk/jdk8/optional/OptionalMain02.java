package jdk.jdk8.optional;

import org.springframework.util.StringUtils;

import java.util.Optional;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class OptionalMain02 {
    public static void main(String[] args) {
        System.out.println(getUserName(new User("guo", 22)));
        System.out.println(getUserNameOptional(null));
        System.out.println(getUserOptional(new User("guo", 24)).getName());
    }

    /**
     * 功能描述：传统写法
     */
    public static String getUserName(User u) {
        if (StringUtils.isEmpty(u))
            return "属性null错误！";
        return u.getName();
    }

    /**
     * 功能描述：java8写法，不优雅
     */
    public static String getName(User u) {
        Optional<User> user = Optional.ofNullable(u);
        if (!user.isPresent())
            return "属性null错误！";
        return user.get().getName();
    }

    /**
     * 功能描述：java8写法，链式调用
     */
    public static String getUserNameOptional(User u) {
        return Optional.ofNullable(u)
                // .map(user -> user.getName())
                .map(User::getName)
                .orElse("属性null错误！");
    }

    /**
     * 功能描述：直接返回對象
     */
    public static User getUserOptional(User u) {
        return Optional.ofNullable(u).orElse(null);
    }
}