package ch06_io.threadcopy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.RandomAccessFile;

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

    @Override
    public void run() {
        try {
            // 定位源文件
            RandomAccessFile src = new RandomAccessFile(srcFile, "r");
            src.seek(start);
            RandomAccessFile dest = new RandomAccessFile(destFile, "rw");
            dest.seek(start);

            // 缓冲区
            byte[] buffers = new byte[1024];

            // 直接写数据
            int len;
            while ((len = src.read(buffers)) != -1) {
                System.out.println(Thread.currentThread().getName() + "：" + len);
                dest.write(buffers, 0, len);
                if (src.getFilePointer() >= end) {
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + "：区间" + start + "-" + end);
            src.close();
            dest.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
