package ch08_networks.serversocket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * project -
 *
 * @author guodd
 * @date 日期:2019年1月6日 时间:上午11:56:55
 * @JDK 1.8
 * @version 1.0
 * @Description 功能模块：TCP Socket通信模型
 */
public class TcpServerSocketMainTest01 {
	public static void main(String[] args) throws IOException {
		// 在9999端口监听
		ServerSocket server = new ServerSocket(9999); 
		System.out.println("服务开始启动...");
		// 接收客户端连接，进入到阻塞状态
		Socket client = server.accept(); 
		PrintStream out = new PrintStream(client.getOutputStream());
		// 向客户端输出
		out.println("Hello World ."); 
		// 输出流的关闭
		out.close(); 
		// 关闭客户端
		client.close(); 
		// 关闭服务器端
		server.close(); 
		System.out.println("服务器已关闭...");
	}
}
