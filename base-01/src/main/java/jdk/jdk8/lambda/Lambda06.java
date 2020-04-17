package jdk.jdk8.lambda;

/**
 * @author guodd
 * @version 1.0
 */
public class Lambda06 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("java")).start();
    }
}
