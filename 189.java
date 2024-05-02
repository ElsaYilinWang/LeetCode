// Leetcode 189 Rotate Array
// Reference: https://leetcode.com/problems/rotate-array/solutions/54250/easy-to-read-java-solution/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
