// LeetCode 11 Container with Most Water
// Reference: https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    // Two pointers
    let result = 0, left = 0, right = height.length - 1;

    while (left < right){
        let smallestSide = Math.min(height[left], height[right]);
        let area = (right - left) * smallestSide;

        if (area > result) result = area;

        if (height[left] < height[right]) left++;
        else right--;
    }
    
    return result;
};

