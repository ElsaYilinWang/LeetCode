// LeetCode 162 Find Peak element
// Reference: https://leetcode.com/problems/find-peak-element/solutions/692986/javascript-simple-binary-and-linear-search/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/**
 * @param {number[]} nums
 * @return {number}
 */
var findPeakElement = function(nums) {
    // Binary Search 
    // Time O(logN)
    let left = 0, right = nums.length-1, mid;

    while (left < right){
        mid = Math.floor((right + left)/2);
        if(nums[mid] > nums[mid+1]) right = mid;
        else left = mid + 1;
    }
    return left;
    
};

var findPeakElement2 = function(nums){
    // Linear Search
    // Time O(N)
    for(let i = 0; i < nums.length; i++){
        if(nums[i] > nums[i+1]) return i;
    }
    return nums.length-1;

}