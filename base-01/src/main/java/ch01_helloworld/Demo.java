package ch01_helloworld;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class Demo {
    // 定义线程个数
    public static int threadCount = 5;


    public static void main(String[] args) throws Exception {
        // 1、连接到服务器,获取一个文件,获取文件的大小跟服务器的文件一样的临时文件
        String path = "https://github.com/alibaba/canal/releases/download/canal-1.1.4/canal.deployer-1.1.4.tar.gz";
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // 设置超时
        conn.setConnectTimeout(5000);
        // 设置请求方式
        conn.setRequestMethod("GET");
        // 获取服务器的返回码
        int code = conn.getResponseCode();
        // 判断返回码
        if (code == 200) {
            // 获取返回的长度
            int length = conn.getContentLength();
            System.out.println("文件总长度:" + length);

            // 在客户端创建出一个跟服务器大小一致的临时文件
            RandomAccessFile raf = new RandomAccessFile("temp.exe", "rwd");
            // 指定临时文件的大小
            raf.setLength(length);
            // 释放资源
            raf.close();

            // 平均每一个线程的文件大小
            int blockSize = length / threadCount;

            for (int threadId = 1; threadId <= threadCount; threadId++) {
                // 线程开始的下载位置
                int startIndex = (threadId - 1) * blockSize;
                // 线程的结束位置
                int endIndex = threadId * blockSize - 1;
                // 判断是否是最后一个线程
                if (threadId == threadCount) {
                    // 设置结束的位置为到文件的最后
                    endIndex = length;
                }
                System.out.println("线程:" + threadId + "下载:>>>>>>>>"
                                   + startIndex + ">>>>>>>>>>" + endIndex);

                new DownlodeThread(path, threadId, startIndex, endIndex).start();
            }
        }
    }

    /**
     * 下载文件的子线程类,每一个线程下载对应位置文件数据
     *
     * @author MartinDong
     */
    public static class DownlodeThread extends Thread {
        String path;
        int threadId;
        int startIndex;
        int endIndex;

        /**
         * @param path       文件的下载路径
         * @param threadId   线程id
         * @param startIndex 线程开始的位置
         * @param endIndex   线程结束的位置
         */
        public DownlodeThread(String path, int threadId, int startIndex,
                              int endIndex) {
            this.path = path;
            this.threadId = threadId;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            try {
                // 将地址转换为URL
                URL url = new URL(path);
                // 获取http连接
                HttpURLConnection conn = (HttpURLConnection) url
                        .openConnection();
                // 设置连接的请求方式
                conn.setRequestMethod("GET");
                // 重要:请求服务器下载部分的文件,指定文件的位置
                conn.setRequestProperty("Range", "bytes=" + startIndex + "-" + endIndex);
                // 设置超时时间
                conn.setReadTimeout(5000);
                // 得到服务器的状态码,200表示请求的全部资源得到响应=== ok,206请求的部分资源得到响应=== ok
                int code = conn.getResponseCode();
                System.out.println("code:" + code);
                // 返回的是指定位置的文件流
                InputStream is = conn.getInputStream();
                // 创建一个临时的文件
                RandomAccessFile raf = new RandomAccessFile("temp.exe", "rwd");
                // 移动指针,到指定的文件位置,
                raf.seek(startIndex);

                // 创建中间缓冲字节数组
                byte[] buffer = new byte[1024];
                int length;
                while ((length = is.read(buffer)) != -1) {
                    raf.write(buffer, 0, length);
                }
                is.close();
                raf.close();
                System.out.println("线程:" + threadId + "下载完毕............");

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
