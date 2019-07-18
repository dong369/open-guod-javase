package ch03_oothinking.usethis;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/2 时间:17:02
 * @JDK 1.8
 * @Description 功能模块：关键字this，this()和super()都指的是对象。所以，均不可以在static环境中使用。
 * 包括：static变量,static方法，static语句块。
 */
public class UseThis {
    public static void main(String[] args) {
        UseThis useThis = new UseThis();
        useThis.testThis();
    }

    public void testThis() {
        System.out.println(this);
    }
}
