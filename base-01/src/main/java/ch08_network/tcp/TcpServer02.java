package ch08_network.tcp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019年1月6日 时间:上午11:56:55
 * @JDK 1.8
 * @Description 功能模块：TCP Socket通信模型
 */
public class TcpServer02 {
    public static void main(String[] args) throws IOException {
        // 65536个端口，在9999端口监听，1024以下的端口，系统会使用
        ServerSocket server = new ServerSocket(9999);
        System.out.println("服务开始启动...");
        // 接收客户端连接，进入到阻塞状态
        Socket s = server.accept();
        PrintStream out = new PrintStream(s.getOutputStream());
        // 向客户端输出
        out.println("Hello World .");
        // 输出流的关闭
        out.close();
        // 关闭客户端
        s.close();
        // 关闭服务器端
        server.close();
        System.out.println("服务器已关闭...");
    }
}
