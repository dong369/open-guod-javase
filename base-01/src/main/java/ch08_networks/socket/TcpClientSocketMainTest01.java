package ch08_networks.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * project -
 *
 * @author Administrator
 * @date 日期:2019年1月6日 时间:上午11:58:21
 * @JDK 1.8
 * @version 1.0
 * @Description 功能模块：TCP Socket通信模型
 */
public class TcpClientSocketMainTest01 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("localhost", 9999);
		Scanner scan = new Scanner(client.getInputStream());
		scan.useDelimiter("\n") ;
		// 有数据
		if (scan.hasNext()) { 
			System.out.println("服务器的回应数据：" + scan.next());
		}
		scan.close() ;
		client.close() ;
	}
}
