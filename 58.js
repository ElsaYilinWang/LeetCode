// LeetCode 58 Length of Last Word
// Reference: https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {string} s
 * @return {number}
 */

// Time O(n), Space O(n)
var lengthOfLastWord = function(s) {
    s = s.trim();

    let length = 0;
    for (let i = s.length - 1; i >= 0; i--){

        if (s[i] !== ' '){
            length ++;

        } else if (length > 0){
            break;
        }
    }
    return length;
};

