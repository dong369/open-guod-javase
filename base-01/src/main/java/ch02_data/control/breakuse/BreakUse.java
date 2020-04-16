package ch02_data.control.breakuse;

/**
 * The class/interface 跳出总上一层循环，不再执行循环 (结束当前的循环体)
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class BreakUse {
    public void test() {
        ok:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 5) {
                    break ok;
                }
            }
        }
    }
}
