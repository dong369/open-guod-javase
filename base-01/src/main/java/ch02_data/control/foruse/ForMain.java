package ch02_data.control.foruse;

import org.junit.Test;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class ForMain {
    @Test
    public void forUse() {
        int i = 0;
        // 死循环的语法
        for (; ; ) {
            i++;
            System.out.println("java");
            if (i == 100) break;
        }
    }
}
