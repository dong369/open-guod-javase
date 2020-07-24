package ch02_data.enums;

/**
 * 枚举类型，用法一：常量
 * 1、枚举类的理解，类的对象只有有限个、确定的、我们称该类为枚举类。
 * 2、当需要定义一组常量时，强烈建议使用枚举。
 * 3、如果枚举类中只有一个对象，则可以作为单利模式的实现方式。
 * 4、如何定义，jdk1.5之前，自定义枚举；jdk1.5之后可以使用enum关键字
 *
 * @author guod
 * @version 1.0
 */
public enum EnumMain01 {
    RED,
    GREEN,
    BLANK,
    YELLOW;

    public static void main(String[] args) {
        System.out.println(EnumMain01.RED);
    }
}