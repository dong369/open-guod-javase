package datastructure.ch01_arrays.ch08_amortized_time_complexity;

import datastructure.ch01_arrays.ch07_dynamic_array.Array;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/23 时间:10:36
 * @JDK 1.8
 * @Description 功能模块：性能测试
 */
public class Main {
    public static void main(String[] args) {
        Array<Integer> array = new Array<>();
        array.add(0, 3);
        array.addFirst(1);
        System.out.println(array);
    }
}