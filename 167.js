// LeetCode 167 Two Sum II - Input Array is Sorted
// Reference: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/solutions/376245/cleanest-js/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    let p1 = 0;
    let p2 = numbers.length - 1;

    while (numbers[p1] + numbers[p2] !== target){
        if (numbers[p1] + numbers[p2] > target){
            p2--;
        } else {
            p1++;
        }
    }

    return [p1 + 1, p2 + 1];

    
};