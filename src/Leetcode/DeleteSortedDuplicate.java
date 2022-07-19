package Leetcode;

import java.util.Arrays;

public class DeleteSortedDuplicate {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,1,4,5,2,7};
        Solution26 s = new Solution26();
        System.out.println(s.removeDuplicates(a));
        System.out.println(Arrays.toString(a));
    }
}

/**
 * 没看清升序函数，这方法实际上可以适用于任意数组
 */
class Solution26 {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        int i = 0;
        while (i < size) {
            int val = nums[i];
            int fastIndex = i + 1;
            int slowIndex = i + 1;
            for (;fastIndex < size; fastIndex++) {
                if (nums[fastIndex] != val) {
                    nums[slowIndex] = nums[fastIndex];
                    slowIndex ++;
                }
            }
            // 此时 实际长度就是slowIndex;
            size = slowIndex;
            i++;
        }
        return size;

    }
}