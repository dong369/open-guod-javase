package jdk.jdk8.base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/11/5 时间:15:33
 * @JDK 1.8
 * @Description 功能模块：早期作法会使用到JDK里sun.misc套件，Java11中已经废除了
 */
public class Base64Test01 {
    private static final BASE64Encoder encoder = new BASE64Encoder();
    private static final BASE64Decoder decoder = new BASE64Decoder();
    private static final String text = "user";

    public static void main(String[] args) throws Exception {
        byte[] textByte = text.getBytes("UTF-8");
        // 编码
        String encodeText = encoder.encode(textByte);
        System.out.println(encodeText);
        // 解码
        System.out.println(new String(decoder.decodeBuffer(encodeText), "UTF-8"));
    }
}
