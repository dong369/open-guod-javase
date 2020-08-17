package ch06_io.io_bio;

import java.io.*;

/**
 * 缓冲输入流
 *
 * @author guod
 * @version 1.0
 * @see 1.8
 */
public class BufferedReader01 {
    public static void main(String[] args) throws Exception {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(System.getProperty("user.dir")
                               + "/base-01/src/main/java/ch06_ios/io_bio/test03.txt"));
        BufferedReader reader = new BufferedReader(
                new FileReader(System.getProperty("user.dir")
                               + "/base-01/src/main/java/ch06_ios/io_bio/test03.txt"));
        String s;
        for (int i = 0; i < 100; i++) {
            s = String.valueOf(Math.random());
            writer.write(s);
            writer.newLine();
        }
        // 现有的数据操作
        writer.flush();
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }
        writer.close();
        reader.close();
    }
}
