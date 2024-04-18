//Leetcode 128 Longest Consecutive Sequence
// Reference: https://leetcode.com/problems/longest-consecutive-sequence/solutions/139940/simple-javascript-o-n-solution/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
    // HashSet Time O(n) Space O(n)
    if (nums == null || nums.length === 0) return 0;

    const set = new Set(nums);
    let max = 0;

    for (let num of set){
        if (set.has(num - 1)) continue;
        // make sure starting from the beginning of sequence

        let currNum = num;
        let currMax = 1;

        while (set.has(currNum + 1)){
            currNum ++;
            currMax ++;
        }
        max = Math.max(max, currMax);

    }
    return max;
};