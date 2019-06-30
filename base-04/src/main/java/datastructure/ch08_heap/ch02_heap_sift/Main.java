package datastructure.ch08_heap.ch02_heap_sift;

import java.util.Random;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/26 时间:22:06
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main {
    public static void main(String[] args) {
        int n = 10000;
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            maxHeap.add(random.nextInt(Integer.MAX_VALUE));
        }
    }
}
