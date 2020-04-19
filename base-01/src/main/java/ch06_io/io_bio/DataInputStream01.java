package ch06_io.io_bio;

import java.io.*;

/**
 * 数据流
 *
 * @author guodd
 * @version 3.0
 * @since 1.8
 */
public class DataInputStream01 {
    public static void main(String[] args) {
        // 01字节数组
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            // 8 byte
            dataOutputStream.writeDouble(Math.random());
            // 1 byte
            dataOutputStream.writeBoolean(true);
            // 8 byte
            dataOutputStream.writeLong(111);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            // byteArrayInputStream可以读的字节个数
            System.out.println(byteArrayInputStream.available());
            // 数据流
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            // 读出的顺序（马士兵讲的是先写入的要先读）
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readLong());
            dataInputStream.close();
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
