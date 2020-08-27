package datastructure.ch01_arrays.ch03_add_element_in_array;

/**
 * @author guodd
 * @version 1.0
 * 数组的插入操作
 */
public class Main {
    public static void main(String[] args) {
        Array array = new Array(10);
        System.out.println(array.getSize());
        array.addLast(1);
        array.addFirst(6);
        array.add(2, 5);
        System.out.println(array);
    }
}