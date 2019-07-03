package datastructure.ch02_linked_list.ch09_leetcode_203_linked;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/23 时间:10:07
 * @JDK 1.8
 * @Description 功能模块：
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
