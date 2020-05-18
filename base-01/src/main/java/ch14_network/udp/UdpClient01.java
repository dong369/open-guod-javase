package ch14_network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * UDP 通信模型
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class UdpClient01 {
    public static void main(String[] args) throws IOException {
        byte[] buf = "hello udp".getBytes();
        DatagramPacket dp = new DatagramPacket(buf, buf.length,
                new InetSocketAddress("127.0.0.1", 5858));
        DatagramSocket ds = new DatagramSocket(9999);
        ds.send(dp);
        ds.close();
    }
}
