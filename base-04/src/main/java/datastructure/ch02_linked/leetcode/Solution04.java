package datastructure.ch02_linked.leetcode;

/**
 * @author guodd
 * @version 1.0
 */
public class Solution04 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
