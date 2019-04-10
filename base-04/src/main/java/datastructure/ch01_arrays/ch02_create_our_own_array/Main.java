package datastructure.ch01_arrays.ch02_create_our_own_array;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/23 时间:9:13
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main {
    public static void main(String[] args) {
        Array array = new Array(30);
        System.out.println(array.isEmpty());
        System.out.println(array.getCapacity());
        System.out.println(array.getSize());
    }
}