package ch06_io.filecopy;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Instant;

/**
 * 通过测试发现，使用 JAVA NIO 通道传输、JAVA NIO 通道直接缓冲区以及字节缓冲流拷贝文件效率最高
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class FileCopy {

    // jdk基础拷贝
    @Test
    public void test() throws Exception {
        long time01 = Instant.now().toEpochMilli();
        copyFileByStream("d:/test/test.txt", "d:/test/test1.txt");
        System.out.println("通过字节流实现文件的拷贝：" + (Instant.now().toEpochMilli() - time01) + "毫秒");

        long time02 = Instant.now().toEpochMilli();
        copyFileByReaderAndWriter("d:/test/test.txt", "d:/test/test1.txt");
        System.out.println("通过字符流实现文件拷贝：" + (Instant.now().toEpochMilli() - time02) + "毫秒");

        long time03 = Instant.now().toEpochMilli();
        copyFileByBuffered("d:/test/test.txt", "d:/test/test1.txt");
        System.out.println("通过字节缓冲流实现文件拷贝：" + (Instant.now().toEpochMilli() - time03) + "毫秒");

        long time04 = Instant.now().toEpochMilli();
        copyFileByBufferedChar("d:/test/test.txt", "d:/test/test1.txt");
        System.out.println("通过字符缓冲流拷贝文件：" + (Instant.now().toEpochMilli() - time04) + "毫秒");

        long time05 = Instant.now().toEpochMilli();
        copyFileByChannel("d:/test/test.txt", "d:/test/test1.txt");
        System.out.println("通过 JAVA NIO 非直接缓冲区拷贝文件：" + (Instant.now().toEpochMilli() - time05) + "毫秒");

        long time06 = Instant.now().toEpochMilli();
        copyFileByChannelBuffer("d:/test/test.txt", "d:/test/test1.txt");
        System.out.println("通过 JAVA NIO 直接缓冲区拷贝文件：" + (Instant.now().toEpochMilli() - time06) + "毫秒");

        long time07 = Instant.now().toEpochMilli();
        copyFileByChannelTransfer1("d:/test/test.txt", "d:/test/test1.txt");
        // copyFileByChannelTransfer2("d:/test/test.txt", "d:/test/test1.txt");
        System.out.println("通过 JAVA NIO 通道传输拷贝文件：" + (Instant.now().toEpochMilli() - time07) + "毫秒");
    }

    // 工具类拷贝文件
    @Test
    public void utilsCopy() throws Exception {
        long time01 = Instant.now().toEpochMilli();
        ioUtilsCopy("d:/test/test.txt", "d:/test/test1.txt");
        System.out.println("apache commons IoUtils拷贝文件：" + (Instant.now().toEpochMilli() - time01) + "毫秒");

        long time02 = Instant.now().toEpochMilli();
        ioUtilsCopyLarge("d:/test/test.txt", "d:/test/test1.txt");
        System.out.println("apache commons IoUtils大文件拷贝文件：" + (Instant.now().toEpochMilli() - time02) + "毫秒");

        long time03 = Instant.now().toEpochMilli();
        fileUtilsCopy("d:/test/test.txt", "d:/test/test1.txt");
        System.out.println("apache commons IoUtils大文件拷贝文件：" + (Instant.now().toEpochMilli() - time03) + "毫秒");
    }

    // 文件夹拷贝
    @Test
    public void copyDir() throws Exception {
        long time01 = Instant.now().toEpochMilli();
        fileUtilsCopyDirectory("d:/test", "d:/test/aa");
        System.out.println("apache commons IoUtils拷贝文件：" + (Instant.now().toEpochMilli() - time01) + "毫秒");
    }

    // 通过字节流实现文件的拷贝
    public void copyFileByStream(String sourcePath, String targetPath) throws Exception {
        File source = new File(sourcePath);
        File target = new File(targetPath);

        if (!target.getParentFile().exists()) {
            boolean mkdirs = target.getParentFile().mkdirs();
        }

        FileInputStream is = new FileInputStream(source);
        FileOutputStream os = new FileOutputStream(target);

        int temp;

        // 每次读取1024个字节
        byte[] data = new byte[1024];

        // 将每次读取的数据保存到字节数组里面，并且返回读取的个数
        while ((temp = is.read(data)) != -1) {
            os.write(data, 0, temp);
        }

        is.close();
        os.close();
    }

    // 通过字符流实现文件拷贝
    public void copyFileByReaderAndWriter(String sourcePath, String targetPath) throws Exception {
        File source = new File(sourcePath);
        File target = new File(targetPath);

        if (!target.getParentFile().exists()) {
            boolean mkdirs = target.getParentFile().mkdirs();
        }

        FileReader fr = new FileReader(source);
        FileWriter fw = new FileWriter(target);

        int tempt;
        char[] data = new char[1024];
        while ((tempt = fr.read(data)) != -1) {
            fw.write(data, 0, tempt);
        }

        fr.close();
        fw.close();
    }

    // 通过字节缓冲流实现文件拷贝
    public void copyFileByBuffered(String sourcePath, String targetPath) throws Exception {
        File source = new File(sourcePath);
        File target = new File(targetPath);

        if (!target.getParentFile().exists()) {
            boolean mkdirs = target.getParentFile().mkdirs();
        }

        InputStream is = new BufferedInputStream(new FileInputStream(source));
        OutputStream os = new BufferedOutputStream(new FileOutputStream(target));

        int tempt;
        byte[] data = new byte[1024];
        while ((tempt = is.read(data)) != -1) {
            os.write(data, 0, tempt);
        }

        is.close();
        os.close();
    }

    // 通过字符缓冲流拷贝文件
    public void copyFileByBufferedChar(String sourcePath, String targetPath) throws Exception {
        File source = new File(sourcePath);
        File target = new File(targetPath);

        if (!target.getParentFile().exists()) {
            boolean mkdirs = target.getParentFile().mkdirs();
        }

        BufferedReader fr = new BufferedReader(new FileReader(source));
        BufferedWriter fw = new BufferedWriter(new FileWriter(target));

        String temp;
        while ((temp = fr.readLine()) != null) {
            fw.write(temp);
        }
        fr.close();
        fw.close();
    }

    // 通过 JAVA NIO 非直接缓冲区拷贝文件
    public void copyFileByChannel(String sourcePath, String targetPath) throws Exception {
        FileInputStream is = new FileInputStream(sourcePath);
        FileOutputStream os = new FileOutputStream(targetPath);
        // 获取通道
        FileChannel isChannel = is.getChannel();
        FileChannel osChannel = os.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(1024);
        while (isChannel.read(buf) != -1) {
            // 转换为读取数据模式
            buf.flip();
            // 写入到磁盘
            osChannel.write(buf);
            // 清空缓冲区
            buf.clear();
        }

        is.close();
        os.close();
        isChannel.close();
        osChannel.close();
    }

    // 通过 JAVA NIO 直接缓冲区拷贝文件
    public void copyFileByChannelBuffer(String sourcePath, String targetPath) throws Exception {
        // 获取通道,StandardOpenOption.READ表示可读，StandardOpenOption.WRITE表示可写，StandardOpenOption.CREATE表示可以创建
        FileChannel inChannel = FileChannel.open(Paths.get(sourcePath), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get(targetPath), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);

        // 创建内存映射文件
        MappedByteBuffer inMapped = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
        MappedByteBuffer outMapped = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

        // 直接操作内存映射文件
        byte[] data = new byte[inMapped.limit()];
        inMapped.get(data);
        outMapped.put(data);

        // 关闭流
        outChannel.close();
        inChannel.close();
    }

    // 通过 JAVA NIO 通道传输拷贝文件
    public void copyFileByChannelTransfer1(String sourcePath, String targetPath) throws Exception {
        // 获取通道,StandardOpenOption.READ表示可读，StandardOpenOption.WRITE表示可写，StandardOpenOption.CREATE表示可以创建
        FileChannel inChannel = FileChannel.open(Paths.get(sourcePath), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get(targetPath), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
        inChannel.transferTo(0, inChannel.size(), outChannel);
        outChannel.close();
        inChannel.close();
    }

    public void copyFileByChannelTransfer2(String sourcePath, String targetPath) throws Exception {
        FileInputStream is = new FileInputStream(sourcePath);
        FileOutputStream os = new FileOutputStream(targetPath);
        FileChannel isChannel = is.getChannel();
        FileChannel osChannel = os.getChannel();
        isChannel.transferTo(0, isChannel.size(), osChannel);
        os.close();
        is.close();
    }

    public void ioUtilsCopy(String sourcePath, String targetPath) throws Exception {
        IOUtils.copy(new FileInputStream(sourcePath), new FileOutputStream(targetPath));
    }


    public void ioUtilsCopyLarge(String sourcePath, String targetPath) throws Exception {
        IOUtils.copyLarge(new FileInputStream(sourcePath), new FileOutputStream(targetPath));
    }

    public void fileUtilsCopy(String sourcePath, String targetPath) throws Exception {
        FileUtils.copyFile(new File(sourcePath), new FileOutputStream(targetPath));
    }

    public void fileUtilsCopyDirectory(String sourcePath, String targetPath) throws Exception {
        FileUtils.copyDirectory(new File(sourcePath), new File(targetPath));
    }

}
