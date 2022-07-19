package Leetcode;

import java.util.Arrays;

public class minSubArrayLen {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7};
        Solution209 s = new Solution209();
        int b = s.minSubArrayLen(11,a);
        System.out.println(b);
    }
}


class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                int len = j - i + 1;
                if (len < result) {
                    result = len;
                }
                sum -= nums[i];
                i++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}