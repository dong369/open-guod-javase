package ch08_network.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019年1月6日 时间:上午11:58:21
 * @JDK 1.8
 * @Description 功能模块：UDP 通信模型
 */
public class UdpClientMainTest01 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        byte[] buf = "hello udp".getBytes();
        DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 5858));
        DatagramSocket ds = new DatagramSocket(9999);
        ds.send(dp);
        ds.close();
    }
}
