package Leetcode;

public class BinarySearch {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{1,2,3,4}, 4));
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length -1;
        int left = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }
}