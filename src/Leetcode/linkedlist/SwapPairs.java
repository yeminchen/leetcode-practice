package Leetcode.linkedlist;

public class SwapPairs {
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode cur = dummyNode;
        ListNode temp1 = null;
        ListNode temp2 = null;
        while ( cur.next != null && cur.next.next != null) {
            temp1 = cur.next;
            temp2 = cur.next.next.next;
            cur.next = cur.next.next;
            cur.next.next = temp1;
            temp1.next = temp2;

            cur = cur.next.next;
        }
        return dummyNode.next;

    }
}