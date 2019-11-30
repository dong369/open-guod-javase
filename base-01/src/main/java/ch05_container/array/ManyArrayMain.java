package ch05_container.array;

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
