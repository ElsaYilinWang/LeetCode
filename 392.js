// LeetCode 392 Is Subsequence
// Reference: https://leetcode.com/problems/is-subsequence/solutions/4074367/93-76-two-pointers-dp/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
// Two pointers
var isSubsequence = function(s, t){
    let i = 0, j = 0;
    while (i < s.length && j < t.length){
        if (s[i] === t[j]){
            i++;
        }
        j++;
    }
    return i === s.length;
}
