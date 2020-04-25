package jdk.jdk8.base64;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

/**
 * Java 8提供的Base64，要比sun.misc套件提供的还要快至少11倍，比Apache Commons Codec提供的还要快至少3倍。
 *
 * @author guod
 * @version 1.0
 * @since 1.8
 */
public class Base64Main02 {
    private static Base64.Encoder encoder = Base64.getEncoder();
    private static Base64.Decoder decoder = Base64.getDecoder();

    public static void main(String[] args) throws Exception {
        // 编码
        String text = "Java开发";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        byte[] encode = encoder.encode(bytes);
        System.out.println(Arrays.toString(encode));
        // 解密
        System.out.println(new String(decoder.decode(encode), StandardCharsets.UTF_8));
    }
}
