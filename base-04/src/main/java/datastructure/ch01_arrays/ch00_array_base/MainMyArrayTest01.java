package datastructure.ch01_arrays.ch00_array_base;

/**
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/5/31 时间:13:01
 * @JDK 1.8
 * @Description 功能模块：MyArray测试主类
 */
public class MainMyArrayTest01 {
    public static void main(String[] args) {
        MyArray arr = new MyArray();
        arr.insertLast(66);
        arr.insertLast(88);
        arr.update(0, 99);

        MyArrayOrder arrayOrder = new MyArrayOrder();
        arrayOrder.insertOrder(33);
        arrayOrder.insertOrder(66);
        arr.display();
        arrayOrder.display();
    }
}
