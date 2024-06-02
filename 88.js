//LeetCode 88
// Reference: https://leetcode.com/problems/merge-sorted-array/solutions/4722196/simple-beginner-friendly-dry-run-two-pointer-loops-time-o-m-n-space-o-1-gits/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    if (n === 0) return;

    let len1 = nums1.length;
    let end_idx = len1 - 1;

    while (n > 0 && m > 0){
        if (nums2[n-1] >= nums1[m-1]){

            nums1[end_idx] = nums2[n-1];
            n--;
        } else {
            nums1[end_idx] = nums1[m-1];
            m--;
    }

    end_idx--;
    }

    while (n > 0){
        nums1[end_idx] = nums2[n-1];
        n--;
        end_idx--;
    }
};