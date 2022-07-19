package Leetcode.array;

import java.util.Arrays;

public class MoveZero {

    public static void main(String[] args) {
        Solution283 solution283 = new Solution283();
        int[] a = new int[]{1,2,0,7,0,5,0,6};
        solution283.moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}

class Solution283 {
    public void moveZeroes(int[] nums) {
        int fastIndex = 0;
        int slowIndex = 0;
        for (; fastIndex < nums.length; fastIndex ++) {
            if (nums[fastIndex] != 0) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        for (; slowIndex < nums.length; slowIndex ++) {
            nums[slowIndex] = 0;
        }
    }
}
