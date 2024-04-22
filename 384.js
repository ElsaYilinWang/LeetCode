// Leetcode 384 Shuffle an Array
// Reference:  https://leetcode.com/problems/shuffle-an-array/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/**
 * @param {number[]} nums
 */
var Solution = function(nums) {
    this.nums = nums;
    this.original = nums.slice();
};

/**
 * @return {number[]}
 */
Solution.prototype.reset = function() {
    return this.original;
    
};

/**
 * @return {number[]}
 */
Solution.prototype.shuffle = function() {
    this.nums.sort((a,b) => {
        if(Math.random() > 0.5) return 1;
        else return -1;
    })

    return this.nums;
    
};

/** 
 * Your Solution object will be instantiated and called as such:
 * var obj = new Solution(nums)
 * var param_1 = obj.reset()
 * var param_2 = obj.shuffle()
 */