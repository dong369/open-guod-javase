package datastructure.ch09_segment.main;


import datastructure.ch09_segment.ch02_segment_query.SegmentTree;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Integer[] nums = {-2, 0, 3, -5, 2, -1};

        SegmentTree<Integer> segTree = new SegmentTree<>(nums,
                (a, b) -> a + b);
        System.out.println(segTree.query(0, 4));
    }
}
