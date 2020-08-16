package ch02_data.bitoperation;

import javax.xml.bind.DatatypeConverter;

/**
 * 二进制、八进制、十进制、[十六进制]
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class HexUse {
    public static void main(String[] args) {
        System.out.println(DatatypeConverter.printHexBinary("1010".getBytes()));
    }
}
