package ch17_java8.optional;

import java.util.Optional;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:13:08
 * @JDK 1.8
 * @Description 功能模块：
 */
public class OptionalTestMain02 {
    public static void main(String[] args) {
        System.out.println(getUserName(new User("guod", 22)));
        System.out.println(getUserNameOptional(null));
    }

    /**
     * 功能描述：传统写法
     *
     * @param u
     * @return
     */
    public static String getUserName(User u) {
        if (u == null)
            return "属性null错误！";
        return u.getName();
    }

    /**
     * 功能描述：java8写法，不优雅
     *
     * @param u
     * @return
     */
    public static String getName(User u) {
        Optional<User> user = Optional.ofNullable(u);
        if (!user.isPresent())
            return "属性null错误！";
        return user.get().getName();
    }

    /**
     * 功能描述：java8写法，链式调用
     *
     * @param u
     * @return
     */
    public static String getUserNameOptional(User u) {
        return Optional.ofNullable(u)
                // .map(user -> user.getName())
                .map(User::getName)
                .orElse("属性null错误！");
    }

    /**
     * 功能描述：直接返回對象
     *
     * @param u
     * @return
     */
    public static User getUserOptional(User u) {
        return Optional.ofNullable(u).orElse(null);
    }
}