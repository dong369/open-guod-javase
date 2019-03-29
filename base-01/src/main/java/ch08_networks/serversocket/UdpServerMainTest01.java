package ch08_networks.serversocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * project -
 *
 * @author Administrator
 * @date 日期:2019年1月6日 时间:上午11:56:55
 * @JDK 1.8
 * @version 1.0
 * @Description 功能模块：UDP 通信模型
 */
public class UdpServerMainTest01 {
	public static void main(String[] args) throws IOException {
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		DatagramSocket ds = new DatagramSocket(5858);
		while (true) {
			// 阻塞方式
			ds.receive(dp);
			System.out.println(new String(buf, 0, dp.getLength()));
		}
	}
}
