package ch02_data.control.continueuse;

/**
 * The class/interface 跳出本次循环，继续执行下次循环 (结束正在执行的循环 进入下一个循环条件)
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class ContinueUse {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i + "java");
        }
    }
}
