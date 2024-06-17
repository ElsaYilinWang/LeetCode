// LeetCode 1: Two Sum
// Reference: https://leetcode.com/problems/two-sum/solutions/2671539/java-100-runtime-easy-to-understand/?envType=study-plan-v2&envId=top-interview-150

import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        int[] result = new int[2];

        for (int i = 0; i < n; i++){
            if (map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}