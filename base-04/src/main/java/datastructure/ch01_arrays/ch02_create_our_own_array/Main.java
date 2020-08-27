package datastructure.ch01_arrays.ch02_create_our_own_array;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * 二次封装
 */
public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        System.out.println(array.isEmpty());
        System.out.println(array.getCapacity());
        System.out.println(array.getSize());
    }
}