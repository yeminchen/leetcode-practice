package Leetcode.linkedlist;

import java.util.HashMap;

public class DetectCycle {
}

class Solution142 {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> hashMap = new HashMap<>();
        ListNode cur = head;
        int index = 0;
        while (cur != null) {
            if (!hashMap.containsKey(cur)) {
                hashMap.put(cur, index);
            } else {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
}