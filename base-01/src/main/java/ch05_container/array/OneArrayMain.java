package ch05_container.array;

/**
 * 一维数组
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/15 时间:16:24
 * @since 1.8
 */
public class OneArrayMain {
    public static void main(String[] args) {
        // 一维遍历数组：
        String[] arr02 = new String[]{"xx", "yy", "zz"};
        String[] arr03 = {"java", "c", "c++"};

        // 1，增强的for循环
        for (String elt : arr02) {
            System.out.println(elt);
        }

        // 2，下标的方式
        for (int i = 0; i < arr03.length; i++) {
            System.out.println(arr03[i]);
        }
    }
}