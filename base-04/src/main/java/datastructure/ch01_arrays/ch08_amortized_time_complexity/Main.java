package datastructure.ch01_arrays.ch08_amortized_time_complexity;

import datastructure.ch01_arrays.ch07_dynamic_array.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guodd
 * @version 1.0
 * 性能测试
 */
public class Main {
    public static void main(String[] args) {
        Array<Integer> array = new Array<>();
        array.add(0, 3);
        array.addFirst(1);
        System.out.println(array);

        List<String> a = new ArrayList<>();
    }
}