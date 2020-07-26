package jdk.jdk11.var;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class VarMain {
    public static void main(String[] args) throws Exception{
        long count = Stream.ofNullable(null).count();//
        Arrays.asList("Java", "Python", "C", "Go")
                .forEach((var s) -> {
                    System.out.println("Hello, " + s);
                });
        boolean blank = "null".isBlank();
        System.out.println(blank);
        HttpRequest build = HttpRequest.newBuilder().uri(URI.create("https://javastack.cn")).GET().build();
    }
}
