package ch08_network.tcp;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019年1月6日 时间:上午11:58:21
 * @JDK 1.8
 * @Description 功能模块：TCP Socket通信模型
 */
public class TcpClient02 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 9999);
        Scanner scan = new Scanner(s.getInputStream());
        scan.useDelimiter("\n");
        // 有数据
        if (scan.hasNext()) {
            System.out.println("服务器的回应数据：" + scan.next());
        }
        scan.close();
        s.close();
    }
}
