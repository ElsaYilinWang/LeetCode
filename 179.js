// LeetCode 179 largest Number
// Reference: https://leetcode.com/problems/largest-number/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/**
 * @param {number[]} nums
 * @return {string}
 */
var largestNumber = function(nums) {

    if ( !nums || nums.length === 0){
        return '0';
    }

    nums.sort((a, b) => `${b}${a}` - `${a}${b}`);

    if(nums[0] === 0){
        return '0';
    }

    return nums.join('');
    
};