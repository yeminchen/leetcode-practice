package Leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {

    }
}

class Solution35 {
    public int searchInsert(int[] nums, int target) {
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
        return left;
    }
}
