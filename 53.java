// LeetCode 53
// Reference: https://leetcode.com/problems/maximum-subarray/solutions/1595097/java-kadane-s-algorithm-explanation-using-image/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;, sum = 0;

        for (int i = 0; i < n; i++){
            sum += nums[i];
            max = Math.max(sum, max);

            if (sum < 0) {sum = 0;}
        }

        return max;
    }
}