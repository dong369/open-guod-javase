package datastructure.ch01_arrays.ch04_query_and_update_element;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/23 时间:10:31
 * @JDK 1.8
 * @Description 功能模块：更新元素操作
 */
public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        array.addFirst(12);
        array.addLast(66);
        array.set(0, 66);
        System.out.println(array);
    }
}
