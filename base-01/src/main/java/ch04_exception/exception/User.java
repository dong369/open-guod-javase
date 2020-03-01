package ch04_exception.exception;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/4/29 时间:8:29
 * @since 1.8
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
