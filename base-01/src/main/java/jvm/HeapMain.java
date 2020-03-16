package jvm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * JVM内存结构：Java虚拟机的运行时区域有关，描述的是线程运行所设计的内存空间。
 * Java内存模型：描述的是多线程允许的行为和Java的并发编程有关。
 * Java对象模型：Java对象在虚拟机中的表现形式有关。
 *
 * @author guodd
 * @version 1.0
 * @date 2020/2/25
 * @since 1.8
 */
public class HeapMain {
    // 减少full gc的次数频率/过程时间（停顿时间）
    // 1、system.gc；2、老年代满了
    private byte[] bytes = new byte[1024 * 100];

    @Test
    public void throwsFinally() {
        int a = 2, b = 5;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
            // 结束JVM的生命周期
            System.exit(0);
        } finally {
            System.out.println("end...");
        }
    }

    @Test
    public void test() throws Exception {
        Thread.sleep(5000);
        List<HeapMain> heapMains = new ArrayList<>();
        System.out.println("start...");
        for (int i = 0; i < 2000; i++) {
            Thread.sleep(100);
            heapMains.add(new HeapMain());
        }
    }
}
