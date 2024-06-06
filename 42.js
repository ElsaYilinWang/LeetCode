// LeetCode 42 Trapping Rain Water
// Reference: https://leetcode.com/problems/trapping-rain-water/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function(height) {
    // Two pointers
    // Time O(n)
    // Space O(1)
    if (height == null || height.length === 0) return 0;

    let l = 0;
    let r = height.length -1;

    let lMax = 0;
    let rMax = 0;

    let res = 0;

    while (l < r){
        lMax = Math.max(lMax, height[l]);
        if (height[l] < lMax){
            res += lMax - height[l];
        }

        rMax = Math.max(rMax, height[r]);
        if (height[r] < rMax){
            res += rMax - height[r];
        }

        height[l] < height[r] ? l++ : r--;
    }
    
    return res;
};

