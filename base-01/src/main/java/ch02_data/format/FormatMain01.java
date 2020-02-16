package ch02_data.format;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/11/16 时间:22:37
 * @since 1.8
 */
public class FormatMain01 {
    public static void main(String[] args) {
        // 字符串格式
        String format = String.format("%.2f", 2.1495926);
        System.out.println(format);
        String format1 = String.format("%08d", 12);
        System.out.println(format1);
        System.out.println(String.format("java %s", "world"));
    }
}