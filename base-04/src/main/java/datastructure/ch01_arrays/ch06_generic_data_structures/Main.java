package datastructure.ch01_arrays.ch06_generic_data_structures;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/1/23 时间:10:34
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main {
    public static void main(String[] args) {
        Array<String> array = new Array<>();
        array.addFirst("1");
        array.addFirst("2");
        array.addFirst("3");
        System.out.println(array);
    }

}
