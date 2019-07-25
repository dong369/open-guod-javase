package datastructure.ch02_linked.ch09_leetcode_203_linked;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/6/16 时间:9:11
 * @JDK 1.8
 * @Description 功能模块：
 */
public class Solution01 {
    public ListNode removeElements(ListNode head, int val) {
        // 01如果head值就是val,且不是空进行删除操作，如果删除后新的节点值也是val，所以需要循环
        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }
        // 02如果经过01步骤元素全部删除了，直接返回
        if (head == null) {
            return null;
        }
        // 03进行不是头节点的删除
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }
}
