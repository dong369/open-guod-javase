package ch06_io.threadcopy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;

/**
 * The class/interface 复制器
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Replicator {
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
    private Integer count;

    public void startCopy(CountDownLatch latch) throws Exception {
        int start;
        int end;
        RandomAccessFile r = new RandomAccessFile(srcFile, "r");
        int fileLength = (int) r.length();
        // System.out.println("文件总长度：" + fileLength);
        // 10 / 3 = 3，每个线程下载的块数
        int block = fileLength / count;
        for (int i = 1; i <= count; i++) {
            start = (i - 1) * block;
            if (i != count) {
                end = i * block - 1;
            } else {
                end = fileLength - 1;
            }
            new Thread(new CopyThread(latch, srcFile, destFile, start, end)).start();
        }
        r.close();
    }
}