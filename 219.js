// LeetCode 219 Contains Duplicate II
// Reference: https://leetcode.com/problems/contains-duplicate-ii/solutions/2463150/very-easy-100-fully-explained-java-c-python-javascript-python3-using-hashset/?envType=study-plan-v2&envId=top-interview-150

// Time Complexity: O(n)
// Space Complexity: O(n)

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function(nums, k) {
    const hashmap = new Map();

    for (let idx = 0; idx< nums.length; idx++){

        // Check if the difference between duplicates is less than k
        if (idx - hashmap.get(nums[idx]) <= k){
            return true;
        }
        hashmap.set(nums[idx], idx);
    }
    return false;
    
};