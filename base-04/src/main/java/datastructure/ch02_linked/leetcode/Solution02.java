package datastructure.ch02_linked.leetcode;

/**
 * @author guodd
 * @version 1.0
 */
public class Solution02 {
    public ListNode removeElements(ListNode head, int val) {
        // 01创建虚拟头节点
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        // 02
        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }
}
