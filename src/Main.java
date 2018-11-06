import com.yupi.algorithm.leetcode.linkedlist.ListNode;

/**
 * 功能描述：找链表的中间节点
 */

public class Main {

    public ListNode middleNode(ListNode head) {
        ListNode faster = head;
        ListNode slower = head;
        while (faster != null && faster.next != null) {
            faster = faster.next;
            faster = faster.next;
            slower = slower.next;
        }
        return slower;
    }

}