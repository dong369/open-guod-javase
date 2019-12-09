package jdk.jdk8.functioninterface;

/**
 * project - 函数式接口
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:15:05
 * @JDK 1.8
 * @Description 功能模块：@FunctionalInterface 表明该接口是一个函数式接口，只能拥有一个抽象方法，主要用在Lambda表达式和方法引用（实际上也可认为是Lambda表达式）上。
 */
@FunctionalInterface
public interface FunInterface02 {
    /**
     * 非default、static方法不能有实现 --否则编译错误--Abstract methods do not specify a body void
     * sayHello4CompilerError(){};
     */
    void sayHello(String message);

    /**
     * default、static方法必须有具体的实现 --否则编译错误--This method requires a body instead of a
     * semicolon default void studyTarget();
     */
    default void studyTarget() {
        System.out.println("出生");
        System.out.println("\t--> 注入知识");
        System.out.println("\t\t--> 生命消亡");
    }

    // 可以拥有多个default方法
    default void studyTarget2() {
        System.out.println("DefaultStaticMethodDemo#【default】studyTarget2 invok.");
    }

    // 可以拥有多个static方法
    static void info() {
        System.out.println("DefaultStaticMethodDemo#【static】 info invok.");
    }

    /**
     * 功能：主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        FunInterface02 funInterface02 = (message) -> System.out.println("Hello " + message);
    }

}
