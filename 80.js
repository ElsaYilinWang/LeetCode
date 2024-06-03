// LeetCode 80 Remove Duplicates from Sorted Array II
// Reference: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let j = 2;

    for (let i = 2; i < nums.length; i++){
        if (nums[i] !== nums[j-2]){
            nums[j++] = nums[i];
        }
    }

    return j;
    
};
        