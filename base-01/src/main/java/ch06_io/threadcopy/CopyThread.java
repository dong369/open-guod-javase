package ch06_io.threadcopy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;

/**
 * The class/interface 具体的拷贝线程
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CopyThread implements Runnable {
    /**
     * 属性描述：源文件
     */
    private String srcFile;
    /**
     * 属性描述：目标文件
     */
    private String destFile;
    /**
     * 属性描述：线程数
     */
    private Integer start;
    /**
     * 属性描述：线程数
     */
    private Integer end;

    CountDownLatch latch;

    public CopyThread(CountDownLatch latch, String srcFile, String destFile, int start, int end) {
        this.latch = latch;
        this.srcFile = srcFile;
        this.destFile = destFile;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try {
            // 定位源文件
            RandomAccessFile src = new RandomAccessFile(srcFile, "r");
            src.seek(start);

            RandomAccessFile dest = new RandomAccessFile(destFile, "rw");
            dest.seek(start);

            // 缓冲区
            int bufferLen = 1024;
            if (end - start + 1 < bufferLen) {
                bufferLen = end - start + 1;
            }
            byte[] buffers = new byte[bufferLen];

            // 直接写数据
            int len;
            long filePointer = src.getFilePointer();
            while (((len = src.read(buffers)) != -1) && (filePointer <= end)) {
                // System.out.println(Thread.currentThread().getName() + "：" + len);
                dest.write(buffers, 0, len);
                // 需要判断src.getFilePointer() >= end吗？
                filePointer = src.getFilePointer();
            }
            // log.info("Thread[{}]；Starr[{}]；End[{}]", Thread.currentThread().getName(), start, end);
            // System.out.println(Thread.currentThread().getName() + "：区间" + start + "-" + end);
            src.close();
            dest.close();
            latch.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
