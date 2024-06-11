// LeetCode 167 Two Sum II - Input Array is Sorted
// Reference: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int l = 0, r = numbers.length - 1;

        while (numbers[l] + numbers[r] != target){
            if (numbers[l] + numbers[r] < target) l++;
            else r--;
        }

        return new int[] {l+1, r+1};
        
    }
}


