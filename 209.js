// LeetCode 209 Minimum Size Subarray Sum
// Reference: https://leetcode.com/problems/minimum-size-subarray-sum/solutions/658110/javascript-clean-o-n-sliding-window-solution/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function(target, nums) {
    // Sliding window
    let left = 0, right = 0, sum = 0, result = 0;

    while (right < nums.length){

        sum += nums[right];

        while (sum >= target){

            let len = right - left + 1;
            if (result == 0 || len < result) 
                    result = len;
            sum -= nums[left];
            left++
        }

        right++;
    }

    return result;
    
};