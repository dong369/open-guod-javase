package ch02_data.string;

import java.util.StringJoiner;
import java.util.stream.IntStream;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class StringJoinerUse {
    public static void main(String[] args) {
        StringJoiner str = new StringJoiner(",");
        IntStream.range(1, 20).forEach(i -> str.add(i + ""));
        System.out.println(str);
        System.out.println(IntStream.range(0, 2));
    }
}
