package datastructure.ch01_arrays.ch01_array_basics;

/**
 * project - 数组
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/23 时间:9:04
 * @JDK 1.8
 * @Description 功能模块：数据+索引+容量=数组
 * 数组因为有索引，所以数组的优点就是查询快。
 * 这里强调三点：一是数组只能存储同一类型的数据，可以是基本类型也可以是引用类型；二是数组长度是不可变的；三是索引可以有语意
 */
public class Main {
    public static void main(String[] args) {
        // 声明+初始化
        int[] arr = new int[10];

        // 赋值
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;

        // 声明+初始化+赋值
        int[] scores = new int[]{1, 2, 3, 4};
        int[] data = {4, 3, 2, 1};

        // 遍历
        for (int score : scores) {
            System.out.print(score);
        }
        for (int datum : data) {
            System.out.print(datum);
        }
    }
}