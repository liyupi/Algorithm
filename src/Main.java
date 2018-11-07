import com.yupi.algorithm.leetcode.linkedlist.ListNode;

/**
 * 功能描述：两两交换链表中的节点
 *
 * 思路：递归
 *
 */

public class Main {

    public ListNode swapPairs(ListNode head) {
        if (head != null && head.next != null) {
            ListNode temp = head.next;
            head.next = swapPairs(temp.next);
            temp.next = head;
            return temp;
        }
        return head;
    }

}