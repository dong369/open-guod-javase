package ch14_network.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class EchoServer01 {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        boolean flag = true;
        System.out.println("服务器运行...");
        // 接收客户端请求
        Socket client = server.accept();
        Scanner scan = new Scanner(client.getInputStream());
        PrintStream out = new PrintStream(client.getOutputStream());
        while (flag) {
            // 有内容
            if (scan.hasNext()) {
                String str = scan.next();
                // 程序结束
                if ("byebye".equalsIgnoreCase(str.trim())) {
                    out.println("Bye Bye...");
                    // 退出循环
                    flag = false;
                }
                // 回应数据
                out.println("ECHO：" + str.trim());
            }
        }
        System.out.println("服务器停止运行...");
        server.close();
    }
}
