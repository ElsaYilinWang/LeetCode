// LeetCode 454 4Sum II
// Reference: https://leetcode.com/problems/4sum-ii/solutions/260070/javascript-solution-0/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @param {number[]} nums3
 * @param {number[]} nums4
 * @return {number}
 */
var fourSumCount = function(nums1, nums2, nums3, nums4) {
    
    const sumTwoList = function(x, y){
        let len = x.length;
        let result = new Map();

        for (let i = 0; i < len; i++){
            for (let j = 0; j < len ; j++){
                let c = x[i] = y[j];
                result.set(c, result.get(c) + 1 || 1);
            }
        }
        return result;
    }
    let sum1 = sumTwoList(nums1, nums2);
    let sum2 = sumTwoList(nums3, nums4);
    let total = 0;

    sum12.forEach(value, key) =>{
        let offset = 0 - key;
        if(sum2.has(offset)){
            total += (sum2.get(offset) * sum1.get(key));
        }
    }

    return total;


};