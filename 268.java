// LeetCode 268
// Reference: https://leetcode.com/problems/missing-number/solutions/69786/3-different-ideas-xor-sum-binary-search-java-code/?source=submission-ac

import java.util.Arrays;

class Solution {

    // XOR
    public int missingNumber(int[] nums) { //xor
        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }

    // SUM
    public int missingNumber2(int[] nums) { //sum
        int len = nums.length;
        int sum = (0+len)*(len+1)/2;
        for(int i=0; i<len; i++)
            sum-=nums[i];
        return sum;
    }
    
    // Binary Search

    public int missingNumber3(int[] nums){
        Arrays.sort(nums);
        int left = 0, right = nums.length, mid = (left + right) / 2;

        while(left < right){
            mid = (left + right) / 2;

            if (nums[mid] > mid){
                right = mid;

            } else {

                left = mid + 1;

            }
        }
        return left;
    }

}
