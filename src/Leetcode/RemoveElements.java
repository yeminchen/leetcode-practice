package Leetcode;

public class RemoveElements {
    public static void main(String[] args) {
        Solution27 s = new Solution27();
        System.out.println(s.removeElement(new int[]{1,4,2,5,2,6}, 2));
    }
}

class Solution27{
    public int removeElement(int[] nums, int val) {
        int fastIndex = 0;
        int slowIndex;
        for (slowIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
