package ch06_io.threadcopy;

import java.util.concurrent.CountDownLatch;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int count = 20;
        CountDownLatch latch = new CountDownLatch(count);
        Replicator replicator = new Replicator("d:/test/test.txt", "d:/test/test1.txt", count);
        long start = System.currentTimeMillis();
        replicator.startCopy(latch);
        latch.await();
        long end = System.currentTimeMillis();
        System.out.println("下载完毕：" + (end - start));
    }
}