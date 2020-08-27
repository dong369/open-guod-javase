package datastructure.ch01_arrays.ch06_generic_data_structures;

/**
 * @author guodd
 * @version 1.0
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
