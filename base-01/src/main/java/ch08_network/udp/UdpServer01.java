package ch08_network.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP 通信模型
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019年1月6日 时间:上午11:56:55
 * @since 1.8
 */
public class UdpServer01 {
    public static void main(String[] args) throws Exception {
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
