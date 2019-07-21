package ch06_io.io_bio;

import java.io.*;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/10 时间:15:19
 * @JDK 1.8
 * @Description 功能模块：数据流
 */
public class DataInputStreamTest {
    public static void main(String[] args) {
        // 01字节数组
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeDouble(Math.random());
            dataOutputStream.writeBoolean(true);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            // byteArrayInputStream可以读的字节个数
            System.out.println(byteArrayInputStream.available());
            // 数据流
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            // 读出的顺序（马士兵讲的是先写入的要先读）
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readBoolean());
            dataInputStream.close();
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
