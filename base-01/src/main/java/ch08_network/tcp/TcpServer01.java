package ch08_network.tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Project -
 *
 * @author guodd
 * @date 日期:2019/1/3 时间:14:50
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
