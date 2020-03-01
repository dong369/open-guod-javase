package ch05_container.array;

/**
 * 多维数组
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/12/8 时间:20:00
 * @since 1.8
 */
public class ManyArrayMain {
    public static void main(String[] args) {
        int[][][] a = {
                {
                        {1, 2, 3},
                        {6, 7, 3}
                },
                {
                        {1, 2, 3},
                        {1, 2, 3},
                        {6, 7, 3}
                }
        };
        for (int[][] ints : a) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i + ",");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
