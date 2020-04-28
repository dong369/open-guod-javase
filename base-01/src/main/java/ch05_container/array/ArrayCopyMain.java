package ch05_container.array;

import java.util.Arrays;

/**
 * 数组拷贝
 *
 * @author guodd
 * @version 1.0
 * @since 1.8
 */
public class ArrayCopyMain {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[6];

        // 01 System.arraycopy拷贝：将a从0开始拷贝到b从0开始的，拷贝a的长度
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(b));

        // 02Arrays.copyOf拷贝：将b数组拷贝到长度是30的数组中
        int[] c = Arrays.copyOf(a, 30);
        System.out.println(Arrays.toString(c));

        // 03Arrays.copyOfRange拷贝：原数组，开始位置，拷贝的个数
        int[] d = Arrays.copyOfRange(a, 0, 5);
        System.out.println(Arrays.toString(d));
    }
}
