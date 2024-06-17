// LeetCode 1: Two Sum
// Reference: https://leetcode.com/problems/two-sum/solutions/234005/neat-javascript-map-o-n/?envType=study-plan-v2&envId=top-interview-150


// Using ES6 data structure Map. Time complexity is O(n).

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = new Map();

    for (let i = 0; i < nums.length; i++){
        if (map.has(target - nums[i])){
            return [map.get(target - nums[i]), i];
        } else {
            map.set(nums[i], i);
        }
    }
    return [];
    
};