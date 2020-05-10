package cn.hacz;

import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class HdfsURLUse {

    @Test
    public void readInfoUrl() throws Exception {
        // 使Java识别hdfs协议
        URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
        // URL对象
        URL url = new URL("hdfs://s11:8020/user/guodd/data/test.txt");
        // 获取输入流
        URLConnection urlConnection = url.openConnection();
        urlConnection.setReadTimeout(30);
        urlConnection.setConnectTimeout(30);
        InputStream is = urlConnection.getInputStream();
        // 输出流
        FileOutputStream fos = new FileOutputStream("d:/test/hello.txt");
        byte[] buf = new byte[1024];
        int len;
        if ((len = is.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        is.close();
        fos.close();
    }
}
