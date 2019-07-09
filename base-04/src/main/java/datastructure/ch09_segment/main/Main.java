package datastructure.ch09_segment.main;


import datastructure.ch09_segment.ch02_segment_query.SegmentTree;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/7/9 时间:8:57
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Main {
    public static void main(String[] args) {
        Integer[] nums = {-2, 0, 3, -5, 2, -1};

        SegmentTree<Integer> segTree = new SegmentTree<>(nums,
                (a, b) -> a + b);
        System.out.println(segTree.query(0, 4));
    }
}
