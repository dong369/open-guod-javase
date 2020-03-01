package ch08_network.tcp;

import java.io.OutputStream;
import java.net.Socket;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019年1月6日 时间:下午12:16:09
 * @since 1.8
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
