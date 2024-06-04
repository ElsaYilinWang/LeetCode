// Leetcode 55 Jump Game
// Reference: https://leetcode.com/problems/jump-game/solutions/273641/javascript-simple-o-n-greedy-solution/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    let idx = 0;
    let max = 0;
    let target = nums.length - 1;

    while (idx < nums.length){
        max = Math.max(max, idx + nums[idx]);

        if (max >= target){
            return true;
        }

        // the early exit condition
        if (max <= idx && nums[idx] === 0){
            return false;
        }
        idx ++;
    }
    return false;
};