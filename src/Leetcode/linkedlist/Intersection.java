package Leetcode.linkedlist;

public class Intersection {
}

class Solution02_07 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int countA = 0;
        int countB = 0;
        while (temp1 != null) {
            temp1 = temp1.next;
            countA++;
        }
        while (temp2 != null) {
            temp2 = temp2.next;
            countB++;
        }
        if (countA > countB) {
            temp1 = headA;
            temp2 = headB;
            int gap = countA - countB;
            for (int i = 0; i < gap; i++) {
                temp1 = temp1.next;
            }

        } else {
            int gap = countB - countA;
            temp1 = headA;
            temp2 = headB;
            for (int i = 0; i < gap; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            if (temp1 == temp2) {
                return temp1;
            }
            temp1 =temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}
