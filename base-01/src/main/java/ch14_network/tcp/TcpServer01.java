package ch14_network.tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019年1月6日 时间:下午12:16:09
 * @since 1.8
 */
public class TcpServer01 {
    public static void main(String[] args) throws Exception {
        // accept阻塞
        ServerSocket s = new ServerSocket(9999);
        Socket a = s.accept();
        InputStream in = a.getInputStream();
        int n;
        // read阻塞
        while ((n = in.read()) != -1) {
            System.out.println((char) n);
        }
    }
}
