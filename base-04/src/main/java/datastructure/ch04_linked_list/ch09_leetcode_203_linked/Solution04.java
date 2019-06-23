package datastructure.ch04_linked_list.ch09_leetcode_203_linked;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/23 时间:14:13
 * @JDK 1.8
 * @Description 功能模块：
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
