package ch06_io.io_bio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * project -
 *
 * @author guodd
 * @version 3.0
 * @date 日期:2018/6/10 时间:15:48
 * @JDK 1.8
 * @Description 功能模块：打印流
 */
public class PrintStreamTest01 {
	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					System.getProperty("user.dir") + "/base-01/src/main/java/ch06/bio/print.txt");
			ps = new PrintStream(fileOutputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (ps != null) {
			System.setOut(ps);
		}
		int b = 0;
		for (char c = 0; c <= 60000; c++) {
			System.out.print(c + " ");
			if (b++ >= 100) {
				System.out.println();
				b = 0;
			}
		}
	}
}
