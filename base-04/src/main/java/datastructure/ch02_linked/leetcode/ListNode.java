package datastructure.ch02_linked.leetcode;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/16 时间:9:11
 * @JDK 1.8
 * @Description 功能模块：
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode(int[] arr) {
        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }


}
