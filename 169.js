// Leetcode 169 Majority Element
// Reference: https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150

// Using Moore’s Voting Algorithm
/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    // Initialize sol and cnt to store the solution and its frequency for respective iterations...
    let sol = 0, cnt = 0;

    // For every element i in the array...
    for (let i = 0; i < nums.length; i++){
        // If cnt is equal to zero, update sol as sol = i
        if (cnt == 0){
            sol = nums[i];
            cnt = 1;
        }
        // If i is equal to candidate, increment cnt...
        else if(sol == nums[i]){
            cnt++;
        }
        // Otherwise, decrement cnt...
        else{
            cnt--;
        }
        // Return & print the solution...
        return sol;
    }
};