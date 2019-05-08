package ch04_exceptions.exception;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/4/29 时间:8:29
 * @JDK 1.8
 * @Description 功能模块：
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
