package ch02_data.format;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class FormatUse {
    public static void main(String[] args) {
        // 字符串格式
        String format = String.format("%.2f", 2.1495926);
        System.out.println(format);
        String format1 = String.format("%08d", 12);
        System.out.println(format1);
        System.out.println(String.format("java %s", "world"));
    }
}