package jvm;

import org.junit.Test;

/**
 * JVM内存结构：Java虚拟机的运行时区域有关，描述的是线程运行所设计的内存空间。
 * Java内存模型：描述的是多线程允许的行为和Java的并发编程有关。
 * Java对象模型：Java对象在虚拟机中的表现形式有关。
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/5/23 时间:12:50
 * @since 1.8
 */
public class StackMain {
    // javap -c StackMain.class
    // 无监控，不调优，jMap命令监控、jConsole、jVisualVM
    // 编程中的变量名只是为了让大家更好知道语义，不参与底层使用，所以命名使用中文也可以
    @Test
    public void stack() {
        int x = 2;
        int y = 3;
        int z = x * y;
        System.out.println(z);
    }
}
