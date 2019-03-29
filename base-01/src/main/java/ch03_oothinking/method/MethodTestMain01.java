package ch03_oothinking.method;

/**
 * project - 方法类型
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/9 时间:8:51
 * @JDK 1.8
 * @Description 功能模块：五种方法类型的区分
 */
public abstract class MethodTestMain01 {
    public static void main(String[] args) {

    }

    /**
     * Static Methods：静态方法
     */
    public static void fun01() {

    }

    /**
     * Abstract Methods：抽象方法（不可能是静态的）
     */
    public abstract void fun02();

    /**
     * Instance Methods：实例方法（非静态方法）
     */
    public void fun03() {
    }

    /**
     * Concrete Methods：具体方法（非抽象方法）
     */
    public void func04() {
    }

    /**
     * Deprecated Methods：废弃方法
     */
    @Deprecated
    public void fun05() {
    }
}
