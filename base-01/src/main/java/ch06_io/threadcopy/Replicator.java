package ch06_io.threadcopy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.RandomAccessFile;

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

    public void startCopy() throws Exception {
        int start;
        int end;
        RandomAccessFile r = new RandomAccessFile(srcFile, "r");
        int fileLength = (int) r.length();
        System.out.println("文件总长度：" + fileLength);
        int block = fileLength / count;
        for (int i = 0; i < count; i++) {
            start = i * block;
            if (i != (count - 1)) {
                end = (i + 1) * block - 1;
            } else {
                end = fileLength - 1;
            }
            new Thread(new CopyThread(srcFile, destFile, start, end)).start();
        }
        r.close();
    }
}