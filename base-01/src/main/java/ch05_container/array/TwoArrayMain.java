package ch05_container.array;

/**
 * project -
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/15 时间:16:24
 * @JDK 1.8
 * @Description 功能模块：二维数组
 */
public class TwoArrayMain {
    public static void main(String[] args) {
        // 静态初始化，可以使用二维矩形格表示。
        int[][] a = {
                {1, 2},
                {2},
                {9}
        };
        // 动态初始化
        int[][] b = new int[2][];
        System.out.println(a[0].length);
    }
}