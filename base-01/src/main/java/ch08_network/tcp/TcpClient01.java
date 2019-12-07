package ch08_network.tcp;

import java.io.OutputStream;
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
public class TcpClient01 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 9999);
        OutputStream out = s.getOutputStream();
        out.write(new byte[]{111});
        out.flush();
        out.close();
        s.close();
    }
}
