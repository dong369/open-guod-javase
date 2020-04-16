package ch02_data.number;

/**
 * @author guodd
 * @version 1.0
 */
public class Process {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static String test() {
        if (true)
            return "省略";
        return "返回";
    }
}