package ch08_strategy.base;

/**
 * 排序
 *
 * @author guodd
 * @version 1.0
 */
public class DataSorter {
    public static void sort(Comparable[] a) {
        // 保存每次比较,最大值的下标;
        int index;
        for (int i = 0; i < a.length; i++) {
            index = 0;
            for (int j = 1; j <= a.length - i; j++) {
                if (a[j].compareTo(a[index]) == 1) {
                    index = j;
                }
            }
            swap(a, index, a.length - i);
        }

    }

    private static void swap(Comparable[] a, int x, int y) {
        Comparable tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;

    }

    // 输出数组元素
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
