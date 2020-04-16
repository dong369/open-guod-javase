package ch03_oothinking.interfacetype;

/**
 * 事物作为抽象类，事物的特性行为作为接口
 *
 * @author guod
 * @version 1.0
 */
public interface InterfaceMain {
    /**
     * 全局常量
     */
    public static final String STR = "声明变量";

    /**
     * 抽象方法
     */
    public abstract void move();

    default void test() {
        System.out.println("default 方法");
    }

}
