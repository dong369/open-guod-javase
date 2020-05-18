package cn.hacz.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class FileSystemUse {
    private Configuration configuration;

    @Before
    public void before() {
        configuration = new Configuration();
        configuration.set("fs.defaultFS", "hdfs://s10:8020/");
    }

    /**
     * 向Hdfs写数据
     *
     * @throws IOException
     */
    @Test
    public void writeToHdfs() throws IOException {
        FileSystem fs = FileSystem.get(configuration);
        Path path = new Path("hdfs://s10:8020/user/guodd/data/test.txt");
        // 数据输出流，可以指定副本数
        FSDataOutputStream fos = fs.create(path, (short) 2);
        fos.write("hello word".getBytes());
        fos.close();
    }

    /**
     * 下载文件
     *
     * @throws Exception
     */
    @Test
    public void read2Hdfs() throws Exception {
        Path path = new Path("/user/guodd/data/test.txt");
        FileSystem fs = FileSystem.get(configuration);
        FSDataInputStream fis = fs.open(path);
        FileOutputStream fos = new FileOutputStream("d:/test/ab.txt");
        IOUtils.copyBytes(fis, fos, 1024);
        IOUtils.closeStream(fis);
        IOUtils.closeStream(fos);
    }

    // 定位第一块、定位

    // 第二块 seek

    // 创建目录

    // 遍历目录

}
