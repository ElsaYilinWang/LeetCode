// LeetCode 34 Find First and Last Position of Element in Sorted Array
// Reference: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
        
    }
    private int findFirst(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) {
                idx = mid;
            }
        }
        return idx;
    }

    private int findLast(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end)/2;
            if(nums[mid] <= target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if(nums[mid] == target){
                idx = mid;
            }
        }
        return idx;
    }

}