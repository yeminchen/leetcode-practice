package Leetcode.array;

import java.util.Arrays;

public class SortedSquares {

    public static void main(String[] args) {
        Solution977 s = new Solution977();
        int[] a = new int[]{-9, -1, 2, 4, 12};
        int[] b = s.sortedSquares(a);
        System.out.println(Arrays.toString(b));
    }
}

class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        // 前后双指针
        int i = 0;
        int j = nums.length - 1;
        int tag = nums.length - 1;
        while (i <= j) {
            int head = nums[i];
            if (head < 0) {
                head = (int)Math.pow((-head), 2.0);
            } else {
                head = (int)Math.pow(head, 2.0);
            }
            int tail = nums[j];
            if (tail < 0) {
                tail = (int)Math.pow((-tail), 2.0);
            }else {
                tail = (int)Math.pow(tail, 2.0);
            }
            if (head >= tail) {
                result[tag] = head;
                i++;
                tag--;
            } else {
                result[tag] = tail;
                j--;
                tag--;
            }
        }
        return result;
    }
}