package datastructure.ch01_arrays.ch03_add_element_in_array;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/23 时间:9:22
 * @JDK 1.8
 * @Description 功能模块：数组的插入操作
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