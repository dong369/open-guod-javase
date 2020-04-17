package ch04_exception.nullpointer;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class NullPointer {
    public static void main(String[] args) {
        String s = null;
        assert s == null;
        System.out.println("assert");
    }
}
