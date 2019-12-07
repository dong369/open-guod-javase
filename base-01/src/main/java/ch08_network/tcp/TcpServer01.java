package ch08_network.tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Project -
 *
 * @Create by guodd
 * @Version 1.0
 * @Date 日期:2019/1/3 时间:14:50
 * @JDK 1.8
 * @Description
 */
public class TcpServer01 {
    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(9999);
        Socket a = s.accept();
        InputStream in = a.getInputStream();
        int n;
        while ((n = in.read()) != -1) {
            System.out.println((char) n);
        }
    }
}
