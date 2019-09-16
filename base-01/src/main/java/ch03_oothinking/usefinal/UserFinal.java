package ch03_oothinking.usefinal;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/22 时间:16:12
 * @JDK 1.8
 * @Description 功能模块：final关键字（定义类、定义的方法、定义的变量、全局常量）
 */
public final class UserFinal {
    /**
     * 值不能被改变
     */
    private static final int SIZE = 0;

    /**
     * 不能被子类重写
     */
    public final void test() {
    }

    public static void main(String[] args) {
        System.out.println(SIZE);
    }

}
