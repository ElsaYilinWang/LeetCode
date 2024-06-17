// LeetCode 49 Group Anagrams
// Reference: https://leetcode.com/problems/group-anagrams/solutions/718955/three-js-solutions/?envType=study-plan-v2&envId=top-interview-150
/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    let res = {};
    for (let str of strs){

        let count = new Array(26).fill(0);

        for (let char of str) 
            count[char.charCodeAt() - 97]++;

        let key = count.join("#");

        res[key] ? res[key].push(str) : res[key] = [str];
    }

    return Object.values(res);
};

// Time Complexity: O(n*k) where n is the size of input array and k is the maximum length of string in input array
// Space Complexity: O(n)
