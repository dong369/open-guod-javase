package datastructure.ch01_arrays.ch01_array_basics;

import java.util.Arrays;

/**
 * @author guodd
 * @version 1.0
 */
public class ArrayBase {

    public static void main(String[] args) {
        /*========================01添加元素：O(i)============================*/
        // 解决数组长度不可以变的问题
        int[] arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arr));
        // 目标元素
        int dst = 4;
        // 创建一个新数组，长度是原数组+1
        int[] newArray = new int[arr.length + 1];
        // 拷贝数组，可以使用工具类
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArray));
        // 放入目标元素
        newArray[newArray.length - 1] = dst;
        System.out.println(Arrays.toString(newArray));
        // 替換原数组
        arr = newArray;
        System.out.println(Arrays.toString(arr));
        /*========================02删除元素：O(i)============================*/
        // 删除后的长度
        int[] delArray = new int[arr.length - 1];
        int delElement = 3;
        // 替换元素
        for (int i = 0; i < delArray.length; i++) {
            if (i < delElement) {
                delArray[i] = arr[i];
            } else {
                delArray[i] = arr[i + 1];
            }
        }
        System.out.println(Arrays.toString(delArray));
    }
}