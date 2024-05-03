// Leetcode 198 House Robber
// Reference: https://leetcode.com/problems/house-robber/solutions/1491888/javascript-from-noob-to-pro/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    // O(n) time | O(1) space
    let robbedIdxPlus1 = 0;
    let robbedIdxPlus2 = 0;

    for (let i = nums.length - 1; i >= 0; i--){
        const sumIfSkipped = robbedIdxPlus1;
        const sumIfRobbed = nums[i] + robbedIdxPlus2;
        
        const maxRobbedAtIdx = Math.max(sumIfSkipped, sumIfRobbed);
        
        robbedIdxPlus2 = robbedIdxPlus1;
        robbedIdxPlus1 = maxRobbedAtIdx;
    }

    return robbedIdxPlus1
    
};

