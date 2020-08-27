package datastructure.ch02_linked.leetcode;

/**
 * @author guodd
 * @version 1.0
 */
public class Solution03 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        // 子过程的宏观语义是：删除值为val的节点
        ListNode node = removeElements(head.next, val);
        if (head.val == val) {
            return node;
        } else {
            head.next = node;
            return head;
        }
    }
}
