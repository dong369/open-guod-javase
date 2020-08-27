package ch08_strategy.jdk;

import java.util.Arrays;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class JdkMain {
    public static void main(String[] args) {
        int[] a = {1, 2, 7, 3, 9};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Student student = new Student();
        System.out.println(student.compareTo(new Student()));
        System.out.println(Double.compare(24, 3));
    }
}
