package ch03_oothinking.finaluse;

/**
 * final关键字（定义类、定义的方法、定义的变量、全局常量）
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public final class FinalUse { // 表示该类不能被继承
    /**
     * 表示变量只能一次赋值以后值不能被修改（常量）。​
     */
    private static final int SIZE = 0;

    /**
     * 表示方法不能被子类重写
     */
    public final void test() {
    }

    public static void main(String[] args) {
        System.out.println(SIZE);
    }

}
