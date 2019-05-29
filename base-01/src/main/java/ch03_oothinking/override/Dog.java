package ch03_oothinking.override;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/5/29 时间:13:16
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Dog extends Animal {
    @Override
    public void call() {
        System.out.println("狗叫");
    }
}
