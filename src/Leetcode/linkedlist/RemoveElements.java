package Leetcode.linkedlist;

public class RemoveElements {
}


class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while (cur.next != null) {
            ListNode next = cur.next;
            int nextValue = next.val;
            if (nextValue == val) {
                if (next.next != null) {
                    cur.next = next.next;
                } else {
                    cur.next = null;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummyHead.next;
    }
}